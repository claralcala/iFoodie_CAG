package es.iescarrillo.ifoodie_cag.ifoodie_cag.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import es.iescarrillo.ifoodie_cag.R;

public class WelcomeActivity extends AppCompatActivity {

    TextView tvSign;
    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tvSign = findViewById(R.id.tvSign);

        tvSign.setOnClickListener(v -> {
            Intent sign = new Intent (this, LoginActivity.class);
            startActivity(sign);


        });

        btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(v -> {
            Intent register = new Intent(this, SignUpActivity.class);
            startActivity(register);
        });




    }
}
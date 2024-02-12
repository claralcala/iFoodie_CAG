package es.iescarrillo.ifoodie_cag.ifoodie_cag.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import es.iescarrillo.ifoodie_cag.R;

public class SignUpActivity extends AppCompatActivity {

    private Button btnSign;
    private TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSign = findViewById(R.id.btnSign);
        btnSign.setOnClickListener(v -> {
            Intent sign = new Intent (this, VerificationCodeActivity.class);
            startActivity(sign);
        });

        login = findViewById(R.id.tvLogin);
        login.setOnClickListener(v -> {
            Intent login = new Intent(this, LoginActivity.class);
            startActivity(login);
        });


    }
}
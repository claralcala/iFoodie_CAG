package es.iescarrillo.ifoodie_cag.ifoodie_cag.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import es.iescarrillo.ifoodie_cag.R;

public class VerificationCodeActivity extends AppCompatActivity {

    ImageView back;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code);

        back = findViewById(R.id.imgBack);

        back.setOnClickListener(v -> {
            Intent back = new Intent (this, SignUpActivity.class);
            startActivity(back);
        });

        send = findViewById(R.id.btnSign);

        send.setOnClickListener(v -> {
            Intent sign = new Intent(this, RegistrationActivity.class);
            startActivity(sign);
        });
    }
}
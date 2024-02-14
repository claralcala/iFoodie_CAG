package es.iescarrillo.ifoodie_cag.ifoodie_cag.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import es.iescarrillo.ifoodie_cag.R;

public class LoginActivity extends AppCompatActivity {

    Button login;
    ImageView back;

    TextView tvPassword, tvSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.btnLogin);
        back = findViewById(R.id.ivBack);
        tvPassword =findViewById(R.id.tvForgotpass);
        tvSign =findViewById(R.id.tvSignUp);

        login.setOnClickListener(v -> {
            Intent main = new Intent (this, MainActivity.class);
            startActivity(main);
        });

        back.setOnClickListener(v -> {
            Intent back = new Intent (this, WelcomeActivity.class);
            startActivity(back);
        });

        tvPassword.setOnClickListener(v -> {
            Intent pass = new Intent(this, ResetPasswordActivity.class);
            startActivity(pass);
        });

        tvSign.setOnClickListener(v -> {
            Intent sign = new Intent(this, SignUpActivity.class);
            startActivity(sign);
        });
    }
}
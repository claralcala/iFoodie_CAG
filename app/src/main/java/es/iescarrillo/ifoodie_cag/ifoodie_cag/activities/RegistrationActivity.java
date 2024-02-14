package es.iescarrillo.ifoodie_cag.ifoodie_cag.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import es.iescarrillo.ifoodie_cag.R;

public class RegistrationActivity extends AppCompatActivity {

    private ImageView back;

    private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        back = findViewById(R.id.imBack);

        back.setOnClickListener(v -> {
            Intent back = new Intent (this, VerificationCodeActivity.class);
            startActivity(back);
        });

        send =findViewById(R.id.btnSend);
        send.setOnClickListener(v -> {
            Intent send = new Intent (this, MainActivity.class);
            startActivity(send);
        });
    }
}
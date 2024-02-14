package es.iescarrillo.ifoodie_cag.ifoodie_cag.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import es.iescarrillo.ifoodie_cag.R;

public class ResetPasswordActivity extends AppCompatActivity {

    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        back = findViewById(R.id.ivgoBack);

        back.setOnClickListener(v -> {
            Intent back = new Intent (this, LoginActivity.class);
            startActivity(back);
        });




    }
}
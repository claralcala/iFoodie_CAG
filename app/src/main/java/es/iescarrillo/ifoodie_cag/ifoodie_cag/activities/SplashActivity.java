package es.iescarrillo.ifoodie_cag.ifoodie_cag.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import es.iescarrillo.ifoodie_cag.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent main = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(main);
            }
        }, 2000);
    }
}
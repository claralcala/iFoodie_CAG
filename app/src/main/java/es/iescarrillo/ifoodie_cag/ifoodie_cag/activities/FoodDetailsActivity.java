package es.iescarrillo.ifoodie_cag.ifoodie_cag.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import es.iescarrillo.ifoodie_cag.R;

public class FoodDetailsActivity extends AppCompatActivity {

    private ImageView imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

    imgBack = findViewById(R.id.imgviewback);

    imgBack.setOnClickListener(v -> {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    });

    }
}
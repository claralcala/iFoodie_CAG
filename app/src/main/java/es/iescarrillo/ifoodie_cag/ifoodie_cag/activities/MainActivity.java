package es.iescarrillo.ifoodie_cag.ifoodie_cag.activities;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;


import es.iescarrillo.ifoodie_cag.R;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadComponents();
        //metodo para indicar que el toolbar hara la funcion de barra de acciones
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_menu, R.string.close_menu);

        //Listener para capturar los eventos que se produzcan en el menu lateral
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        //Evento para sincronizar el estado del boton hamburguesa con el estado del menu lateral

        actionBarDrawerToggle.syncState();
    }

    private void loadComponents(){
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar=findViewById(R.id.toolbar);
    }
}
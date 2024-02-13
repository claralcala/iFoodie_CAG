package es.iescarrillo.ifoodie_cag.ifoodie_cag.activities;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import es.iescarrillo.ifoodie_cag.R;
import es.iescarrillo.ifoodie_cag.ifoodie_cag.fragments.Cart_Fragment;
import es.iescarrillo.ifoodie_cag.ifoodie_cag.fragments.FavouritesFragment;
import es.iescarrillo.ifoodie_cag.ifoodie_cag.fragments.HomeFragment;
import es.iescarrillo.ifoodie_cag.ifoodie_cag.fragments.MyOrdersFragment;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    private Toolbar toolbar;

    private NavigationView menu;

    private Fragment fragment;

    private BottomNavigationView bottom_menu;

    int selectedColor;



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

        fragment=new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment, fragment).commit();


        menu.setNavigationItemSelectedListener(item -> {
            if(item.getItemId() == R.id.my_orders){

                fragment = new MyOrdersFragment();


            }else if (item.getItemId() == R.id.my_profile){
                Log.i("menu", "Has pinchado en el perfil del usuario (no había que hacerlo");
            }

            //Metodo para cargar el fragment
            getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment, fragment).commit();

            //Cargamos el fragment y cerramos el drawer
            drawerLayout.closeDrawers();
            return true;

        });


        selectedColor = R.color.orange;
        bottom_menu.setOnNavigationItemSelectedListener(item -> {
            if(item.getItemId() == R.id.favourites){
                fragment = new FavouritesFragment();
                item.getIcon().setTint(selectedColor);

            }else if (item.getItemId() == R.id.item_1){
                fragment = new HomeFragment();
            }else if (item.getItemId() == R.id.shopping_cart){
                fragment = new Cart_Fragment();
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment, fragment).commit();
            drawerLayout.closeDrawers();
            return true;
        });
    }

    private void loadComponents(){
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar=findViewById(R.id.toolbar);
        menu= findViewById(R.id.nvMenu);

        bottom_menu =findViewById(R.id.bottom_navigation);

    }
}
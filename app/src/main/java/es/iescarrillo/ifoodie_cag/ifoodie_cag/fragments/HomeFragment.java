package es.iescarrillo.ifoodie_cag.ifoodie_cag.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import es.iescarrillo.ifoodie_cag.R;
import es.iescarrillo.ifoodie_cag.ifoodie_cag.adapters.CategoryAdapter;
import es.iescarrillo.ifoodie_cag.ifoodie_cag.models.Category;


public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    // TODO: Rename and change types of parameters

private RecyclerView recyclerView;
private CategoryAdapter categoryAdapter;


    public HomeFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //Obtengo el recyclerview de la vista
        recyclerView = view.findViewById(R.id.rv_categories);

        List<Category> categories = new ArrayList<>();
        categories.add(new Category("Burger", R.drawable.img_burguer));
        categories.add(new Category("Donut", R.drawable.img_donut));
        categories.add(new Category("Pizza", R.drawable.img_pizza_r));
        categories.add(new Category("Hot Dog", R.drawable.img_mexican));
        categories.add(new Category("Sandwich", R.drawable.img_asian));
        categories.add(new Category("I.Cream", R.drawable.img_icecream));



        //Inicializar el adapter
        categoryAdapter = new CategoryAdapter(getContext(), categories);
        recyclerView.setAdapter(categoryAdapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);


        //Metodo en el que le vamos a pasar una variable de tipo LayoutManager que es el que me va a dejar
        //indicar que tiene que mostrarse en horizontal
        recyclerView.setLayoutManager(layoutManager);


        return view;
    }
}
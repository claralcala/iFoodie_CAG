package es.iescarrillo.ifoodie_cag.ifoodie_cag.fragments;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import es.iescarrillo.ifoodie_cag.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FavouritesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class FavouritesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    private View view;

    public FavouritesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FavouritesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FavouritesFragment newInstance(String param1, String param2) {
        FavouritesFragment fragment = new FavouritesFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view= inflater.inflate(R.layout.fragment_favourites, container, false);
        RadioButton btnFood, btnRestaurants;

        int orangeColor=R.color.orange;
        btnFood= (RadioButton) view.findViewById(R.id.rbFood);
        btnRestaurants =(RadioButton)view.findViewById(R.id.rbRestaurants);

        btnRestaurants.setOnClickListener(v -> {
            btnFood.setBackgroundResource(R.drawable.rounded_button_white);
            btnFood.setTextColor(ContextCompat.getColor(getContext(), R.color.orange));
            btnRestaurants.setBackgroundResource(R.drawable.rounded_button_orange);
            btnRestaurants.setTextColor(ContextCompat.getColor(getContext(), R.color.white));

        });


        btnFood.setOnClickListener(v -> {
            btnFood.setBackgroundResource(R.drawable.rounded_button_orange);
            btnFood.setTextColor(ContextCompat.getColor(getContext(), R.color.white));
            btnRestaurants.setBackgroundResource(R.drawable.rounded_button_white);
            btnRestaurants.setTextColor(ContextCompat.getColor(getContext(), R.color.orange));
        });


        return view;
    }
}
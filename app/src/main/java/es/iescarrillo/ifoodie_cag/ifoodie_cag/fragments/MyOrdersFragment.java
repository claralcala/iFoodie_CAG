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
 * Use the {@link MyOrdersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyOrdersFragment extends Fragment {

    View view;

    public MyOrdersFragment() {
        // Required empty public constructor
    }


    public static MyOrdersFragment newInstance(String param1, String param2) {
        MyOrdersFragment fragment = new MyOrdersFragment();
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


        view=inflater.inflate(R.layout.fragment_my_orders, container, false);
        RadioButton btnUpcoming, btnHistory;

        int orangeColor=R.color.orange;
        btnUpcoming= (RadioButton) view.findViewById(R.id.rbUpcoming);
        btnHistory =(RadioButton)view.findViewById(R.id.rbHistory);

        btnHistory.setOnClickListener(v -> {
            btnUpcoming.setBackgroundResource(R.drawable.rounded_button_white);
            btnUpcoming.setTextColor(ContextCompat.getColor(getContext(), R.color.orange));
            btnHistory.setBackgroundResource(R.drawable.rounded_button_orange);
            btnHistory.setTextColor(ContextCompat.getColor(getContext(), R.color.white));

        });


        btnUpcoming.setOnClickListener(v -> {
            btnUpcoming.setBackgroundResource(R.drawable.rounded_button_orange);
            btnUpcoming.setTextColor(ContextCompat.getColor(getContext(), R.color.white));
            btnHistory.setBackgroundResource(R.drawable.rounded_button_white);
            btnHistory.setTextColor(ContextCompat.getColor(getContext(), R.color.orange));
        });
        // Inflate the layout for this fragment
        return view;
    }
}
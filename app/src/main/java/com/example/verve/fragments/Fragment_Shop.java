package com.example.verve.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.verve.Adapters.Adapter_Shop;
import com.example.verve.R;
import com.example.verve.constructors.Constructor_Shop;
import com.example.verve.main;
import com.google.gson.Gson;

import java.util.ArrayList;

public class Fragment_Shop extends Fragment {

    main main;
    public ListView list_view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancesState){

        View v = inflater.inflate(R.layout.fragment_shop, container, false);
        list_view = v.findViewById(R.id.list_message);

        Button b1 = (Button) v.findViewById(R.id.bt1);
        Button b2 = (Button) v.findViewById(R.id.bt2);
        Button b3 = (Button) v.findViewById(R.id.bt3);
        Button b4 = (Button) v.findViewById(R.id.bt4);
        Button b5 = (Button) v.findViewById(R.id.bt5);
        Button b6 = (Button) v.findViewById(R.id.bt6);
        Button b7 = (Button) v.findViewById(R.id.bt7);

        final ArrayList<Constructor_Shop> data = new ArrayList<>();
        data.add(new Constructor_Shop("REKICH", "20$", "Cat", R.drawable.adopt_cat));
        data.add(new Constructor_Shop("SupSun", "30$", "", R.drawable.woman));
        data.add(new Constructor_Shop("Башня", "3$", "", R.drawable.fairy));

        Adapter_Shop adapter_shop = new Adapter_Shop(main, R.layout.shop_maket, data);
        list_view.setAdapter(adapter_shop);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setBackgroundResource(R.drawable.buttonon);
                b2.setBackgroundResource(R.drawable.button);
                b3.setBackgroundResource(R.drawable.button);
                b4.setBackgroundResource(R.drawable.button);
                b5.setBackgroundResource(R.drawable.button);
                b6.setBackgroundResource(R.drawable.button);
                b7.setBackgroundResource(R.drawable.button);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setBackgroundResource(R.drawable.buttonon);
                b1.setBackgroundResource(R.drawable.button);
                b3.setBackgroundResource(R.drawable.button);
                b4.setBackgroundResource(R.drawable.button);
                b5.setBackgroundResource(R.drawable.button);
                b6.setBackgroundResource(R.drawable.button);
                b7.setBackgroundResource(R.drawable.button);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setBackgroundResource(R.drawable.buttonon);
                b2.setBackgroundResource(R.drawable.button);
                b1.setBackgroundResource(R.drawable.button);
                b4.setBackgroundResource(R.drawable.button);
                b5.setBackgroundResource(R.drawable.button);
                b6.setBackgroundResource(R.drawable.button);
                b7.setBackgroundResource(R.drawable.button);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setBackgroundResource(R.drawable.buttonon);
                b2.setBackgroundResource(R.drawable.button);
                b3.setBackgroundResource(R.drawable.button);
                b1.setBackgroundResource(R.drawable.button);
                b5.setBackgroundResource(R.drawable.button);
                b6.setBackgroundResource(R.drawable.button);
                b7.setBackgroundResource(R.drawable.button);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setBackgroundResource(R.drawable.buttonon);
                b2.setBackgroundResource(R.drawable.button);
                b3.setBackgroundResource(R.drawable.button);
                b4.setBackgroundResource(R.drawable.button);
                b1.setBackgroundResource(R.drawable.button);
                b6.setBackgroundResource(R.drawable.button);
                b7.setBackgroundResource(R.drawable.button);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setBackgroundResource(R.drawable.buttonon);
                b2.setBackgroundResource(R.drawable.button);
                b3.setBackgroundResource(R.drawable.button);
                b4.setBackgroundResource(R.drawable.button);
                b5.setBackgroundResource(R.drawable.button);
                b1.setBackgroundResource(R.drawable.button);
                b7.setBackgroundResource(R.drawable.button);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setBackgroundResource(R.drawable.buttonon);
                b2.setBackgroundResource(R.drawable.button);
                b3.setBackgroundResource(R.drawable.button);
                b4.setBackgroundResource(R.drawable.button);
                b5.setBackgroundResource(R.drawable.button);
                b6.setBackgroundResource(R.drawable.button);
                b1.setBackgroundResource(R.drawable.button);
            }
        });

        return v;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        main = (main) context;
    }
}

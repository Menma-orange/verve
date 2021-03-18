package com.example.verve.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.verve.Adapters.Adapter_Shop;
import com.example.verve.R;
import com.example.verve.constructors.Constructor_Shop;
import com.example.verve.main;

import java.util.ArrayList;

public class Fragment_Shop extends Fragment {

    main main;
    public ListView list_view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancesState){

        View v = inflater.inflate(R.layout.fragment_shop, container, false);
        list_view = v.findViewById(R.id.list_message);

        final ArrayList<Constructor_Shop> data = new ArrayList<>();
        data.add(new Constructor_Shop("Menma", "50$", "Orange", R.drawable.verve_logo));
        data.add(new Constructor_Shop("Menma", "50$", "Orange", R.drawable.verve_logo));
        data.add(new Constructor_Shop("Menma", "50$", "Orange", R.drawable.verve_logo));
        data.add(new Constructor_Shop("Menma", "50$", "Orange", R.drawable.verve_logo));

        Adapter_Shop adapter_shop = new Adapter_Shop(main, R.layout.shop_maket, data);
        list_view.setAdapter(adapter_shop);

        return v;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        main = (main) context;
    }
}
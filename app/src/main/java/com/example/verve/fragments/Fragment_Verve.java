package com.example.verve.fragments;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.verve.Adapters.Adapter_Verve;
import com.example.verve.R;
import com.example.verve.constructors.Constructor_Verve;
import com.example.verve.main;

import java.util.ArrayList;


public class Fragment_Verve extends Fragment {

    main main;
    public ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancesState) {

        View v = inflater.inflate(R.layout.fragment_verve, container, false);
        listView = v.findViewById(R.id.list);
        Button b_search = v.findViewById(R.id.search);

        final ArrayList<Constructor_Verve> data = new ArrayList<>();
        data.add(new Constructor_Verve("Don!", "TestTExt", R.drawable.logo_verve_w));
        data.add(new Constructor_Verve("MenmOrange", "Why not", R.drawable.verve_logo));
        data.add(new Constructor_Verve("USer1917", "Red", R.drawable.logo_verve_y));

        Adapter_Verve adapter_verve = new Adapter_Verve(main, R.layout.verve_maket, data);
        listView.setAdapter(adapter_verve);

        return v;
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        main = (main) context;
    }

}

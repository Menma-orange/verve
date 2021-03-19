package com.example.verve.fragments;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;

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

        Button b1 = (Button) v.findViewById(R.id.b1);
        Button b2 = (Button) v.findViewById(R.id.b2);
        Button b3 = (Button) v.findViewById(R.id.b3);
        Button b4 = (Button) v.findViewById(R.id.b4);
        Button b5 = (Button) v.findViewById(R.id.b5);
        Button b6 = (Button) v.findViewById(R.id.b6);
        Button b7 = (Button) v.findViewById(R.id.b7);

        final ArrayList<Constructor_Verve> data = new ArrayList<>();
        data.add(new Constructor_Verve("User1773", "ЧБ, рисунок, посуда", R.drawable.po_bw));
        data.add(new Constructor_Verve("User1917", "ЧБ, референс, посуда", R.drawable.po_wb_art));

        Adapter_Verve adapter_verve = new Adapter_Verve(main, R.layout.verve_maket, data);
        listView.setAdapter(adapter_verve);
        b1.setBackgroundResource(R.drawable.buttonon);

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
                b1.setBackgroundResource(R.drawable.button);
                b2.setBackgroundResource(R.drawable.button);
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
                b1.setBackgroundResource(R.drawable.button);
                b2.setBackgroundResource(R.drawable.button);
                b3.setBackgroundResource(R.drawable.button);
                b5.setBackgroundResource(R.drawable.button);
                b6.setBackgroundResource(R.drawable.button);
                b7.setBackgroundResource(R.drawable.button);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setBackgroundResource(R.drawable.buttonon);
                b1.setBackgroundResource(R.drawable.button);
                b2.setBackgroundResource(R.drawable.button);
                b3.setBackgroundResource(R.drawable.button);
                b4.setBackgroundResource(R.drawable.button);
                b6.setBackgroundResource(R.drawable.button);
                b7.setBackgroundResource(R.drawable.button);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setBackgroundResource(R.drawable.buttonon);
                b1.setBackgroundResource(R.drawable.button);
                b2.setBackgroundResource(R.drawable.button);
                b3.setBackgroundResource(R.drawable.button);
                b4.setBackgroundResource(R.drawable.button);
                b5.setBackgroundResource(R.drawable.button);
                b7.setBackgroundResource(R.drawable.button);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setBackgroundResource(R.drawable.buttonon);
                b1.setBackgroundResource(R.drawable.button);
                b2.setBackgroundResource(R.drawable.button);
                b3.setBackgroundResource(R.drawable.button);
                b4.setBackgroundResource(R.drawable.button);
                b5.setBackgroundResource(R.drawable.button);
                b6.setBackgroundResource(R.drawable.button);
            }
        });

        return v;
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        main = (main) context;
    }

}

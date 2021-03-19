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

public class Fragment_Other extends Fragment {

    com.example.verve.main main;
    public ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancesState) {

        View v = inflater.inflate(R.layout.fragment_other, container, false);
        listView = v.findViewById(R.id.list_other);

        return v;
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        main = (main) context;
    }

}

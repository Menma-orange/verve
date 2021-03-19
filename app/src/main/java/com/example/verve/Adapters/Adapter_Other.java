package com.example.verve.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.verve.R;
import com.example.verve.constructors.Constructor_Message;
import com.example.verve.constructors.Constructor_Other;
import com.example.verve.constructors.Constructor_Shop;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Other extends ArrayAdapter<Constructor_Other> {

    private LayoutInflater inflater;
    private int layout;
    private List<Constructor_Other> object;

    public Adapter_Other(Context context, int resource, List<Constructor_Other> objects){

        super(context, resource, objects);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        object = objects;
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View v = this.inflater.inflate(this.layout, parent, false);

        TextView text = v.findViewById(R.id.text_other);
        ImageView image = v.findViewById(R.id.icons_other);
        Constructor_Other data = this.object.get(position);
        text.setText(data.Option);
        image.setImageResource(data.Icon);

        return v;
    }
}

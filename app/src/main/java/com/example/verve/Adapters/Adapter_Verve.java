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
import com.example.verve.constructors.Constructor_Verve;

import java.util.List;

public class Adapter_Verve extends ArrayAdapter<Constructor_Verve> {

    private LayoutInflater inflater;
    private int layout;
    private List<Constructor_Verve> object;

    public Adapter_Verve( Context context, int resource,  List<Constructor_Verve> objects){

        super(context, resource, objects);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        object = objects;

    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View v = this.inflater.inflate(this.layout, parent, false);

        TextView Nick_name = v.findViewById(R.id.nick_name);
        TextView Text_mess = v.findViewById(R.id.message_text);
        ImageView Art = v.findViewById(R.id.art);
        Constructor_Verve data = this.object.get(position);
        Nick_name.setText(data.Name);
        Text_mess.setText(data.Text);
        Art.setImageResource(data.Img_int);

        return v;
    }
}

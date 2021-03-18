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
import com.example.verve.constructors.Constructor_Shop;

import java.util.List;

public class Adapter_Message extends ArrayAdapter<Constructor_Message> {

    private LayoutInflater inflater;
    private int layout;
    private List<Constructor_Message> object;

    public Adapter_Message(Context context, int resource, List<Constructor_Message> objects){

        super(context, resource, objects);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        object = objects;

    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = this.inflater.inflate(this.layout, parent, false);

        ImageView Ava = v.findViewById(R.id.ava_message);
        TextView Message = v.findViewById(R.id.message_message);
        TextView Name = v.findViewById(R.id.name_message);
        Constructor_Message data = this.object.get(position);
        Ava.setImageResource(data.Ava);
        Message.setText(data.Message);
        Name.setText(data.Nickname);

        return v;
    }
}

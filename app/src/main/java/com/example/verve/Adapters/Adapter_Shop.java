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
import com.example.verve.constructors.Constructor_Shop;
import com.example.verve.constructors.Constructor_Verve;

import java.util.List;

public class Adapter_Shop extends ArrayAdapter<Constructor_Shop> {

    private LayoutInflater inflater;
    private int layout;
    private List<Constructor_Shop> object;

    public Adapter_Shop( Context context, int resource,  List<Constructor_Shop> objects){

        super(context, resource, objects);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        object = objects;

    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View v = this.inflater.inflate(this.layout, parent, false);

        TextView Nick_name_1 = v.findViewById(R.id.nick_name_1);

        TextView Price_1 = v.findViewById(R.id.price_1);

        TextView Art_name_1 = v.findViewById(R.id.art_name_1);

        ImageView Art_1 = v.findViewById(R.id.shop_art_1);

        Constructor_Shop data = this.object.get(position);
        Nick_name_1.setText(data.Name_1);

        Price_1.setText(data.Price_1);

        Art_name_1.setText(data.Art_1);

        Art_1.setImageResource(data.Shop_img_1);

        return v;
    }

}

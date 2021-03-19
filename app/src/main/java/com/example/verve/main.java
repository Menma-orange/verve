package com.example.verve;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.verve.fragments.Fragment_Message;
import com.example.verve.fragments.Fragment_Other;
import com.example.verve.fragments.Fragment_Shop;
import com.example.verve.fragments.Fragment_Verve;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ImageView verve = (ImageView)findViewById(R.id.verve);
        final ImageView shop = (ImageView)findViewById(R.id.shop);
        final ImageView message = (ImageView)findViewById(R.id.message);
        final ImageView other = (ImageView)findViewById(R.id.other);

        Display(0);
        verve.setImageResource(R.drawable.icon_verve_on);

        verve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Display(0);
                verve.setImageResource(R.drawable.icon_verve_on);
                shop.setImageResource(R.drawable.icon_shop_off);
                message.setImageResource(R.drawable.icon_message_off);
                other.setImageResource(R.drawable.icon_other_off);
            }
        });
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display(1);
                verve.setImageResource(R.drawable.icon_verve_off);
                shop.setImageResource(R.drawable.icon_shop_on);
                message.setImageResource(R.drawable.icon_message_off);
                other.setImageResource(R.drawable.icon_other_off);
            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display(2);
                verve.setImageResource(R.drawable.icon_verve_off);
                shop.setImageResource(R.drawable.icon_shop_off);
                message.setImageResource(R.drawable.icon_message_on);
                other.setImageResource(R.drawable.icon_other_off);
            }
        });
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display(3);
                verve.setImageResource(R.drawable.icon_verve_off);
                shop.setImageResource(R.drawable.icon_shop_off);
                message.setImageResource(R.drawable.icon_message_off);
                other.setImageResource(R.drawable.icon_other_on);
            }
        });
    }

    public void Display(int pos) {
        switch (pos) {
            case 0:
                FragmentTransaction FT0 = getSupportFragmentManager().beginTransaction();
                FT0.replace(R.id.FrameTemp, new Fragment_Verve(), new Fragment_Verve().getClass().getName());
                FT0.commit();
                break;
            case 1:
                FragmentTransaction FT1 = getSupportFragmentManager().beginTransaction();
                FT1.replace(R.id.FrameTemp, new Fragment_Shop(), new Fragment_Shop().getClass().getName());
                FT1.commit();
                break;
            case 2:
                FragmentTransaction FT2 = getSupportFragmentManager().beginTransaction();
                FT2.replace(R.id.FrameTemp, new Fragment_Message(), new Fragment_Message().getClass().getName());
                FT2.commit();
                break;
            case 3:
                FragmentTransaction FT3 = getSupportFragmentManager().beginTransaction();
                FT3.replace(R.id.FrameTemp, new Fragment_Other(), new Fragment_Other().getClass().getName());
                FT3.commit();
                break;
        }
    }
}
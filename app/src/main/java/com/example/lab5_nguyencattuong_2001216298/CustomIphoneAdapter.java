package com.example.lab5_nguyencattuong_2001216298;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomIphoneAdapter extends ArrayAdapter {
    Context context;
    int layoutItem;
    ArrayList <Iphone> iphones;

    public CustomIphoneAdapter(@NonNull Context context, int layoutItem, @NonNull ArrayList<Iphone> iphones) {
        super(context, layoutItem, iphones);
        this.context = context;
        this.layoutItem = layoutItem;
        this.iphones = iphones;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Iphone iphone = iphones.get(position);
        if (convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(layoutItem,null);

        }

        TextView tvIdIphone = (TextView) convertView.findViewById(R.id.tvIdIphone);
        tvIdIphone.setText(iphone.getIdIphone());
        TextView tvNameIphone = (TextView) convertView.findViewById(R.id.tvNameIphone);
        tvNameIphone.setText(iphone.getIphoneName());

        return convertView;
    }
}

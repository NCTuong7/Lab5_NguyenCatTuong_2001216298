package com.example.lab5_nguyencattuong_2001216298;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapterFruitSpinner extends BaseAdapter {
    LayoutInflater layoutInflater;
    ArrayList <Fruits> fruitsArrayList;
    int layoutItem;

    public CustomAdapterFruitSpinner(Activity context, ArrayList<Fruits> fruitsArrayList, int layoutItem) {
        this.layoutInflater = context.getLayoutInflater();
        this.fruitsArrayList = fruitsArrayList;
        this.layoutItem = layoutItem;
    }

    @Override
    public int getCount() {

        return this.fruitsArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.fruitsArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruits fruits = fruitsArrayList.get(position);
        View rowView = layoutInflater.inflate(layoutItem,null,true);
        ImageView imgIdHinh = rowView.findViewById(R.id.imgIdHinh);
        imgIdHinh.setImageResource(fruits.getIdImg());
        TextView tvName = (TextView) rowView.findViewById(R.id.tvName);
        tvName.setText(fruits.getFruitName());
        TextView tvPrice = (TextView) rowView.findViewById(R.id.tvPrice);
        tvPrice.setText(String.valueOf(fruits.getFruitPrice()));
        return rowView;
    }
}

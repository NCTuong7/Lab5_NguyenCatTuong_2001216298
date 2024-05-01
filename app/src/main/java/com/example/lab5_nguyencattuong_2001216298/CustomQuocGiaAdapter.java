package com.example.lab5_nguyencattuong_2001216298;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomQuocGiaAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    ArrayList<QuocGia> quocGiaArrayList;
    int layoutItem;

    public CustomQuocGiaAdapter(Activity context, ArrayList quocGiaArrayList, int layoutItem) {
        this.layoutInflater = context.getLayoutInflater();
        this.quocGiaArrayList = quocGiaArrayList;
        this.layoutItem = layoutItem;
    }

    @Override
    public int getCount() {
        return quocGiaArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.quocGiaArrayList.get(position);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        QuocGia quocGia = quocGiaArrayList.get(position);
        View rowView = layoutInflater.inflate(layoutItem,null,true);
        ImageView imgQuocGia4a = (ImageView) rowView.findViewById(R.id.imgQuocGia4a);
        imgQuocGia4a.setImageResource(quocGia.getIdImg());
        TextView tvtenQuocGia = (TextView) rowView.findViewById(R.id.tvTenQuocGia);
        tvtenQuocGia.setText(quocGia.getTenQuocGia());
        return rowView;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}



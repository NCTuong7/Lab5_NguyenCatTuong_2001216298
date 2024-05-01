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

public class CustomListDanhMucDienThoai extends ArrayAdapter {

    Context context;
    int layoutItem;
    ArrayList<Samsung> Samsung;

    public CustomListDanhMucDienThoai(@NonNull Context context, int layoutItem, @NonNull ArrayList<Samsung> Samsung) {
        super(context,layoutItem,Samsung);
        this.context = context;
        this.layoutItem = layoutItem;
        this.Samsung = Samsung;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Samsung samsung = Samsung.get(position);
        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(layoutItem,null);

        }

        TextView tvIdDienThoai = (TextView) convertView.findViewById(R.id.tvIdDienThoai);
        tvIdDienThoai.setText(samsung.getIdSamsung());
        TextView tvNameDienThoai = (TextView) convertView.findViewById(R.id.tvNameDienThoai);
        tvNameDienThoai.setText(samsung.getSamsungName());

        return convertView;
    }
}

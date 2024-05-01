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

public class CustomIpadAdapter extends ArrayAdapter {

    Context context;
    int layoutItem;
    ArrayList <Ipad> ipadArrayList;

    public CustomIpadAdapter(@NonNull Context context, int layoutItem, @NonNull ArrayList<Ipad> ipadArrayList) {
        super(context, layoutItem, ipadArrayList);
        this.context = context;
        this.layoutItem = layoutItem;
        this.ipadArrayList = ipadArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Ipad ipad = ipadArrayList.get(position);

        if (convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(layoutItem,null);

        }

        TextView tvIdIpad = (TextView) convertView.findViewById(R.id.tvIdIpad);
        tvIdIpad.setText(ipad.getIdIpad());
        TextView tvNameIpad = (TextView) convertView.findViewById(R.id.tvNameIpad);
        tvNameIpad.setText(ipad.getIpadName());
        return convertView;
    }
}

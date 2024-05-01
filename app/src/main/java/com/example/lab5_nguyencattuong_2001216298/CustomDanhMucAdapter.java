package com.example.lab5_nguyencattuong_2001216298;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomDanhMucAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    int layoutItem;
    ArrayList <DanhMucSanPham> danhMucSanPhamArrayList;

    public CustomDanhMucAdapter(Activity context, int layoutItem, ArrayList<DanhMucSanPham> danhMucSanPhamArrayList) {
        this.layoutInflater = context.getLayoutInflater();
        this.layoutItem = layoutItem;
        this.danhMucSanPhamArrayList = danhMucSanPhamArrayList;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getCount() {
        return danhMucSanPhamArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return danhMucSanPhamArrayList.get(position);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        DanhMucSanPham danhMucSanPham = danhMucSanPhamArrayList.get(position);
        View rowView = layoutInflater.inflate(layoutItem,null, true);
        TextView tvDanhMuc = (TextView) rowView.findViewById(R.id.tvDanhMuc);
        tvDanhMuc.setText(String .valueOf(danhMucSanPham.getIdSanPham()) + " - " + danhMucSanPham.getTenSanPham());
        return rowView;
    }
}

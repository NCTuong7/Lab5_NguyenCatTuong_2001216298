package com.example.lab5_nguyencattuong_2001216298;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomCountryAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    List <Country> countryList;
    Context context;

    public CustomCountryAdapter( List<Country> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Object getItem(int position) {
        return countryList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder
    {
        ImageView flagView;
        TextView countryNameView;
        TextView populationView;
    }

    public int getMipmapResIdByName (String resName)
    {
        String pkgName = context.getPackageName();

        int resId = context.getResources().getIdentifier(resName,"mipmap",pkgName);
        Log.i("CustomGridView", "Res Name:"+ resName + "==> Res ID = " + resId );
        return resId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null)
        {
            convertView = layoutInflater.inflate(R.layout.grid_layout_item,null);

            holder = new ViewHolder();

            holder.flagView = (ImageView) convertView.findViewById(R.id.imgFlag);
            holder.countryNameView = (TextView) convertView.findViewById(R.id.tvCountryName);
            holder.populationView = (TextView) convertView.findViewById(R.id.tvPopulation);

            convertView.setTag(holder);
        }

        else
        {
            holder  = (ViewHolder) convertView.getTag();
        }

        Country country = this.countryList.get(position);
        holder.countryNameView.setText(country.getCountryName());
        holder.populationView.setText(String.valueOf(country.getPopulation()));

        int imgFlag  = this.getMipmapResIdByName(country.getFlagName());

        holder.flagView.setImageResource(imgFlag);

        return convertView;
    }
}

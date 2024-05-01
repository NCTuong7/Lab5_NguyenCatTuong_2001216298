package com.example.lab5_nguyencattuong_2001216298;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomLanguageAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    List<Language> languages;
    int layoutItem;

    int viewNameId;
    int viewPercentId;


    public CustomLanguageAdapter(Activity conText, List<Language> languages, int layoutItem, int viewNameId, int viewPercentId) {
        this.layoutInflater = conText.getLayoutInflater();
        this.languages = languages;
        this.layoutItem = layoutItem;
        this.viewNameId = viewNameId;
        this.viewPercentId = viewPercentId;
    }

    @Override
    public int getCount() {
        if(languages == null)
            return 0;
        return languages.size();
    }

    @Override
    public long getItemId(int position) {
      Language language = (Language) this.getItem(position);
        return language.getId();
    }

    @Override
    public Object getItem(int position) {
        return languages.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Language language = (Language) getItem(position);

        View rowView =  layoutInflater.inflate(layoutItem,null,true);

        TextView tvItemName = (TextView) rowView.findViewById(viewNameId);
        tvItemName.setText(language.getName());
        TextView tvItemPercent = (TextView) rowView.findViewById(viewPercentId);
        tvItemPercent.setText(String.valueOf(language.getPercent()) + "%");

        return rowView;
    }

}

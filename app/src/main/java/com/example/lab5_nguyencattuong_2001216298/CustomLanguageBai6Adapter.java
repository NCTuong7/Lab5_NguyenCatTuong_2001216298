package com.example.lab5_nguyencattuong_2001216298;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomLanguageBai6Adapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    int lauyoutItem;
    ArrayList<LanguageBai6> languagesBai6ArrayList;

    public CustomLanguageBai6Adapter(Activity context, int lauyoutItem, ArrayList<LanguageBai6> languagesBai6ArrayList) {
        this.layoutInflater = context.getLayoutInflater();
        this.lauyoutItem = lauyoutItem;
        this.languagesBai6ArrayList = languagesBai6ArrayList;
    }

    @Override
    public Object getItem(int position) {
        return languagesBai6ArrayList.get(position);
    }

    @Override
    public int getCount() {
        return languagesBai6ArrayList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LanguageBai6 languageBai6 = languagesBai6ArrayList.get(position);
        View rowView = layoutInflater.inflate(lauyoutItem,null,true);
        ImageView imgLanguage = (ImageView) rowView.findViewById(R.id.imgLanguage);
        imgLanguage.setImageResource(languageBai6.getIdimg());
        TextView tvLanguageName = (TextView) rowView.findViewById(R.id.tvLanguageName);
        tvLanguageName.setText(languageBai6.getNameImg());
        return rowView;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}

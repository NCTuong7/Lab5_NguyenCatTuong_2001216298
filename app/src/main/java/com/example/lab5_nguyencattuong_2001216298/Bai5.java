package com.example.lab5_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Bai5 extends AppCompatActivity {
Spinner spLanguage;
TextView tvSelectLanguage;
List<Language> languages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);
        addControl();
        languages = Language.getLanguage();

        CustomLanguageAdapter customLanguageAdapter = new CustomLanguageAdapter(Bai5.this,languages,R.layout.spinner_item_layout_resource,R.id.tvItemName,R.id.tvItemPercent);

        spLanguage.setAdapter(customLanguageAdapter);
        addEvent();
    }
    void addControl()
    {
        tvSelectLanguage = (TextView) findViewById(R.id.tvSelectLanguage);
        spLanguage = (Spinner) findViewById(R.id.spLanguage);
    }
    void addEvent ()
    {

    }
}
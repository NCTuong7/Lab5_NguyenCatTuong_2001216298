package com.example.lab5_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Bai6 extends AppCompatActivity {

Spinner spLanguageBai6;

CustomLanguageBai6Adapter customLanguageBai6Adapter;
ArrayList <LanguageBai6> languageBai6s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai6);
        addControl();
        languageBai6s = LanguageBai6.getData();
        customLanguageBai6Adapter = new CustomLanguageBai6Adapter(Bai6.this,R.layout.layout_item_language_bai6,languageBai6s);
        spLanguageBai6.setAdapter(customLanguageBai6Adapter);
        addEvent();
    }

    void addControl()
    {

        spLanguageBai6 = (Spinner) findViewById(R.id.spLanguageBai6);
    }

    void addEvent()
    {

    }
}
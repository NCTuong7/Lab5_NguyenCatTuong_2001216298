package com.example.lab5_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Bai1 extends AppCompatActivity {

Spinner spinner_danhmuc;
ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        addControl();
        initData();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,data);
        spinner_danhmuc.setAdapter(adapter);

        addEvent();
    }
    void addControl()
    {
        spinner_danhmuc = (Spinner) findViewById(R.id.spinner_danhmuc);
    }
    void addEvent()
    {
        spinner_danhmuc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Bai1.this, data.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
  private void initData()
    {
        data.add("Jame Smith - (Receptionist)");
        data.add("Michael Gracia - (CEO)");
        data.add("Robert Johnson - (Professional Staff)");
    }

}
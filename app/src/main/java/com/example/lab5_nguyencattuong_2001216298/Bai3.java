package com.example.lab5_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Bai3 extends AppCompatActivity {
    Spinner spQuocGia;
    ArrayList<QuocGia> quocGiaArrayList = new ArrayList<>();
    CustomQuocGiaAdapter adapterQuocGia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        addControl();

        int idHinh [] = {R.drawable.anh,R.drawable.italy,R.drawable.lao,R.drawable.my,R.drawable.phap,R.drawable.sin,R.drawable.thai,R.drawable.vietnam};

        String quocGiaName [] = {"Anh", "Ý","Lào","Mỹ","Pháp","Singapore","Thái Lan","Việt Nam"};

        quocGiaArrayList = QuocGia.iniQuocGia(idHinh,quocGiaName);
        adapterQuocGia = new CustomQuocGiaAdapter(Bai3.this,quocGiaArrayList,R.layout.layout_my_item_quoc_gia);
        spQuocGia.setAdapter(adapterQuocGia);
        addEvent();
    }
    void addControl()
    {
        spQuocGia = (Spinner) findViewById(R.id.spQuocGia);
    }

    void addEvent()
    {

    }
}
package com.example.lab5_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Bai2 extends AppCompatActivity {

    Spinner spinner_Company, spinner_TraiCay;

    ArrayList<String> data = new ArrayList<>();

    RecyclerView  recyclerView;
    ArrayList<Fruits> fruitsArrayList = new ArrayList<>();

    ArrayList<String> tenTruongArrayList = new ArrayList<>();

    ArrayAdapter adapterTenTruong;

    CustomAdapterFruitSpinner adapterFruitSpinner;

    int [] lsIdImg = new int[] {R.drawable.apple,R.drawable.banana,R.drawable.litchi,R.drawable.mango,R.drawable.pineapple};
    String [] lsName = new String[] {"Táo","Chuối","Dâu","Xoài","Thơm"};

    String [] lsTruong = new String[] {"fpt", "Vin Group", "Apple","Amazone","TestLa","Samsung"};

    int[] lsPrice = new int[] {60,12,30,20,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        addControl();

        fruitsArrayList = Fruits.iniArrayListFruit(lsIdImg,lsName,lsPrice);
        adapterFruitSpinner = new CustomAdapterFruitSpinner(Bai2.this,fruitsArrayList,R.layout.layout_my_item_fruits);
        spinner_TraiCay.setAdapter(adapterFruitSpinner);

        addItemTenTruong();
        adapterTenTruong = new ArrayAdapter(Bai2.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,tenTruongArrayList);
        spinner_Company.setAdapter(adapterTenTruong);
        addEvent();
    }
    void addControl()
    {
        spinner_Company = (Spinner) findViewById(R.id.spinner_Company);
        spinner_TraiCay = (Spinner) findViewById(R.id.spinner_TraiCay);
    }


    void addEvent()
    {

    }

    void addItemTenTruong()
    {

        for (String s : lsTruong)
            tenTruongArrayList.add(s);

    }

}
    package com.example.lab5_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

    public class Bai4 extends AppCompatActivity {

        GridView grvBai4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);

        List<Country> imgDetails = getListData();

        addControl();

        grvBai4.setAdapter(new CustomCountryAdapter(imgDetails,Bai4.this));

        addEvent();

    }

    void addControl()
    {
        grvBai4 = (GridView) findViewById(R.id.grvBai4);
    }

    void addEvent()
    {
        grvBai4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = grvBai4.getItemAtPosition(position);
                Country country = (Country) o;
                Toast.makeText(Bai4.this, "Selected:" + "" + country, Toast.LENGTH_LONG).show();
            }
        });
    }

    public static List<Country> getListData ()
    {
        List<Country> countryList = new ArrayList<Country>();

        Country vietnam = new Country("Việt Nam", "vietnam", 980000000);
        Country italy = new Country("Ý","italy",59110000);
        Country lao = new Country("Lào","lao",7425000);
        Country sin = new Country("Singapore", "sin",5454000);
        Country thai = new Country("Thái Lan","thai",71600000);
        Country anh = new Country("Anh","anh",56000000);
        Country phap = new Country("Pháp","phap",67750000);
        Country my = new Country("Mỹ","my",331000000);

        countryList.add(vietnam);
        countryList.add(italy);
        countryList.add(lao);
        countryList.add(sin);
        countryList.add(thai);
        countryList.add(anh);
        countryList.add(phap);
        countryList.add(my);

        return countryList;
    }



}
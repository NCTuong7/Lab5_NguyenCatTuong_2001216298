package com.example.lab5_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button btnBai1,btnBai2,btnBai3,btnBai4,btnBai4b,btnBai5,btnBai6,btnBai7,btnBai8,btnBai9,btnBai10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addEvent();
    }
    void addControl()
    {
        btnBai1 = (Button) findViewById(R.id.btnBai1);
        btnBai2 = (Button) findViewById(R.id.btnBai2);
        btnBai3 = (Button) findViewById(R.id.btnBai3);
        btnBai4 = (Button) findViewById(R.id.btnBai4);
        btnBai4b = (Button) findViewById(R.id.btnBai4b);
        btnBai5 = (Button) findViewById(R.id.btnBai5);
        btnBai6 = (Button) findViewById(R.id.btnBai6);
        btnBai7 = (Button) findViewById(R.id.btnBai7);
        btnBai8 = (Button) findViewById(R.id.btnBai8);
        btnBai9 = (Button) findViewById(R.id.btnBai9);
        btnBai10 = (Button) findViewById(R.id.btnBai10);
    }
    void addEvent()
    {
btnBai1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,Bai1.class);
        startActivity(intent);
    }
});
btnBai2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,Bai2.class);
        startActivity(intent);
    }
});
btnBai3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,Bai3.class);
        startActivity(intent);
    }
});
btnBai4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,Bai4.class);
        startActivity(intent);
    }
});
btnBai4b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,Bai4b.class);
        startActivity(intent);
    }
});
btnBai5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,Bai5.class);
        startActivity(intent);
    }
});
btnBai6.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Bai6.class);
        startActivity(intent);
    }
});

btnBai7.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Bai7.class);
        startActivity(intent);
    }
});
    }
}
package com.example.lab5_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Bai4b extends AppCompatActivity {

    List<Movie> movieList = new ArrayList<Movie>();
    RecyclerView rcvBai4b;
    MovieAdapter movieAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4b);
        addControl();

        rcvBai4b.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        movieAdapter = new MovieAdapter(movieList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rcvBai4b.setLayoutManager(layoutManager);

        rcvBai4b.setItemAnimator(new DefaultItemAnimator());
        rcvBai4b.setAdapter(movieAdapter);
        prepareMovieData();

        addEvent();
    }

    void addControl()
    {
        rcvBai4b = (RecyclerView) findViewById(R.id.rcvBai4b);
    }

    void addEvent()
    {

    }

    private void prepareMovieData()
    {
        Movie movie = new Movie("Mad max: Fury Road", "Action and Adventure", "2015");
        movieList.add(movie);
         movie = new Movie("Insite Out", "Animation, Kid & Family", "2015");
        movieList.add(movie);
         movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);
         movie = new Movie("Shaun the Shep", "Animation", "2015");
        movieList.add(movie);
         movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);
         movie = new Movie("Misson: Impossible Rogue Nation ", "Action", "2015");
        movieList.add(movie);
         movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);
        movieAdapter.notifyDataSetChanged();

    }

}
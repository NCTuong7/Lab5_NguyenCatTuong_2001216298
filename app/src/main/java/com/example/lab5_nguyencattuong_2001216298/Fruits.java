package com.example.lab5_nguyencattuong_2001216298;

import java.util.ArrayList;

public class Fruits {
    int idImg;
    String fruitName;
    int fruitPrice;

    public int getIdImg() {
        return idImg;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getFruitPrice() {
        return fruitPrice;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setFruitPrice(int fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    public Fruits(int idImg, String fruitName, int fruitPrice) {
        this.idImg = idImg;
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
    }

    public static ArrayList<Fruits> iniArrayListFruit (int[] lsImg, String[] lsName, int[] lsPrice)
    {
        ArrayList<Fruits> fruitsArrayList = new ArrayList<>();
        for(int i= 0; i< lsImg.length;i++)
        {
            Fruits fruits = new Fruits(lsImg[i],lsName[i], lsPrice[i]);
            fruitsArrayList.add(fruits);

        }
        return fruitsArrayList;
    }

}

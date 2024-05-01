package com.example.lab5_nguyencattuong_2001216298;

import java.util.ArrayList;

public class Iphone {
    String idIphone;
    String iphoneName;

    public String getIdIphone() {
        return idIphone;
    }

    public void setIdIphone(String idIphone) {
        this.idIphone = idIphone;
    }

    public String getIphoneName() {
        return iphoneName;
    }

    public void setIphoneName(String iphoneName) {
        this.iphoneName = iphoneName;
    }

    public Iphone(String idIphone, String iphoneName) {
        this.idIphone = idIphone;
        this.iphoneName = iphoneName;
    }
    public static ArrayList<Iphone> getIphoneData ()
    {
        ArrayList<Iphone> iphoneArrayList = new ArrayList<>();
        Iphone iphone3 = new Iphone("IP3" ,"Iphone 3");
        Iphone iphone4 = new Iphone("IP4" ,"Iphone 4");
        Iphone iphone5 = new Iphone("IP5" ,"Iphone 5");

        iphoneArrayList.add(iphone3);
        iphoneArrayList.add(iphone4);
        iphoneArrayList.add(iphone5);

        return iphoneArrayList;

    }
}

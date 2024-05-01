package com.example.lab5_nguyencattuong_2001216298;

import java.util.ArrayList;

public class Ipad {
    String idIpad;
    String ipadName;

    public String getIdIpad() {
        return idIpad;
    }

    public void setIdIpad(String idIpad) {
        this.idIpad = idIpad;
    }

    public String getIpadName() {
        return ipadName;
    }

    public void setIpadName(String ipadName) {
        this.ipadName = ipadName;
    }

    public Ipad(String idIpad, String ipadName) {
        this.idIpad = idIpad;
        this.ipadName = ipadName;
    }

    public static ArrayList<Ipad> getIpadData()
    {
        ArrayList<Ipad> ipads = new ArrayList<>();
        Ipad ipad3 = new Ipad("ipd3", "Ipad Air 3");
        Ipad ipad4 = new Ipad("ipd4", "Ipad Air 4");
     ipads.add(ipad3);
     ipads.add(ipad4);
     return ipads;
    }
}

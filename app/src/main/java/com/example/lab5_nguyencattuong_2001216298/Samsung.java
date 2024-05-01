package com.example.lab5_nguyencattuong_2001216298;

import java.util.ArrayList;

public class Samsung {
    String idSamsung;
    String samsungName;

    public String getIdSamsung() {
        return idSamsung;
    }

    public void setIdSamsung(String idSamsung) {
        this.idSamsung = idSamsung;
    }

    public String getSamsungName() {
        return samsungName;
    }

    public void setSamsungName(String samsungName) {
        this.samsungName = samsungName;
    }

    public Samsung(String idSamsung, String samsungName) {
        this.idSamsung = idSamsung;
        this.samsungName = samsungName;
    }

    public static ArrayList<Samsung> getSamsungData ()
    {
        ArrayList<Samsung> samsungArrayList = new ArrayList<>();
        Samsung  samsung2 = new Samsung("S2" , "Sam Sung SII");
        Samsung  samsung3 = new Samsung("S3" , "Sam Sung SIII");
        samsungArrayList.add(samsung2);
        samsungArrayList.add(samsung3);
        return samsungArrayList;
     }
}

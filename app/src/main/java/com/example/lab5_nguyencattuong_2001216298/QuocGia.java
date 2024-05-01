package com.example.lab5_nguyencattuong_2001216298;

import java.util.ArrayList;
import java.util.PropertyPermission;

public class QuocGia {
    int idImg;
    String tenQuocGia;

    public int getIdImg() {
        return idImg;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public QuocGia(int idImg, String tenQuocGia) {
        this.idImg = idImg;
        this.tenQuocGia = tenQuocGia;
    }
        public static ArrayList iniQuocGia(int [] idHinh, String[] quocGiaName)
        {
            ArrayList<QuocGia> quocGiaArrayList = new ArrayList<>();
            for (int i = 0; i < idHinh.length; i++)
            {
                quocGiaArrayList.add(new QuocGia(idHinh[i],quocGiaName[i]));
            }
            return quocGiaArrayList;
         }
}


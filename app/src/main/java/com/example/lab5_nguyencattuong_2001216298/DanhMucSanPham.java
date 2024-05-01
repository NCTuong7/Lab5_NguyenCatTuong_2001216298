package com.example.lab5_nguyencattuong_2001216298;

import java.util.ArrayList;

public class DanhMucSanPham {
    int idSanPham;
    String tenSanPham;

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public DanhMucSanPham(int idSanPham, String tenSanPham) {
        this.idSanPham = idSanPham;
        this.tenSanPham = tenSanPham;
    }

    public static ArrayList<DanhMucSanPham> getDanhMucSanPhamData ()
    {
        ArrayList<DanhMucSanPham> danhMucSanPhams = new ArrayList<>();

        DanhMucSanPham danhMucSanPham1 = new DanhMucSanPham(1, "SamSung");
        DanhMucSanPham danhMucSanPham2 = new DanhMucSanPham(2, "Iphone");
        DanhMucSanPham danhMucSanPham3 = new DanhMucSanPham(3, "Ipad");

        danhMucSanPhams.add(danhMucSanPham1);
        danhMucSanPhams.add(danhMucSanPham2);
        danhMucSanPhams.add(danhMucSanPham3);

        return danhMucSanPhams;

    }
}

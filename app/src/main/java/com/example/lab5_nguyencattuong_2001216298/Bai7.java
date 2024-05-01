package com.example.lab5_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Bai7 extends AppCompatActivity {

   ArrayList<DanhMucSanPham> danhmuc;
    ArrayList<Iphone> dsIphone;
    ArrayList<Ipad> dsIPad;
    ArrayList<Samsung> dsSamsung;

    Button btnNhapSp;
    EditText edtMaSp, edtTenSp;
    ListView lvDanhSachSanPham;
    Spinner spDanhMuc;
    CustomDanhMucAdapter adapterDanhMucSanPham;
    CustomListDanhMucDienThoai cusTomSamSung;
    CustomIphoneAdapter iphoneAdapter;
    CustomIpadAdapter customIpadAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai7);
        addControl();

        dsIphone = Iphone.getIphoneData();
        dsIPad = Ipad.getIpadData();
        dsSamsung = Samsung.getSamsungData();
        danhmuc = DanhMucSanPham.getDanhMucSanPhamData();
        adapterDanhMucSanPham = new CustomDanhMucAdapter(Bai7.this, R.layout.layout_item_danh_muc,danhmuc);
        spDanhMuc.setAdapter(adapterDanhMucSanPham);

        addEvent();


    }

    void addControl()
    {
        btnNhapSp = (Button) findViewById(R.id.btnNhapSp);
        edtMaSp = (EditText) findViewById(R.id.edtMaSp);
        edtTenSp  = (EditText) findViewById(R.id.edtTenSp);
        lvDanhSachSanPham = (ListView) findViewById(R.id.lvDanhSachSanPham);
        spDanhMuc = (Spinner) findViewById(R.id.spDanhMuc);
    }

    void addEvent()
    {
         int[] viTri = new int[1];
        btnNhapSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tenDanhMuc = danhmuc.get(viTri[0]).getIdSanPham() + " - " + danhmuc.get(viTri[0]).getTenSanPham();
                if(tenDanhMuc.equals("1 - SamSung"))
                {
                    Samsung samsung = new Samsung(edtMaSp.getText().toString(),edtTenSp.getText().toString());
                    dsSamsung.add(samsung);
                    cusTomSamSung.notifyDataSetChanged();
                }

                if(tenDanhMuc.equals("2 - Iphone"))
                {
                    Iphone iphone = new Iphone(edtMaSp.getText().toString(),edtTenSp.getText().toString());
                    dsIphone.add(iphone);
                    iphoneAdapter.notifyDataSetChanged();
                }

                if(tenDanhMuc.equals("3 - Ipad"))
                {
                    Ipad ipad = new Ipad(edtMaSp.getText().toString(),edtTenSp.getText().toString());
                    dsIPad.add(ipad);
                    customIpadAdapter.notifyDataSetChanged();
                }
            }
        });

       spDanhMuc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               String tenDanhMuc = danhmuc.get(position).getIdSanPham() + " - " + danhmuc.get(position).getTenSanPham();
                    viTri[0] = position;
               if(tenDanhMuc.equals("1 - SamSung"))
               {
                  cusTomSamSung = new CustomListDanhMucDienThoai(Bai7.this, R.layout.layout_item_list_dien_thoat,dsSamsung);
                   lvDanhSachSanPham.setAdapter(cusTomSamSung);
               }

               if(tenDanhMuc.equals("2 - Iphone"))
               {
                    iphoneAdapter = new CustomIphoneAdapter(Bai7.this,R.layout.layout_item_iphone,dsIphone);
                   lvDanhSachSanPham.setAdapter(iphoneAdapter);
               }

               if(tenDanhMuc.equals("3 - Ipad"))
               {
                    customIpadAdapter = new CustomIpadAdapter(Bai7.this, R.layout.layout_item_ipad,dsIPad);
                   lvDanhSachSanPham.setAdapter(customIpadAdapter);
               }
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

       lvDanhSachSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Object o = lvDanhSachSanPham.getItemAtPosition(position);
               String tenDanhMuc = danhmuc.get(position).getIdSanPham() + " - " + danhmuc.get(position).getTenSanPham();
               viTri[0] = position;
               if(tenDanhMuc.equals("1 - SamSung"))
               {
                   Samsung samsung = (Samsung) o;
                   edtMaSp.setText(samsung.getIdSamsung());
                   edtTenSp.setText(samsung.getSamsungName());
               }

               if(tenDanhMuc.equals("2 - Iphone"))
               {
                   Iphone iphone = (Iphone) o;
                   edtMaSp.setText(iphone.getIdIphone());
                   edtTenSp.setText(iphone.getIphoneName());
               }

               if(tenDanhMuc.equals("3 - Ipad"))
               {
                   Ipad ipad = (Ipad) o;
                   edtMaSp.setText(ipad.getIdIpad());
                   edtTenSp.setText(ipad.getIpadName());
               }

           }
       });
    }
}
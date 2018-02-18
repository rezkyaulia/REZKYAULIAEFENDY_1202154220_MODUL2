package com.example.rezky.rezky_1202154220_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;

public class ListPesanan extends AppCompatActivity {

    private RecyclerView View;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;

    //Daftar Menu Makanan
    private String[] Judul = {"Gulai Kepala Ikan", "Gurame Acar Merah", "Kepiting Lada Hitam", "Mie Goreng Seafood",
            "Nasi Goreng Seafood", "Rajungan Asam Pedas","Salmon Teh Hijau","Udang Asam Manis"};
    //Daftar Harga Makanan
    private String[] test = {"Rp. 25.000", "Rp. 30.000", "Rp. 50.000", "Rp. 15.000", "Rp. 20.000", "Rp. 40.000", "Rp. 60.000", "Rp. 25.000"};
    //Daftar Gambar Makanan
    private int[] Gambar = {R.drawable.gulaikepalaikan, R.drawable.gurameacarmerah, R.drawable.kepitingladahitam, R.drawable.miegorengseafood,
            R.drawable.nasigorengseafood, R.drawable.rajunganasampedas,R.drawable.salmontehhijau,R.drawable.udangasammanis};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pesanan);

        //men-setting toolbar yang akan muncul di atas dengan nama List Makanan
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_list);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("List Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mendeklarasikan array list untuk menu, harga dan gambar makanan
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        View = (RecyclerView) findViewById(R.id.recyclerview);
        View.setHasFixedSize(true);

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new LinearLayoutManager(this);
        View.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu, dataHarga, gambar);
        View.setAdapter(adapter);
    }


    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter

    private void DaftarItem() {
        for (int w = 0; w < Judul.length; w++) {
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            gambar.add(Gambar[w]);
        }
    }
}


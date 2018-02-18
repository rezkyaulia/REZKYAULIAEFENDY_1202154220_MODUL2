package com.example.rezky.rezky_1202154220_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {

    private TextView makan,hargamakan,komp;
    private ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        //melakukan insiasi pada id nya

        makan = (TextView) findViewById(R.id.namamakanan);

        hargamakan = (TextView) findViewById(R.id.harga);

        komp = (TextView) findViewById(R.id.komposisi);

        foto = (ImageView) findViewById(R.id.gambar);

        //men-setting toolbar yang akan muncul di atas dengan nama List Makanan
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_detail);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Komposisi Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //melakukan get data dari menu fitur sebelumnya, membawa data yang dikirim
        Intent c = getIntent();

        String menu = c.getStringExtra("judul");
        String hrga = c.getStringExtra("harga");
        String kmposisi= c.getStringExtra("komposisi");
        Integer gmbr = c.getIntExtra("gambar",0);

        //melakukan set text maupun setImageResource untuk data yang sudah di bawa dari layout sebelumnya
        makan.setText(menu);
        hargamakan.setText(hrga);
        komp.setText(kmposisi);
        foto.setImageResource(gmbr);
    }
}

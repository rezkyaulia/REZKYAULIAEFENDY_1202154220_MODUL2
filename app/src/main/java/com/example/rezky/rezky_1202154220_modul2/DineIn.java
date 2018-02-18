package com.example.rezky.rezky_1202154220_modul2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    private TextInputLayout nama1;
    private Spinner spin;
    String mSpinnerlabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        //men-setting toolbar yang akan muncul di atas dengan nama Dine In
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_dinein);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Dine In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //inisiasi untuk Spinner

        spin = (Spinner) findViewById(R.id.nomeja);

        //memanggil array untuk menampung data yang ada pada spinner nantinya
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //jika spinner terisi maka akan men-set isi adapter dengan isi yang kita sudah masukkan di string.xml
        if (spin != null){
            spin.setAdapter(adapter);
        }
    }

    public void pilihpesanan(View view) {

        //inisiasi untuk TextInputLayot

        nama1 = (TextInputLayout) findViewById(R.id.name);

        //membuat string test agar spinner dapat dipilih
        String test = spin.getSelectedItem().toString();

        //jika spinner null
        if (nama1 ==null){
            Toast.makeText(this,"Tolong Di isi Terlebih Dahulu",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1, maka akan muncul toast kalau pemesan memilih meja 1
        else if (test.equalsIgnoreCase("Meja 1")){
            String nama = nama1.getEditText().getText().toString();
            Toast.makeText(this,"" + nama + " Memilih Meja 1",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 2, maka akan muncul toast kalau pemesan memilih meja 2
        else if (test.equalsIgnoreCase("Meja 2")){
            String nama = nama1.getEditText().getText().toString();
            Toast.makeText(this,"" + nama + " Memilih Meja 2",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 3, maka akan muncul toast kalau pemesan memilih meja 3
        else if (test.equalsIgnoreCase("Meja 3")){
            String nama = nama1.getEditText().getText().toString();
            Toast.makeText(this,"" + nama + " Memilih Meja 3",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1, maka akan muncul toast kalau pemesan memilih meja 1
        else if (test.equalsIgnoreCase("Meja 4")){
            String nama = nama1.getEditText().getText().toString();
            Toast.makeText(this,"" + nama + " Memilih Meja 4",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1 akan muncul toast kalau memilih meja 5
        else if (test.equalsIgnoreCase("Meja 5")){
            String nama = nama1.getEditText().getText().toString();
            Toast.makeText(this,"" + nama + " Memilih Meja 5",Toast.LENGTH_LONG).show();
        }


        //membuat string nama dana jumlah untuk mengambil nilai dari TextInputLayout
     //   String nama1 = a.getEditText().getText().toString();
//
        //mengirimkan nama dan jumlah ke dalam intent agar bisa di get pada class yang di tuju
        Intent a = new Intent(DineIn.this,ListPesanan.class);
        startActivity(a);

    }
}

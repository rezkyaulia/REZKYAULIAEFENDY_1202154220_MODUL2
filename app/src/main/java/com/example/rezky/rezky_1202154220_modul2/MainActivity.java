package com.example.rezky.rezky_1202154220_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnPesan ;
    private RadioGroup radioGroup;
    private RadioButton Dine,Take;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //men-setting toolbar yang akan muncul di atas dengan nama Restoran Baymax
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbarmain);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Restoran Baymax");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //melakukan inisiasi berdasarkan id yang ada di layout mulai dari button sampai radio button

        btnPesan = (Button) findViewById(R.id.pesan);

        radioGroup = (RadioGroup) findViewById(R.id.pilihmenu);

        Dine = (RadioButton) findViewById(R.id.dine);

        Take = (RadioButton) findViewById(R.id.take);
    }

    //jika kita memasang onclick pada button, maka dapat membuat tombol yang memiliki aksi
    public void pesan(View view) {

        radioGroup = (RadioGroup) findViewById(R.id.pilihmenu);

        Dine = (RadioButton) findViewById(R.id.dine);

        Take = (RadioButton) findViewById(R.id.take);

    }

    public void pilih(View view) {

        // agar radio button dapat di pilih
        int selecteditem = radioGroup.getCheckedRadioButtonId();

        //jika yang dpilih adalah Dine In, Maka akan muncul toast yang berisikan dine in
        if (selecteditem == Dine.getId()){
            Toast.makeText(this,"Dine In",Toast.LENGTH_LONG).show();

            //membuat intent yang mengarah ke DineIn.class
            Intent a = new Intent(MainActivity.this,DineIn.class);
            startActivity(a);
        } //jika yang dpilih adalah Dine In, Maka akan muncul toast yang berisikan take away
        else if (selecteditem == Take.getId()){
            Toast.makeText(this,"Take Away",Toast.LENGTH_LONG).show();

            //membuat intent yang mengarah ke TakeAway.class
            Intent a = new Intent(MainActivity.this,TakeAway.class);
            startActivity(a);
        }

    }

    public void pilihpemesanan(View view) {
       //melakukan pengecekan button
        boolean checked = ((RadioButton) view).isChecked();

      //melakukan pengecekan button apa yg akan di klik oleh pemesan
        switch(view.getId()) {
            case R.id.take:
                if (checked)
                    //method untuk menampikan pesan dan pindah layout ke TakeAway
                    take();
                    break;
            case R.id.dine:
                if (checked)
                    //method untuk menampikan pesan dan pindah layout ke Dine In
                    dine();
                    break;
        }
    }

    private void dine() {
        //Untuk menampilkan pesan
        Toast.makeText(this,"Dine In",Toast.LENGTH_LONG).show();
        //Untuk pindah layout
        Intent a = new Intent(MainActivity.this,DineIn.class);
        startActivity(a);
    }

    private void take() {
        Toast.makeText(this,"Take Away",Toast.LENGTH_LONG).show();
        Intent a = new Intent(MainActivity.this,TakeAway.class);
        startActivity(a);
    }
}

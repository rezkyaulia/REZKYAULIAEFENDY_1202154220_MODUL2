package com.example.rezky.rezky_1202154220_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> Data,Harga;
    private ArrayList<Integer> gambar;


    public RecyclerViewAdapter(ArrayList<String> inputData, ArrayList<String> dataHarga, ArrayList<Integer> gmbr) {
        Data = inputData;
        Harga = dataHarga;
        gambar = gmbr;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //hanya menggunakan data String dan Integer untuk tiap item
        public TextView tvTitle;
        public TextView tvSubtitle;
        public ImageView a;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View v) {
            super(v);

            //Untuk sebagai jembatan dari Context MainActivity
            context = itemView.getContext();
            //melakukan inisiasi TextView, ImageView dan LinearLayoout
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvSubtitle = (TextView) v.findViewById(R.id.tv_subtitle);
            a = (ImageView) v.findViewById(R.id.icon);
            ItemList = (RelativeLayout) v.findViewById(R.id.list);
            //agar isi dari array nya dapat pindah layout dan membawa data sesuai dengan yang dibawah
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,DetailMakanan.class);
                    String ingredient ="";
                    switch (getAdapterPosition()){
                        case 0 :
                            intent.putExtra("judul",Data.get(getAdapterPosition()));
                            intent.putExtra("harga",Harga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "kepala ikan,air jeruk nipis,jahe, lengkuas,";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 1 :
                            intent.putExtra("judul",Data.get(getAdapterPosition()));
                            intent.putExtra("harga",Harga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Ikan Gurame,Tomat Hijau, Cabai Rawit";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 2 :
                            intent.putExtra("judul",Data.get(getAdapterPosition()));
                            intent.putExtra("harga",Harga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Kepiting Rebus,Lada Hitam,Cabai Merah,Saus Tiram";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 3 :
                            intent.putExtra("judul",Data.get(getAdapterPosition()));
                            intent.putExtra("harga",Harga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Mie kering, Udang, Cumi, Bakso, Telur";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 4 :
                            intent.putExtra("judul",Data.get(getAdapterPosition()));
                            intent.putExtra("harga",Harga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Nasi, Cumi, Udang, Bawang Bombai";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 5 :
                            intent.putExtra("judul",Data.get(getAdapterPosition()));
                            intent.putExtra("harga",Harga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Kepiting, Jahe, Cabai, Tomat";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 6 :
                            intent.putExtra("judul",Data.get(getAdapterPosition()));
                            intent.putExtra("harga",Harga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Ikan Salmon, Irisan Lemon, Serbuk Daun Teh Hijau";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 7 :
                            intent.putExtra("judul",Data.get(getAdapterPosition()));
                            intent.putExtra("harga",Harga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Udang, Cabai Merah, Jeruk Nipis";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                    }
                }
            });
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_list, parent, false);
        // melakukan set ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        final String name = Data.get(position);
        final String harga = Harga.get(position);
        final Integer test = gambar.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitle.setText(harga);
        holder.a.setImageResource(test);

    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset atau jumlah data yang ditampilkan di RecyclerView
        return Data.size();
    }
}

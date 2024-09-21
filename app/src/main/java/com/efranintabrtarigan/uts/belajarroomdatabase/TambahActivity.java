package com.efranintabrtarigan.uts.belajarroomdatabase;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.RoomDatabase;

import com.efranintabrtarigan.uts.belajarroomdatabase.Model.Produk;

public class TambahActivity extends AppCompatActivity {

    EditText etNamaProduk, etDeskripsiProduk;
    Button btnsimpan;
    AppDatabase app;

   @SuppressLint("MissingInflatedId")
   @Override
    protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_tambah);

       // Inisialisasi EditText dan Button
       etNamaProduk = findViewById(R.id.nama_produk);
       etDeskripsiProduk = findViewById(R.id.deskripsi_produk);
       btnsimpan= findViewById(R.id.btnsimpan);

       // Inisialisasi database Room
       app = new RoomDatabase.Builder<>(this, AppDatabase.class, "inventory.db")
               .allowMainThreadQueries()
               .build();

       // aksi ketika tombol simpan di klik
       btnsimpan.setOnClickListener(v -> {
           Produk produk = new Produk();
           produk.nama = etNamaProduk.getText().toString();
           produk.deskripsi = etDeskripsiProduk.getText().toString();

           // Memasukkan data ke database
           app.produkDao().insert(produk);

           //app.produkDao().insertProduk(produk);
           Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

       });
   }
}

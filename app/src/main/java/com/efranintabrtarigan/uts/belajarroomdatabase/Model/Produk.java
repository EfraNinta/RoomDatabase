package com.efranintabrtarigan.uts.belajarroomdatabase.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Produk {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    public int id;

    @ColumnInfo(name="nama")
    public String nama;

    @ColumnInfo(name="deskripsi")
    public String deskripsi;
}


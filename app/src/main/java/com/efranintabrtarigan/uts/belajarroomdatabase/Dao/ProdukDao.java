package com.efranintabrtarigan.uts.belajarroomdatabase.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.efranintabrtarigan.uts.belajarroomdatabase.Model.Produk;

import java.util.List;

@Dao
public interface ProdukDao {

    @Insert
        // Insert into produk (id, nama, deskripsi)
    void insert(Produk produk);
    @Update
    void update(Produk produk);
    @Delete
    void delete(Produk produk);
    @Query("SELECT * FROM produk")
    List<Produk> getAll();
}

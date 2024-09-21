package com.efranintabrtarigan.uts.belajarroomdatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.efranintabrtarigan.uts.belajarroomdatabase.Dao.ProdukDao;
import com.efranintabrtarigan.uts.belajarroomdatabase.Model.Produk;

@Database(entities = {Produk.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    
    public abstract ProdukDao produkDao();
}

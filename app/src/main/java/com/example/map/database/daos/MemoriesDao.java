package com.example.map.database.daos;

import android.location.Location;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import com.example.map.database.model.Memory;

import java.util.List;

/**
 * Created by Mohamed Nabil Mohamed on 9/26/2019.
 * m.nabil.fci2015@gmail.com
 */
@Dao
public interface MemoriesDao {

    @Insert
    void addMemory(Memory note);

    @Query("select * from Memory")
    List<Memory> getAllMemories();
}
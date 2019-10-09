package com.example.map.database;

import android.content.Context;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.map.database.daos.MemoriesDao;
import com.example.map.database.model.Memory;


/**
 * Created by Mohamed Nabil Mohamed on 9/26/2019.
 * m.nabil.fci2015@gmail.com
 */
@Database(entities = {Memory.class},version = 1,exportSchema = false)
public abstract class MyDataBase extends RoomDatabase {
    private static  MyDataBase dataBase;
    private final static String DATABASE_NAME="memoriesDatabase";
    public abstract MemoriesDao notesDao();
    public static MyDataBase getInstance(Context context){
        if(dataBase==null){
            //create
            dataBase = Room.databaseBuilder(context,MyDataBase.class,
                            DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();

        }
        return dataBase;
    }
}

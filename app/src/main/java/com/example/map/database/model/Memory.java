package com.example.map.database.model;

import android.location.Location;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.example.map.database.DataConverter;

@Entity

public class Memory {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo
    String title;
    String  content;
    @TypeConverters(DataConverter.class)
    @ColumnInfo
    Location location;




    public Memory()
    {
    }
    @Ignore
    public Memory(String title, String content, Location location) {
        this.title = title;
        this.content = content;
        this.location = location; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) { this.location = location; }

}

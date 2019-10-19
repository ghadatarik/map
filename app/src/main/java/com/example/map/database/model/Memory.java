package com.example.map.database.model;

import android.location.Location;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.map.database.DataConverter;

@Entity

public class Memory {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo
    String title;
    String  content;
    double  longitude;
    double latitude;




    public Memory()
    {
    }
    @Ignore
    public Memory(String title, String content, double longitude, double latitude) {
        this.title = title;
        this.content = content;
        this.longitude = longitude;
        this.latitude = latitude;
    }

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

    public double getLongitude() {return longitude; }

    public void setLongitude(double longitude) { this.longitude = longitude; }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}

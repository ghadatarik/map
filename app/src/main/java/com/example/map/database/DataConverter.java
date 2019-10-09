package com.example.map.database;

import android.location.Location;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.lang.reflect.Type;

public class DataConverter  {

    @TypeConverter // note this annotation
    public String fromLocation(Location location) {
        if (location == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Location>() {
        }.getType();
        String json = gson.toJson(location,type);
        return json;
    }

    @TypeConverter // note this annotation
    public Location toLocation(String locationstring) {
        if (locationstring == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Location>() {
        }.getType();
        Location location = gson.fromJson(locationstring, type );
        return location;
    }

}

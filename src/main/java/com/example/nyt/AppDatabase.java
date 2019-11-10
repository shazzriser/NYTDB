package com.example.nyt;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.nyt.model.Book;

@Database(entities = {Book.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BookDao bookDao();
    private static AppDatabase instance;

    public static AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, AppDatabase.class, "nytDb" )
                    .allowMainThreadQueries()
                    .build();
        }

        return instance;

        // get the arrayist response, here and then get it to the


    }
    public static AppDatabase destroyInstance() {
        return instance = null;
    }

}

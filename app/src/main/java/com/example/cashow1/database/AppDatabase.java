package com.example.cashow1.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.cashow1.database.dao.DatabaseDao;
import com.example.cashow1.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}

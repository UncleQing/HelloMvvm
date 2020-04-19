package com.zidian.hellomvvm.app;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.zidian.hellomvvm.db.converter.DateConverter;
import com.zidian.hellomvvm.db.entity.UserEntity;

/**
 * @Author: UncleQing
 * @CreateDate: 2020/4/10
 * @Description: This is AppDatabase
 */

@Database(entities = {UserEntity.class}, version = 1)
@TypeConverters({DateConverter.class})
public class AppDatabase extends RoomDatabase {
    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @Override
    public void clearAllTables() {

    }
}

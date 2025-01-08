package com.example.wia2007_py2023;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Record.class}, version = 1, exportSchema = false)
public abstract class RecordDatabase extends RoomDatabase {
    abstract RecordDao recordDao();
    private static RecordDatabase INSTANCE;

    private static final int NUMBER_OF_THREAD = 4;

    static final ExecutorService databaseExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREAD);

    public static RecordDatabase getDatabase(final Context context) {
        if(INSTANCE == null) {
            synchronized (RecordDatabase.class) {
                if(INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            RecordDatabase.class,
                            "record_database").build();
                }
            }
        }
        return INSTANCE;
    }
}

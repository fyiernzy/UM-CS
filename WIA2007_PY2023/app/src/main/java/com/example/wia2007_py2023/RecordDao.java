package com.example.wia2007_py2023;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RecordDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Record record);

    @Query("SELECT COALESCE(SUM(amount), 0) FROM Record")
    LiveData<Integer> getTotalAmount();

    @Query("SELECT COALESCE(SUM(amount), 0) FROM Record WHERE type = :type")
    LiveData<Integer> getTotalAmountByType(String type);

    @Query("SELECT * FROM Record ORDER BY day")
    LiveData<List<Record>> getAllAscendingRecord();
}

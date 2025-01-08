package com.example.wia2007_py2023;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class RecordRepository {
    private RecordDatabase database;
    private RecordDao recordDao;
    private LiveData<List<Record>> allAscendingRecord;

    private LiveData<Integer> totalAmount;
    private LiveData<Integer> amountPlainWater;
    private LiveData<Integer> amountNonSweetened;
    private LiveData<Integer> amountSweetened;

    public RecordRepository(Application application) {
        this.database = RecordDatabase.getDatabase(application);
        this.recordDao = database.recordDao();
        allAscendingRecord = recordDao.getAllAscendingRecord();
        amountPlainWater = recordDao.getTotalAmountByType("Plain Water");
        amountNonSweetened = recordDao.getTotalAmountByType("Non-Sweetened");
        amountSweetened = recordDao.getTotalAmountByType("Sweetened");
        totalAmount = recordDao.getTotalAmount();
    }

    public LiveData<List<Record>> getAllAscendingRecord() {
        return allAscendingRecord;
    }

    public LiveData<Integer> getTotalAmount() {
        return totalAmount;
    }

    public LiveData<Integer> getAmountPlainWater() {
        return amountPlainWater;
    }

    public LiveData<Integer> getAmountNonSweetened() {
        return amountNonSweetened;
    }

    public LiveData<Integer> getAmountSweetened() {
        return amountSweetened;
    }

    public void insert(Record record) {
        RecordDatabase.databaseExecutor.execute(() -> {
            recordDao.insert(record);
        });
    }
}

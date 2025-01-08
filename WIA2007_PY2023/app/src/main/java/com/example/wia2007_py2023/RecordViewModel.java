package com.example.wia2007_py2023;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class RecordViewModel extends AndroidViewModel {
    private RecordRepository repository;

    private LiveData<List<Record>> allAscendingRecord;

    private LiveData<Integer> totalAmount;
    private LiveData<Integer> amountPlainWater;
    private LiveData<Integer> amountNonSweetened;
    private LiveData<Integer> amountSweetened;
    public RecordViewModel(@NonNull Application application) {
        super(application);
        this.repository = new RecordRepository(application);
        totalAmount = repository.getTotalAmount();
        amountPlainWater = repository.getAmountPlainWater();
        amountNonSweetened = repository.getAmountNonSweetened();
        amountSweetened = repository.getAmountSweetened();
        allAscendingRecord = repository.getAllAscendingRecord();
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
        repository.insert(record);
    }


}

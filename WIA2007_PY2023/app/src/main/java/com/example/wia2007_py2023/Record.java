package com.example.wia2007_py2023;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Record {
    @PrimaryKey(autoGenerate = true)
    public int recordId;
    @NonNull
    public int day;

    @NonNull
    public String type;
    @NonNull
    public String other;
    @NonNull
    public int amount;

    public Record(@NonNull int day, @NonNull String type, String other, @NonNull int amount) {
        this.day = day;
        this.type = type;
        this.other = other;
        this.amount = amount;
    }

    public int getDay() {
        return day;
    }

    @NonNull
    public String getType() {
        return type;
    }

    @NonNull
    public String getOther() {
        return other;
    }

    public int getAmount() {
        return amount;
    }

}

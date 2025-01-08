package com.example.wia2007_py2023;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Tools {
    private static final String TAG = "Tool";

    public boolean toBool(String bool) {
        try {
            return Boolean.parseBoolean(bool);
        } catch (Exception ex) {
            Log.d(TAG, "Boolean parsing error: " + bool);
        }
        return false;
    }

    public int toInt(String val) {
        try {
            return Integer.parseInt(val);
        } catch (Exception ex) {
            Log.d(TAG, "Integer parsing error: " + val);
        }
        return -1;
    }

    public double toDouble(String val) {
        try {
            return Double.parseDouble(val);
        } catch (Exception ex) {
            Log.d(TAG, "Integer parsing error: " + val);
        }
        return -1;
    }

    public void makeShortToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void makeLongToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public Fragment getNewClass(Class<? extends Fragment> cls) {
        try {
            return cls.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            Log.d(TAG, "Exception at getting new class");
        }
        return null;
    }
}

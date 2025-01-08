package com.example.wia2007_py2023;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.wia2007_py2023.databinding.ActivityRecordBinding;

public class RecordActivity extends AppCompatActivity {
    private ActivityRecordBinding binding;
    private RecordViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(RecordViewModel.class);

        binding.rgType.setOnCheckedChangeListener((a, b) -> {
            if (binding.rbPlainWater.isChecked()) {
                binding.tvOtherLabel.setVisibility(View.GONE);
                binding.etOther.setVisibility(View.GONE);
            } else {
                binding.tvOtherLabel.setVisibility(View.VISIBLE);
                binding.etOther.setVisibility(View.VISIBLE);
            }
        });

        binding.btnSave.setOnClickListener(v -> handleSave());
    }

    public void handleSave() {
        if (binding.rgDay.getCheckedRadioButtonId() == -1 ||
                binding.rgType.getCheckedRadioButtonId() == -1 ||
                TextUtils.isEmpty(binding.etAmount.getText()) ||
                !isOtherFilled()
        ) {
            Log.d("Trial", "The note is not saved!");
        } else {
            int day = mapFromDay();
            String type = mapFromType();
            String other = TextUtils.isEmpty(binding.etOther.getText()) ? "" : binding.etOther.getText().toString();
            int amount = Integer.parseInt(binding.etAmount.getText().toString());
            Record record = new Record(day, type, other, amount);
            viewModel.insert(record);
            Toast.makeText(this, "You have made a new record!", Toast.LENGTH_SHORT).show();
            refreshPage();
        }
        finish();
    }

    public String mapFromType() {
        if(binding.rbPlainWater.isChecked()) {
            return "Plain Water";
        } else if (binding.rbNonSweetened.isChecked()) {
            return "Non-Sweetened";
        } else {
            return "Sweetened";
        }
    }

    public int mapFromDay() {
        if(binding.rbDay1.isChecked()) {
            return 1;
        } else if (binding.rbDay2.isChecked()) {
            return 2;
        } else {
            return 3;
        }
    }

    private void refreshPage() {
        binding.etOther.setText("");
        binding.etAmount.setText("");
        binding.rgDay.clearCheck();
        binding.rgType.clearCheck();
    }

    public boolean isOtherFilled() {
        return (binding.rbNonSweetened.isChecked() || binding.rbSweetened.isChecked())
                && !TextUtils.isEmpty(binding.etOther.getText());
    }
}

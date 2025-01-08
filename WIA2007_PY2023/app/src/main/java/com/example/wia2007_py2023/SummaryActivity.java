package com.example.wia2007_py2023;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.wia2007_py2023.databinding.ActivitySummaryBinding;

public class SummaryActivity extends AppCompatActivity {
    private ActivitySummaryBinding binding;
    private RecordViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySummaryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(RecordViewModel.class);

        viewModel.getTotalAmount().observe(this,
                totalAmount -> binding.tvTotalAmountDisplay.setText(totalAmount == null ? "0" :
                        totalAmount.toString()));

        viewModel.getAmountPlainWater().observe(this,
                plainWaterAmount -> binding.tvPWAmountDisplay.setText(plainWaterAmount == null ? "0" :
                        plainWaterAmount.toString()));

        viewModel.getAmountNonSweetened().observe(this,
                nonSweetenedAmount -> binding.tvNSAmountDisplay.setText(nonSweetenedAmount == null ? "0" :
                        nonSweetenedAmount.toString()));

        viewModel.getAmountSweetened().observe(this,
                sweetened -> binding.tvSAmountDisplay.setText(sweetened == null ? "0" : sweetened.toString()));

        RecordListAdapter adapter = new RecordListAdapter();
        binding.rvRecordDisplay.setAdapter(adapter);
        binding.rvRecordDisplay.setLayoutManager(new LinearLayoutManager(this));

        viewModel.getAllAscendingRecord().observe(this, recordList -> {
            adapter.submitList(recordList);
        });
    }
}

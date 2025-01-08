package com.example.wia2007_py2023;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.wia2007_py2023.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecordViewModel viewModel = new ViewModelProvider(this).get(RecordViewModel.class);
        binding.tvTotalAmount.setText(viewModel.getTotalAmount().toString());
        viewModel.getTotalAmount().observe(this, liveData ->
                binding.tvTotalAmount.setText(liveData == null ? "0" : liveData.toString()));
        binding.navBottom.setOnItemSelectedListener(menuItem -> {
            int id = menuItem.getItemId();
            if(id == R.id.recordActivity) {
                Intent intent = new Intent(this, RecordActivity.class);
                startActivity(intent);
            } else if (id == R.id.summaryActivity) {
                Intent intent = new Intent(this, SummaryActivity.class);
                startActivity(intent);
            }
            return true;
        });
    }
}

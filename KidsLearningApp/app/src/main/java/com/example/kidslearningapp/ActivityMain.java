package com.example.kidslearningapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.kidslearningapp.databinding.ActivityMainBinding;

public class ActivityMain extends AppCompatActivity {
    private ActivityMainBinding binding;

    SharedPreferences spEng;
    SharedPreferences spMath;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        spEng = this.getSharedPreferences("english", Context.MODE_PRIVATE);
        if(spEng.getBoolean(ActivityEnglish.Q1_TAG, false)) {
            binding.ivEngStar1.setImageResource(R.drawable.baseline_star_yellow_60);
        }
        if(spEng.getBoolean(ActivityEnglish.Q2_TAG, false)) {
            binding.ivEngStar2.setImageResource(R.drawable.baseline_star_yellow_60);
        }
        if(spEng.getBoolean(ActivityEnglish.Q3_TAG, false)) {
            binding.ivEngStar3.setImageResource(R.drawable.baseline_star_yellow_60);
        }

        spMath = this.getSharedPreferences("math", Context.MODE_PRIVATE);
        if(spMath.getBoolean(ActivityMath.Q1_TAG, false)) {
            binding.ivMathStar1.setImageResource(R.drawable.baseline_star_yellow_60);
        }
        if(spMath.getBoolean(ActivityMath.Q2_TAG, false)) {
            binding.ivMathStar2.setImageResource(R.drawable.baseline_star_yellow_60);
        }
        if(spMath.getBoolean(ActivityMath.Q3_TAG, false)) {
            binding.ivMathStar3.setImageResource(R.drawable.baseline_star_yellow_60);
        }

        binding.bottomNav.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if(itemId == R.id.destEng) {
                startActivity(new Intent(this, ActivityEnglish.class));
            } else if (itemId == R.id.destMath) {
                startActivity(new Intent(this, ActivityMath.class));
            }
            return true;
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        spEng = this.getSharedPreferences("english", Context.MODE_PRIVATE);
        if(spEng.getBoolean(ActivityEnglish.Q1_TAG, false)) {
            binding.ivEngStar1.setImageResource(R.drawable.baseline_star_yellow_60);
        }
        if(spEng.getBoolean(ActivityEnglish.Q2_TAG, false)) {
            binding.ivEngStar2.setImageResource(R.drawable.baseline_star_yellow_60);
        }
        if(spEng.getBoolean(ActivityEnglish.Q3_TAG, false)) {
            binding.ivEngStar3.setImageResource(R.drawable.baseline_star_yellow_60);
        }

        spMath = this.getSharedPreferences("math", Context.MODE_PRIVATE);
        if(spMath.getBoolean(ActivityMath.Q1_TAG, false)) {
            binding.ivMathStar1.setImageResource(R.drawable.baseline_star_yellow_60);
        }
        if(spMath.getBoolean(ActivityMath.Q2_TAG, false)) {
            binding.ivMathStar2.setImageResource(R.drawable.baseline_star_yellow_60);
        }
        if(spMath.getBoolean(ActivityMath.Q3_TAG, false)) {
            binding.ivMathStar3.setImageResource(R.drawable.baseline_star_yellow_60);
        }
    }
}

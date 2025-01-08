package com.example.kidslearningapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.kidslearningapp.databinding.ActivityEnglishBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class ActivityEnglish extends AppCompatActivity {
    private static Random RANDOM = new Random();
    private ActivityEnglishBinding binding;

    public static final String Q1_TAG = "Eng_Q1";
    public static final String Q2_TAG = "Eng_Q2";
    public static final String Q3_TAG = "Eng_Q3";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnglishBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SharedPreferences.Editor editor = this.getSharedPreferences("english", Context.MODE_PRIVATE).edit();

        // Question 1
        EnglishQuestion q1 = EnglishQuestion.getEnglishQuestion();
        binding.ivPanel1.setBackgroundColor(getResources().getColor(q1.getColorCode()));
        binding.btnQ1A1.setText(q1.getChoice1());
        binding.btnQ1A2.setText(q1.getChoice2());

        binding.btnQ1A1.setOnClickListener(view -> {
            if (binding.btnQ1A1.getText().equals(q1.getColorName())) {
                binding.btnQ1A1.setBackgroundColor(getResources().getColor(R.color.green));
                binding.ivStarQ1.setBackgroundColor(getResources().getColor(R.color.yellow));
                editor.putBoolean(Q1_TAG, true);
            } else {
                binding.btnQ1A2.setBackgroundColor(getResources().getColor(R.color.green));
                binding.btnQ1A1.setBackgroundColor(getResources().getColor(R.color.red));
                editor.putBoolean(Q1_TAG, false);
            }

            binding.btnQ1A1.setClickable(false);
            binding.btnQ1A2.setClickable(false);
        });

        binding.btnQ1A2.setOnClickListener(view -> {
            if (binding.btnQ1A2.getText().equals(String.valueOf(q1.getColorName()))) {
                binding.btnQ1A2.setBackgroundColor(getResources().getColor(R.color.green));
                binding.ivStarQ1.setBackgroundColor(getResources().getColor(R.color.yellow));
                editor.putBoolean(Q1_TAG, true);
            } else {
                binding.btnQ1A1.setBackgroundColor(getResources().getColor(R.color.green));
                binding.btnQ1A2.setBackgroundColor(getResources().getColor(R.color.red));
                editor.putBoolean(Q1_TAG, false);
            }
            binding.btnQ1A1.setClickable(false);
            binding.btnQ1A2.setClickable(false);
        });

        // TODO : Question 2
        EnglishQuestion q2 = EnglishQuestion.getEnglishQuestion();
        binding.ivPanel1.setBackgroundColor(getResources().getColor(q2.getColorCode()));
        binding.btnQ1A1.setText(q2.getChoice1());
        binding.btnQ1A2.setText(q2.getChoice2());

        binding.btnQ2A1.setOnClickListener(view -> {
            if (binding.btnQ2A1.getText().equals(String.valueOf(q2.getColorName()))) {
                binding.btnQ2A1.setBackgroundColor(getResources().getColor(R.color.green));
                binding.ivStarQ2.setBackgroundColor(getResources().getColor(R.color.yellow));
                editor.putBoolean(Q2_TAG, true);
            } else {
                binding.btnQ2A2.setBackgroundColor(getResources().getColor(R.color.green));
                binding.btnQ2A1.setBackgroundColor(getResources().getColor(R.color.red));
                editor.putBoolean(Q2_TAG, false);
            }
            binding.btnQ2A1.setClickable(false);
            binding.btnQ2A2.setClickable(false);
        });

        binding.btnQ2A2.setOnClickListener(view -> {
            if (binding.btnQ2A2.getText().equals(String.valueOf(q2.getColorName()))) {
                binding.btnQ2A2.setBackgroundColor(getResources().getColor(R.color.green));
                binding.ivStarQ2.setBackgroundColor(getResources().getColor(R.color.yellow));
                editor.putBoolean(Q2_TAG, true);
            } else {
                binding.btnQ2A1.setBackgroundColor(getResources().getColor(R.color.green));
                binding.btnQ2A2.setBackgroundColor(getResources().getColor(R.color.red));
                editor.putBoolean(Q2_TAG, false);
            }
            binding.btnQ2A1.setClickable(false);
            binding.btnQ2A2.setClickable(false);
        });

        // TODO : Question 3
        EnglishQuestion q3 = EnglishQuestion.getEnglishQuestion();
        binding.ivPanel1.setBackgroundColor(getResources().getColor(q3.getColorCode()));
        binding.btnQ1A1.setText(q3.getChoice1());
        binding.btnQ1A2.setText(q3.getChoice2());

        binding.btnQ3A1.setOnClickListener(view -> {
            if (binding.btnQ3A1.getText().equals(String.valueOf(q3.getColorName()))) {
                binding.btnQ3A1.setBackgroundColor(getResources().getColor(R.color.green));
                binding.ivStarQ3.setBackgroundColor(getResources().getColor(R.color.yellow));
                editor.putBoolean(Q3_TAG, true);
            } else {
                binding.btnQ3A2.setBackgroundColor(getResources().getColor(R.color.green));
                binding.btnQ3A1.setBackgroundColor(getResources().getColor(R.color.red));
                editor.putBoolean(Q3_TAG, false);
            }
            binding.btnQ3A1.setClickable(false);
            binding.btnQ3A2.setClickable(false);
        });

        binding.btnQ3A2.setOnClickListener(view -> {
            if (binding.btnQ3A2.getText().equals(String.valueOf(q3.getColorName()))) {
                binding.btnQ3A2.setBackgroundColor(getResources().getColor(R.color.green));
                binding.ivStarQ3.setBackgroundColor(getResources().getColor(R.color.yellow));
                editor.putBoolean(Q3_TAG, true);
            } else {
                binding.btnQ3A1.setBackgroundColor(getResources().getColor(R.color.green));
                binding.btnQ3A2.setBackgroundColor(getResources().getColor(R.color.red));
                editor.putBoolean(Q3_TAG, false);
            }
            binding.btnQ3A1.setClickable(false);
            binding.btnQ3A2.setClickable(false);
        });



        binding.btnSubmitEng.setOnClickListener(view -> {
            editor.apply();
            finish();
        });
    }

    static class EnglishQuestion {
        private static final HashMap<String, Integer> MAP = new HashMap<>();
        private static final List<String> LIST = new ArrayList<>(MAP.keySet());

        static {
            MAP.put("Red", R.color.red);
            MAP.put("Orange", R.color.orange);
            MAP.put("Yellow", R.color.yellow);
            MAP.put("Blue", R.color.blue);
            MAP.put("Cyan", R.color.cyan);
            MAP.put("White", R.color.white);
            MAP.put("Black", R.color.black);
        }

        private String colorName;
        private int colorCode;
        private String choice1;
        private String choice2;

        private EnglishQuestion(String colorName, int colorCode, String choice1, String choice2) {
            this.colorName = colorName;
            this.colorCode = colorCode;
            this.choice1 = choice1;
            this.choice2 = choice2;
        }

        public static EnglishQuestion getEnglishQuestion() {
            int randomTrue = (int) Math.random() * LIST.size() + 1;
            int randomFalse;
            do {
                randomFalse = (int) Math.random() * LIST.size() + 1;
            } while (randomTrue == randomFalse);
            String colorName = LIST.get(randomTrue);
            int colorCode = MAP.get(colorName);
            String choice1, choice2;
            if (RANDOM.nextBoolean()) {
                choice1 = colorName;
                choice2 = LIST.get(randomFalse);
            } else {
                choice1 = LIST.get(randomFalse);
                choice2 = colorName;
            }

            return new EnglishQuestion(colorName, colorCode, choice1, choice2);
        }

        public String getColorName() {
            return colorName;
        }

        public int getColorCode() {
            return colorCode;
        }

        public String getChoice1() {
            return choice1;
        }

        public String getChoice2() {
            return choice2;
        }


    }
}
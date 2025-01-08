package com.example.kidslearningapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.kidslearningapp.databinding.ActivityMathBinding;

import java.util.Random;

public class ActivityMath extends AppCompatActivity {
    private static final Random RANDOM = new Random();
    private ActivityMathBinding binding;

    public static final String Q1_TAG = "Math_Q1";
    public static final String Q2_TAG = "Math_Q2";
    public static final String Q3_TAG = "Math_Q3";



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMathBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SharedPreferences.Editor editor = this.getSharedPreferences("math", Context.MODE_PRIVATE).edit();

        // Question 1
        MathQuestion q1 = MathQuestion.getMathQuestion();
        binding.tvQuestion1.setText(q1.getQuestion());
        if (RANDOM.nextBoolean()) {
            binding.btnQ1A1.setText(String.valueOf(q1.getResult()));
            binding.btnQ1A2.setText(String.valueOf(
                    RANDOM.nextBoolean() ?
                            q1.getResult() + RANDOM.nextInt(2) :
                            q1.getResult() - RANDOM.nextInt(2)));
        } else {
            binding.btnQ1A2.setText(String.valueOf(q1.getResult()));
            binding.btnQ1A1.setText(String.valueOf(
                    RANDOM.nextBoolean() ?
                            q1.getResult() + RANDOM.nextInt(2) :
                            q1.getResult() - RANDOM.nextInt(2)));
        }

        binding.btnQ1A1.setOnClickListener(view -> {
            if (binding.btnQ1A1.getText().equals(String.valueOf(q1.getResult()))) {
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
            if (binding.btnQ1A2.getText().equals(String.valueOf(q1.getResult()))) {
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
        MathQuestion q2 = MathQuestion.getMathQuestion();
        binding.tvQuestion2.setText(q2.getQuestion());
        if (RANDOM.nextBoolean()) {
            binding.btnQ2A1.setText(String.valueOf(q2.getResult()));
            binding.btnQ2A2.setText(String.valueOf(
                    RANDOM.nextBoolean() ?
                            q1.getResult() + RANDOM.nextInt(2) :
                            q1.getResult() - RANDOM.nextInt(2)));
        } else {
            binding.btnQ2A2.setText(String.valueOf(q2.getResult()));
            binding.btnQ2A1.setText(String.valueOf(
                    RANDOM.nextBoolean() ?
                            q1.getResult() + RANDOM.nextInt(2) :
                            q1.getResult() - RANDOM.nextInt(2)));
        }

        binding.btnQ2A1.setOnClickListener(view -> {
            if (binding.btnQ2A1.getText().equals(String.valueOf(q2.getResult()))) {
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
            if (binding.btnQ2A2.getText().equals(String.valueOf(q2.getResult()))) {
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
        MathQuestion q3 = MathQuestion.getMathQuestion();
        binding.tvQuestion3.setText(q3.getQuestion());
        if (RANDOM.nextBoolean()) {
            binding.btnQ3A1.setText(String.valueOf(q3.getResult()));
            binding.btnQ3A2.setText(String.valueOf(
                    RANDOM.nextBoolean() ?
                            q1.getResult() + RANDOM.nextInt(2) :
                            q1.getResult() - RANDOM.nextInt(2)));
        } else {
            binding.btnQ3A2.setText(String.valueOf(q3.getResult()));
            binding.btnQ3A1.setText(String.valueOf(
                    RANDOM.nextBoolean() ?
                            q1.getResult() + RANDOM.nextInt(2) :
                            q1.getResult() - RANDOM.nextInt(2)));
        }

        binding.btnQ3A1.setOnClickListener(view -> {
            if (binding.btnQ3A1.getText().equals(String.valueOf(q3.getResult()))) {
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
            if (binding.btnQ3A2.getText().equals(String.valueOf(q3.getResult()))) {
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

        binding.btnSubmitMath.setOnClickListener(view -> {
            editor.commit();
            finish();
        });
    }

    static class MathQuestion {

        private static final boolean ADDITION = true;
        private static final boolean SUBTRACTION = false;

        int opr1;
        int opr2;

        boolean operand;
        int result;

        public MathQuestion(int opr1, int opr2, boolean operand, int result) {
            this.opr1 = opr1;
            this.opr2 = opr2;
            this.operand = operand;
            this.result = result;
        }

        public static MathQuestion getMathQuestion() {
            int opr1 = RANDOM.nextInt(10);
            int opr2 = RANDOM.nextInt(10);
            boolean operand = RANDOM.nextBoolean();
            return new MathQuestion(opr1, opr2, operand, operand ? opr1 + opr2 : opr1 - opr2);
        }

        public String getQuestion() {
            return String.format("%d %s %d", opr1, operand ? "+" : "-", opr2);
        }

        public int getResult() {
            return result;
        }
    }
}
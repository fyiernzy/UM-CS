package com.example.wia2007_py2023.practical7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.example.wia2007_py2023.R;
import com.example.wia2007_py2023.databinding.P7FragmentHomeBinding;

public class FragmentHome extends Fragment {

    private P7FragmentHomeBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = P7FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.btnCat.setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.DestCat);
        });

        binding.btnDog.setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.DestDog);
        });

        return view;
    }
}

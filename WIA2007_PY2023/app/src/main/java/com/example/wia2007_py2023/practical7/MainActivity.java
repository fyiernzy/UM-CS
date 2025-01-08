package com.example.wia2007_py2023.practical7;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.wia2007_py2023.R;
import com.example.wia2007_py2023.databinding.P7ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.wia2007_py2023.databinding.P7ActivityMainBinding binding = P7ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                binding.drawerLayout,
                binding.toolBar,
                R.string.drawer_opened,
                R.string.drawer_closed);
        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavHostFragment host = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentContainerView);
        NavController navController = host.getNavController();

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration
                .Builder(R.id.DestAbout, R.id.DestHome)
                .setOpenableLayout(binding.drawerLayout)
                .build();

        NavigationUI.setupWithNavController(binding.toolBar, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.p7SideNav, navController);
        NavigationUI.setupWithNavController(binding.p7BottomNav, navController);
    }
}

package com.uth.sistemalogin;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.uth.sistemalogin.databinding.ActivitySuccessBinding;

public class Success extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySuccessBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySuccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_success);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
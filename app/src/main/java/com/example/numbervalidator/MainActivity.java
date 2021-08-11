package com.example.numbervalidator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.numbervalidator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setUpClickListeners();
    }

    private void setUpClickListeners() {
        binding.btnIsPositive.setOnClickListener(
                v ->  {
                    Log.d("MainActivity","Clicked isPositive btn number is: " + readNumber());
                    updateTvResult(NumberValidator.isPositive(readNumber()));
                }
        );
        binding.btnIsNegative.setOnClickListener(
                v ->  {
                    Log.d("MainActivity", "Clicked isNegative btn number is: " + readNumber());
                    updateTvResult(NumberValidator.isNegative(readNumber()));
                }
        );
    }

    private int readNumber() {
        if (binding.etEnterNumber.getText().toString().equals("")) {
            return 0;
        }
        return Integer.parseInt(binding.etEnterNumber.getText().toString());
    }

    private void updateTvResult(boolean result) {
        if (result) {
            binding.tvResult.setText(R.string.positive_result);
        }
        else {
            binding.tvResult.setText(R.string.negative_result);
        }
    }

}

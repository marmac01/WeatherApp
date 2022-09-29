package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

HourForecast hf = new HourForecast();
hf.setTemperature(32.4);
TextView tv = findViewById(R.id.tv_message);
String text = getString(R.string.str_tv_message, hf.getTemperature());
tv.setText(text);
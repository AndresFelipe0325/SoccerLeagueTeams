package com.andrew.soccerleagueteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.andrew.soccerleagueteams.Interface.MainActivityInterface;

public class MainActivity extends AppCompatActivity implements MainActivityInterface.MainActivityView, MainActivityInterface.MainActivityPresenter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}

package com.ulvia.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DressPress(View view) {
    }

    public void BagsPress(View view) {
        Intent intent = new Intent (this, BagsActivity.class);
        startActivity(intent);
    }

    public void ShoesPress(View view) {
    }

    public void ExitPress(View view) {
    }
}

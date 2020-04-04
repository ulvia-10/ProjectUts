package com.ulvia.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DressPress(View view) {
        Intent intent = new Intent(this, DressActivity.class);
        startActivity(intent);
    }

    public void BagsPress(View view) {
        Intent intent = new Intent (this, BagsActivity.class);
        startActivity(intent);
    }

    public void ShoesPress(View view) {
        Intent intent = new Intent(this, ShoesActivity.class);
        startActivity(intent);
    }

    public void ExitPress(View view) {
        int backButtonCount = -1;
        if(backButtonCount >= 2)
        {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Press the back button once again to close the application.", Toast.LENGTH_SHORT).show();
            backButtonCount++;
        }
    }
}

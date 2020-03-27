package com.ulvia.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ulvia.projectuts.adapter.Adapter;
import com.ulvia.projectuts.model.Logo;

import java.util.ArrayList;
import java.util.List;

public class ShoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);

        RecyclerView shoesView = findViewById(R.id.rv_album);
        List<Logo> shoes = new ArrayList<>();
        shoes.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/LMbaoLI.webp", "Kania Cream Almond"));
        shoes.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/LG1RKF.webp", "Ghina Indigo"));
        shoes.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/zcQ6NEYPrKpmu628hXGYaoge.webp","Roxy Capella"));
        Adapter adapter = new Adapter(this, shoes);
        shoesView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        shoesView.setLayoutManager(layoutManager);
    }
}

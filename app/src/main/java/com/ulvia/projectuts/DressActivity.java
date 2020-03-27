package com.ulvia.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ulvia.projectuts.adapter.Adapter;
import com.ulvia.projectuts.model.Logo;

import java.util.ArrayList;
import java.util.List;

public class DressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress);

        RecyclerView dressView = findViewById(R.id.rv_album);

        List<Logo> dress = new ArrayList<>();
        dress.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/b1wy7fu4IO6qggEDRG5wXf6.webp", "Azmiya Blossom"));
        dress.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/EmUhrolmeI2jhoWa4T8p1q5.webp","Tiffany Dress"));
        dress.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/t3TNTwkKNzD6ed6LRXZXKVl7.webp", "Cempaka Wilis"));
        dress.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/8NVsTb9i8V9rfxbUp67ZKe00.webp","Afra Ruby"));
        dress.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/LYutobjMAyEjtHwlv5AQvJlK.webp","Ayumi Navy"));
        dress.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/bHrgLOwWaxImJHunL1uWbuGV.webp", "Rachel Mauve"));
        dress.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/lfuQKqrT0ZM38dhqm4vhFFmI.webp","Bella Red Ginger"));
        Adapter adapter = new Adapter(this, dress);
        dressView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        dressView.setLayoutManager(layoutManager);
    }
}
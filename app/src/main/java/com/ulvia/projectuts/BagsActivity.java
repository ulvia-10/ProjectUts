package com.ulvia.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ulvia.projectuts.adapter.Adapter;
import com.ulvia.projectuts.model.Logo;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

public class BagsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bags);

        RecyclerView bagsView = findViewById(R.id.rv_album);
        List<Logo> bags = new ArrayList<>();
        bags.add(new Logo("https://img.berdu.my.id/img/200/vn2yyd7vn4r9okm3/j9ADpoHbzT7AIvNraP629.jpg", "Lumi Mutiara"));
        bags.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/UVWsophE1coLBnab2xM4A2dk.webp", "Hakku Creme"));
        bags.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/VtYiCgYNKzqPChiUs1MqSf4p.webp", "Kara Bubble Gum"));
        bags.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/xNiyo3cDlBjYZLYLC61ZvSZ.webp", "Kara Chocolate"));
        bags.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/SuQsZYDZzeS4VJjf0p7NIwzk.webp", "Kara Magme"));
        bags.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/fssmCgDUlLHJpdNNIC29yK2b.webp","Karra Berry"));
        bags.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/2D15GT5vj15cBy4n4p6Acf.webp","Lumi Intan"));

        Adapter adapter = new Adapter(this, bags);
        bagsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        bagsView.setLayoutManager(layoutManager);
    }
}

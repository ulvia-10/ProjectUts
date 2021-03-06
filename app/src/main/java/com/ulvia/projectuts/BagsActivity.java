package com.ulvia.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ulvia.projectuts.adapter.Adapter;
import com.ulvia.projectuts.model.Detail;
import com.ulvia.projectuts.model.DetailList;
import com.ulvia.projectuts.model.Logo;

import java.util.ArrayList;
import java.util.List;

public class BagsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bags);

        RecyclerView bagsView = findViewById(R.id.rv_album);
        List<Logo> bags = new ArrayList<>();
        bags.add(new Logo("https://img.berdu.my.id/img/200/vn2yyd7vn4r9okm3/j9ADpoHbzT7AIvNraP629.jpg", "Lumi Mutiara",1));
        bags.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/UVWsophE1coLBnab2xM4A2dk.webp", "Hakku Creme",2));
        bags.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/VtYiCgYNKzqPChiUs1MqSf4p.webp", "Kara Bubble Gum",3));
        bags.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/xNiyo3cDlBjYZLYLC61ZvSZ.webp", "Kara Chocolate",4));
        bags.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/SuQsZYDZzeS4VJjf0p7NIwzk.webp", "Kara Magme",5));
        bags.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/fssmCgDUlLHJpdNNIC29yK2b.webp","Karra Berry",6));
        bags.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/2D15GT5vj15cBy4n4p6Acf.webp","Lumi Intan",7));

        Adapter adapter = new Adapter(this, bags);
        adapter.setListdetail(DetailList.getListData3());
        bagsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        bagsView.setLayoutManager(layoutManager);
    }
}

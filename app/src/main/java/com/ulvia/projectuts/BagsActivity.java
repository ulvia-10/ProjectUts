package com.ulvia.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ulvia.projectuts.adapter.Adapter;
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
        bags.add(new Logo("https://www.google.com/imgres?imgurl=https%3A%2F%2Fimg.berdu.my.id%2Fimg%2F800%2Fvn2yyd7vn4r9okm3%2FNdRIA9VNdyKMzdSTRMNCHt.jpg&imgrefurl=https%3A%2F%2Fjilbrave.com%2Fproduct%2Flumi-mutiara&tbnid=JKNo4deeFY-PUM&vet=12ahUKEwj5ycqLsbroAhUEeSsKHU5HBZQQMygAegUIARDyAQ..i&docid=_GNiXeARsF3PcM&w=800&h=1199&itg=1&q=Lumi%20Mutiara&safe=strict&ved=2ahUKEwj5ycqLsbroAhUEeSsKHU5HBZQQMygAegUIARDyAQ","Lumi Mutiara"));
        Adapter adapter = new Adapter(this, bags);
        bagsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        bagsView.setLayoutManager(layoutManager);
    }
}

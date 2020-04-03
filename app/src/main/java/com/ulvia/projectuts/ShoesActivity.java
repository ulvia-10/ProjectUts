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
        shoes.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/LMbaoLI.webp", "Kania Cream Almond",1));
        shoes.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/LG1RKF.webp", "Ghina Indigo",2));
        shoes.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/zcQ6NEYPrKpmu628hXGYaoge.webp","Roxy Capella",3));
        shoes.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/LMbekiZ.webp","Kania Snow Grey",4));
        shoes.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/VTsxrokK0fad9WF9XWDu5B2.webp","Zooela Berry",5));
        shoes.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/LG1mu0L.webp","Ghina Charcoal",6));
        shoes.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/TSobOp1lswFiW7cfuHOxRgfG.webp","Zooela Almond",7));
        shoes.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/vsksu1CwKJFWprrpAzX9T.webp","Roxy Vega",8));
        shoes.add(new Logo("https://img.berdu.my.id/img/400/vn2yyd7vn4r9okm3/AzRIEVbEiEdRqFSeW5gv2Dvp.webp","Roxy Antares",9));
        Adapter adapter = new Adapter(this, shoes);
        shoesView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        shoesView.setLayoutManager(layoutManager);
    }
}

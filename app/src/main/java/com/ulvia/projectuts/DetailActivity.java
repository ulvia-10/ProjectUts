package com.ulvia.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.ulvia.projectuts.model.Detail;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_ITEM = "extra_item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView logo = findViewById(R.id.logo);
        TextView stok = findViewById(R.id.item_stok);
        TextView title = findViewById(R.id.item_role);
        TextView description = findViewById(R.id.item_desc);
        TextView harga = findViewById(R.id.item_harga);

        Detail detail = getIntent().getParcelableExtra(EXTRA_ITEM);
        Picasso.get().load(detail.getLogo()).into(logo);
        stok.setText(detail.getStok());
        title.setText(detail.getJudul());
        description.setText(detail.getDesc());
        harga.setText((detail.getHarga()));

    }
}

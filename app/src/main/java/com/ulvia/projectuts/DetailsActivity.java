package com.ulvia.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ulvia.projectuts.model.Detail;

public class DetailsActivity extends AppCompatActivity {
    public static final String EXTRA_ITEM = "extra_item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView judul = findViewById(R.id.text_name);
        TextView description = findViewById(R.id.item_role);

        Detail detail = getIntent().getParcelableExtra(EXTRA_ITEM);
        judul.setText(detail.getLogo());
    }
}

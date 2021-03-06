package com.ulvia.projectuts.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.ulvia.projectuts.DetailActivity;
import com.ulvia.projectuts.R;
import com.ulvia.projectuts.model.Detail;
import com.ulvia.projectuts.model.Item;
import com.ulvia.projectuts.model.Logo;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context context;
    private List<Logo> items;
    private ArrayList<Detail> listdetail;

    public Adapter(Context context, List<Logo> items) {
        this.context = context;
        this.items = items;
    }

    public void setListdetail(ArrayList<Detail> listdetail) {
        this.listdetail = listdetail;
    }
    public ArrayList<Detail> getListdetail() {
        return listdetail;
    }

    // Define listener member variable
    private AdapterView.OnItemClickListener listener;

    // Define the method that allows the parent activity or fragment to define the listener
    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        this.listener = listener;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_logo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Logo item = items.get(position);
        holder.nameText.setText(item.getName());

        Picasso.get().load(item.getLogo()).into(holder.logoImage);
        //intent parcelable to detail
        holder.nameText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailActivity = new Intent(context, DetailActivity.class);
                detailActivity.putExtra(DetailActivity.EXTRA_ITEM, listdetail.get(position));
                context.startActivity(detailActivity);
            }
        });
    }

    @Override
    public int getItemCount() {

        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView logoImage;
        TextView nameText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.logoImage = itemView.findViewById(R.id.image_logo);
            this.nameText = itemView.findViewById(R.id.text_name);
            itemView.setOnClickListener(this);

        }
        @Override
        public void onClick(View view) {
            int position = getAdapterPosition(); // gets item position
            if (position != RecyclerView.NO_POSITION) { // Check if an item was deleted, but the user clicked it before the UI removed it
                // We can access the data within the views
                Toast.makeText(context, nameText.getText(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}

package com.smart.tamanpintar;

import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private List<DataList> itemList;
    private ClickListener clicklistener = null;

    public MyListAdapter(List<DataList>itemList){
        this.itemList = itemList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textTitle;
        public CardView cardView;
        public LinearLayout main;
        public ViewHolder(View parent) {
            super(parent);
            this.cardView = itemView.findViewById(R.id.cardView);
            this.imageView = itemView.findViewById(R.id.list_img);
            this.textTitle = itemView.findViewById(R.id.list_title);
            this.main = itemView.findViewById(R.id.main);
            main.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), "Position:" + Integer.toString(getPosition()), Toast.LENGTH_SHORT).show();
                    if (clicklistener != null) {
                        clicklistener.itemClicked(v, getAdapterPosition());
                    }
                }
            });
        }
    }

    public void setClickListener(ClickListener clickListener){
        this.clicklistener = clickListener;
    }

    @NonNull
    @Override
    public MyListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyListAdapter.ViewHolder holder, int position) {
        DataList row = itemList.get(position);
        holder.imageView.setImageResource(row.getImageId());
        holder.textTitle.setText(row.getTitle());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
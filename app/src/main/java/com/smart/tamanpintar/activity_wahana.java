package com.smart.tamanpintar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class activity_wahana extends AppCompatActivity implements ClickListener {
    private List<DataList> itemList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MyListAdapter mAdapter;
    private LinearLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wahana);

        getSupportActionBar().setTitle("WAHANA");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        prepareItem();

        mAdapter = new MyListAdapter(itemList);
        mAdapter.setClickListener(this);
        RecyclerView.LayoutManager mLayoutManger = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManger);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }

    private void prepareItem(){
        DataList item1 = new DataList(R.drawable.wahana_gedung_kotak, "Gedung Kotak");
        itemList.add(item1);
        DataList item2 = new DataList(R.drawable.wahana_gedung_oval, "Gedung Oval");
        itemList.add(item2);
        DataList item3 = new DataList(R.drawable.wahana_kampung_kerajinan, "Kampung Kerajinan");
        itemList.add(item3);
    }

    @Override
    public void itemClicked(View view, int position){
        if(position==0) {
            Intent intent = new Intent(this, activity_wahana_gedungkotak.class);
            startActivity(intent);
        }

        if(position==1) {
            Intent intent = new Intent(this, activity_wahana_gedungoval.class);
            startActivity(intent);
        }

        if(position==2) {
            Intent intent = new Intent(this, activity_wahana_kampungkerajinan.class);
            startActivity(intent);
        }
    }
}
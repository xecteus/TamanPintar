package com.smart.tamanpintar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_wahana_go_purba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wahana_go_purba);

        getSupportActionBar().setTitle("ZONA KEHIDUPAN PURBA");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

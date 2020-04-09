package com.smart.tamanpintar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_wahana_gk_teknologi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wahana_gk_teknologi);

        getSupportActionBar().setTitle("ZONA TEKNOLOGI POPULER");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

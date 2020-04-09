package com.smart.tamanpintar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_profil_tujuan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_tujuan);

        getSupportActionBar().setTitle("TUJUAN");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

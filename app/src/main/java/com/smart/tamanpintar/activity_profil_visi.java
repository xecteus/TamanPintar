package com.smart.tamanpintar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_profil_visi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_visi);

        getSupportActionBar().setTitle("VISI MISI");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

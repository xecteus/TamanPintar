package com.smart.tamanpintar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class activity_profil_sejarah extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_sejarah);

        getSupportActionBar().setTitle("SEJARAH");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

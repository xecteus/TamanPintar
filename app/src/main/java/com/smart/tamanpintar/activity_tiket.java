package com.smart.tamanpintar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_tiket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiket);

        getSupportActionBar().setTitle("HARGA TIKET");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

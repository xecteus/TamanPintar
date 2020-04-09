package com.smart.tamanpintar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_profil extends AppCompatActivity {
    private Button bSejarah, bVisi, bTujuan, bLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        getSupportActionBar().setTitle("PROFIL TAMAN PINTAR");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bSejarah = (Button) findViewById(R.id.bSejarah);
        bVisi = (Button) findViewById(R.id.bVisi);
        bTujuan = (Button) findViewById(R.id.bTujuan);
        bLogo = (Button) findViewById(R.id.bLogo);
        bSejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSejarah();
            }
        });
        bVisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoVisi();
            }
        });
        bTujuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoTujuan();
            }
        });
        bLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoLogo();
            }
        });
    }

    public void gotoSejarah(){
        Intent intent = new Intent(this, activity_profil_sejarah.class);
        startActivity(intent);
    }

    public void gotoVisi(){
        Intent intent = new Intent(this, activity_profil_visi.class);
        startActivity(intent);
    }
    
    public void gotoTujuan(){
        Intent intent = new Intent(this, activity_profil_tujuan.class);
        startActivity(intent);
    }

    public void gotoLogo(){
        Intent intent = new Intent(this, activity_profil_logo.class);
        startActivity(intent);
    }
}

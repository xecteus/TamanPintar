package com.smart.tamanpintar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_wahana_gedungoval extends AppCompatActivity {
    private Button bIklim, bPurba, bDome, bSurya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wahana_gedungoval);

        getSupportActionBar().setTitle("GEDUNG OVAL");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bIklim = (Button) findViewById(R.id.bIklim);
        bPurba = (Button) findViewById(R.id.bPurba);
        bDome = (Button) findViewById(R.id.bDome);
        bSurya = (Button) findViewById(R.id.bSurya);
        bIklim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoIklim();
            }
        });
        bPurba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoPurba();
            }
        });
        bDome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDome();
            }
        });
        bSurya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSurya();
            }
        });
    }

    public void gotoIklim(){
        Intent intent = new Intent(this, activity_wahana_go_iklim.class);
        startActivity(intent);
    }

    public void gotoPurba(){
        Intent intent = new Intent(this, activity_wahana_go_purba.class);
        startActivity(intent);
    }

    public void gotoDome(){
        Intent intent = new Intent(this, activity_wahana_go_dome.class);
        startActivity(intent);
    }

    public void gotoSurya(){
        Intent intent = new Intent(this, activity_wahana_go_surya.class);
        startActivity(intent);
    }
}

package com.smart.tamanpintar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_wahana_kampungkerajinan extends AppCompatActivity {
    private Button bBatik, bKaos, bGerabah, bKGerabah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wahana_kampungkerajinan);

        getSupportActionBar().setTitle("KAMPUNG KERAJINAN");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bBatik = (Button) findViewById(R.id.bBatik);
        bKaos = (Button) findViewById(R.id.bKaos);
        bGerabah = (Button) findViewById(R.id.bGerabah);
        bKGerabah = (Button) findViewById(R.id.bKGerabah);
        bBatik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoBatik();
            }
        });
        bKaos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoKaos();
            }
        });
        bGerabah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoGerabah();
            }
        });
        bKGerabah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoKGerabah();
            }
        });
    }

    public void gotoBatik(){
        Intent intent = new Intent(this, activity_wahana_kk_batik.class);
        startActivity(intent);
    }

    public void gotoKaos(){
        Intent intent = new Intent(this, activity_wahana_kk_lukiskaos.class);
        startActivity(intent);
    }

    public void gotoGerabah(){
        Intent intent = new Intent(this, activity_wahana_kk_gerabah.class);
        startActivity(intent);
    }

    public void gotoKGerabah(){
        Intent intent = new Intent(this, activity_wahana_kk_kgerabah.class);
        startActivity(intent);
    }
}

package com.smart.tamanpintar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_wahana_gedungkotak extends AppCompatActivity {
    private Button bTekno, bNuklir, bAir, bIlusi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wahana_gedungkotak);

        getSupportActionBar().setTitle("GEDUNG KOTAK");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bTekno = (Button) findViewById(R.id.bTeknologi);
        bNuklir = (Button) findViewById(R.id.bNuklir);
        bAir = (Button) findViewById(R.id.bAir);
        bIlusi = (Button) findViewById(R.id.bIlusi);
        bTekno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoTekno();
            }
        });
        bNuklir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNuklir();
            }
        });
        bAir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoAir();
            }
        });
        bIlusi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoIlusi();
            }
        });
    }

    public void gotoTekno(){
        Intent intent = new Intent(this, activity_wahana_gk_teknologi.class);
        startActivity(intent);
    }

    public void gotoNuklir(){
        Intent intent = new Intent(this, activity_wahana_gk_nuklir.class);
        startActivity(intent);
    }

    public void gotoAir(){
        Intent intent = new Intent(this, activity_wahana_gk_air.class);
        startActivity(intent);
    }

    public void gotoIlusi(){
        Intent intent = new Intent(this, activity_wahana_gk_ilusi.class);
        startActivity(intent);
    }
}

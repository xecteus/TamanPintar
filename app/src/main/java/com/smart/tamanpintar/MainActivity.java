package com.smart.tamanpintar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bProfil, bWahana, bTiket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout_home);

        bProfil = (Button) findViewById(R.id.bProfil);
        bWahana = (Button) findViewById(R.id.bWahana);
        bTiket = (Button) findViewById(R.id.bTiket);
        bProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoProfil();
            }
        });
        bWahana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWahana();
            }
        });
        bTiket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoTiket();
            }
        });
    }

    public void gotoProfil() {
        Intent intent = new Intent(this, activity_profil.class);
        startActivity(intent);
    }

    public void gotoWahana() {
        Intent intent = new Intent(this, activity_wahana.class);
        startActivity(intent);
    }

    public void gotoTiket() {
        Intent intent = new Intent(this, activity_tiket.class);
        startActivity(intent);
    }

}

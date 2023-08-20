package com.example.projet_tunisie_assurance;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class client extends AppCompatActivity {
Button a, b ,c ,d, h ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);
        a = (Button) findViewById(R.id.button19);
        b = (Button) findViewById(R.id.button23);
        c = (Button) findViewById(R.id.button24);
        d = (Button) findViewById(R.id.button25);
        h = (Button) findViewById(R.id.button45);
        //interface recherche //
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y = new Intent(getApplicationContext(), recherche_client.class);
                startActivity(y);
            }
        });
        //interface ajout //
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), ajouter_client.class);
                startActivity(m);
            }
        });
        //interface modif //
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent modif = new Intent(getApplicationContext(), id_modif_client.class);
                startActivity(modif);
            }
        });
        //interface supp //
       d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spp = new Intent(getApplicationContext(), supp_client.class);
                startActivity(spp);
            }
        });
        //interface exit //
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent xx = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(xx);
            }
        });
    }
}
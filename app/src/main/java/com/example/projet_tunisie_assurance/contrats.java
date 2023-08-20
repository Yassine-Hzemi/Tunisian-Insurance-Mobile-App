package com.example.projet_tunisie_assurance;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class contrats extends AppCompatActivity {
Button recherche, ajout, modif, supp, exit ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrats);
        recherche = (Button) findViewById(R.id.button);
        ajout = (Button) findViewById(R.id.button2);
        modif = (Button) findViewById(R.id.button5);
        supp = (Button) findViewById(R.id.button6);
        exit = (Button) findViewById(R.id.button47);
        //interface recherche //
        recherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rch = new Intent(getApplicationContext(), res_recherche_contrat.class);
                startActivity(rch);
            }
        });
        //interface ajout //
        ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rch = new Intent(getApplicationContext(), ajouter_contrat.class);
                startActivity(rch);
            }
        });
        //interface modif //
        modif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rch = new Intent(getApplicationContext(), id_modif_contrat.class);
                startActivity(rch);
            }
        });
        //interface supp //
        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rch = new Intent(getApplicationContext(), supprimer_contrat.class);
                startActivity(rch);
            }
        });
        //interface exit //
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rch = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(rch);
            }
        });

    }
}
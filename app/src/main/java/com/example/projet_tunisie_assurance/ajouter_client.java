package com.example.projet_tunisie_assurance;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class ajouter_client extends AppCompatActivity {
Button retour_ajout, exit_ajout ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_client);

        //interface retour//
        retour_ajout = (Button) findViewById(R.id.button33);
        retour_ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent retour_intent1 = new Intent(getApplicationContext(), client.class);
                startActivity(retour_intent1);
            }
        });
        exit_ajout = (Button) findViewById(R.id.button34);

        //interface exit//
        exit_ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exit_intent1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(exit_intent1);
            }
        });
    }
}
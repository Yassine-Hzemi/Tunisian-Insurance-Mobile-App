package com.example.projet_tunisie_assurance;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class res_recherche_client extends AppCompatActivity {
Button k , l ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_recherche_client);

        k = (Button) findViewById(R.id.button39);

        //interface retour//
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(getApplicationContext(), client.class);
                startActivity(w);
            }
        });
        l = (Button) findViewById(R.id.button40);

        //interface exit//
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exit_int = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(exit_int);
            }
        });
    }
}
package com.example.projet_tunisie_assurance;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class supprimer_contrat extends AppCompatActivity {
Button t, e ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supprimer_contrat);
        t = (Button) findViewById(R.id.button27);

        //interface retour//
       t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rtt = new Intent(getApplicationContext(), contrats.class);
                startActivity(rtt);
            }
        });
        e = (Button) findViewById(R.id.button28);

        //interface exit//
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent extt = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(extt);
            }
        });
    }
}
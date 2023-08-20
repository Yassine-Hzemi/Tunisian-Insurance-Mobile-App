package com.example.projet_tunisie_assurance;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class recherche_client extends AppCompatActivity {
Button rechC ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche_client);
        rechC = (Button) findViewById(R.id.button26);

        //interface contrat//
        rechC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), res_recherche_client.class);
                startActivity(i);
            }
        });
    }
}
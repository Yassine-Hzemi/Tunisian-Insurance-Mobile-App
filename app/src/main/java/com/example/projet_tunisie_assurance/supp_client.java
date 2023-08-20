package com.example.projet_tunisie_assurance;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class supp_client extends AppCompatActivity {
Button sup_retour, sup_exit ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supp_client);
        sup_retour = (Button) findViewById(R.id.button43);

        //interface retour//
        sup_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _rtt = new Intent(getApplicationContext(), client.class);
                startActivity(_rtt);
            }
        });
        sup_exit = (Button) findViewById(R.id.button44);

        //interface exit//
        sup_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _extt = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(_extt);
            }
        });
    }
}
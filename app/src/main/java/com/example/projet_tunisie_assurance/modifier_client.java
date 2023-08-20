package com.example.projet_tunisie_assurance;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class modifier_client extends AppCompatActivity {
 Button r1, x1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_client);
        //interface retour//
        r1 = (Button) findViewById(R.id.button31);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rt_ = new Intent(getApplicationContext(), client.class);
                startActivity(rt_);
            }
        });
        x1 = (Button) findViewById(R.id.button41);

        //interface exit//
        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ext_ = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ext_);
            }
        });
    }
}
package com.example.projet_tunisie_assurance;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class modifier_contrat extends AppCompatActivity {
    Button r, x ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_contrat);


        r = (Button) findViewById(R.id.button13);

        //interface retour//
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rt = new Intent(getApplicationContext(), contrats.class);
                startActivity(rt);
            }
        });
        x = (Button) findViewById(R.id.button16);

        //interface exit//
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ext = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ext);
            }
        });
    }
}
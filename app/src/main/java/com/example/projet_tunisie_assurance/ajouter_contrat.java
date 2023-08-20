package com.example.projet_tunisie_assurance;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;


public class ajouter_contrat extends AppCompatActivity {
Button tt, xx, ajout  ;
SQLiteDatabase db;
EditText ref, dd,df, red ;
 int op = 0;
    String x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_contrat);

        ref = (EditText) findViewById(R.id.editTextTextPersonName34);
        dd = (EditText) findViewById(R.id.editTextTextPersonName35);
        df = (EditText) findViewById(R.id.editTextTextPersonName36);
        red = (EditText) findViewById(R.id.editTextTextPersonName37);

        ajout = (Button) findViewById(R.id.button20);

        ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = 1;
                ref.setText("");
                dd.setText("");
                df.setText("");
                red.setText("");
                ajout.setEnabled(false);
                if (op == 1){
                    // insertion
                    db.execSQL("insert into CONTRATS (ref,date_d,date_f,redevence) values (?,?,?,?);", new String[] {ref.getText().toString(),dd.getText().toString(),df.getText().toString(),red.getText().toString()});
                }
                ajout.setVisibility(View.VISIBLE);

            }
        });
        //interface retour//
        tt = (Button) findViewById(R.id.button21);
        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent retour_intent = new Intent(getApplicationContext(), contrats.class);
                startActivity(retour_intent);
            }
        });
        xx = (Button) findViewById(R.id.button22);

        //interface exit//
        xx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exit_intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(exit_intent);
            }
        });

    }
}
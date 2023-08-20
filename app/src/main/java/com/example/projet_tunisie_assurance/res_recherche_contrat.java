package com.example.projet_tunisie_assurance;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class res_recherche_contrat extends AppCompatActivity {
    Cursor cur;
    SQLiteDatabase db;
    LinearLayout layNaviguer, layRecherche;
    EditText refr, ref, dd,df, red ;
    ImageButton btnrech;
    Button btnFirst,btnPrevious,btnNext,btnLast;
    Button retour, exit ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_recherche_contrat);

        layNaviguer = (LinearLayout) findViewById(R.id.l1);
        layRecherche= (LinearLayout) findViewById(R.id.l2);
        //ouverture base de données

        refr = (EditText) findViewById(R.id.editTextTextPersonName10);
        ref = (EditText) findViewById(R.id.editTextTextPersonName3);
        dd = (EditText) findViewById(R.id.editTextTextPersonName4);
        df = (EditText) findViewById(R.id.editTextTextPersonName5);
        red = (EditText) findViewById(R.id.editTextTextPersonName6);

        btnFirst = (Button) findViewById(R.id.button7);
        btnPrevious = (Button) findViewById(R.id.button8);
        btnNext = (Button) findViewById(R.id.button11);
        btnLast = (Button) findViewById(R.id.button10);
        btnrech = (ImageButton) findViewById(R.id.BTNRECH);
        btnrech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = db.rawQuery("select * from CONTRATS where ref like ?", new String[]{"%" + refr.getText().toString() + "%"});
                try {
                    cur.moveToFirst();
                    ref.setText(cur.getString(1));
                    dd.setText(cur.getString(2));
                    df.setText(cur.getString(3));
                    red.setText(cur.getInt(4));
                    if (cur.getCount() == 1){
                        layNaviguer.setVisibility(View.INVISIBLE);
                    } else {
                        layNaviguer.setVisibility(View.VISIBLE);
                        btnPrevious.setEnabled(false);
                        btnNext.setEnabled(true);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(),"aucun résultat.",Toast.LENGTH_SHORT).show();
                    ref.setText("");
                    dd.setText("");
                    df.setText("");
                    red.setText("");
                    layNaviguer.setVisibility(View.INVISIBLE);
                }
            }
        });
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    cur.moveToFirst();
                    ref.setText(cur.getString(1));
                    dd.setText(cur.getString(2));
                    df.setText(cur.getString(3));
                    red.setText(cur.getInt(4));
                    btnPrevious.setEnabled(false);
                    btnNext.setEnabled(true);

                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(),"aucun compte n'est existant.",Toast.LENGTH_SHORT).show();

                }
            }
        });
        btnLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    cur.moveToLast();
                    ref.setText(cur.getString(1));
                    dd.setText(cur.getString(2));
                    df.setText(cur.getString(3));
                    red.setText(cur.getInt(4));
                    btnPrevious.setEnabled(true);
                    btnNext.setEnabled(false);

                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(),"aucun compte n'est existant.",Toast.LENGTH_SHORT).show();

                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    cur.moveToNext();
                    ref.setText(cur.getString(1));
                    dd.setText(cur.getString(2));
                    df.setText(cur.getString(3));
                    red.setText(cur.getInt(4));
                    btnPrevious.setEnabled(true);
                    if (cur.isLast()){
                        btnNext.setEnabled(false);
                    }


                } catch (Exception e) {
                    e.printStackTrace();


                }
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    cur.moveToPrevious();
                    ref.setText(cur.getString(1));
                    dd.setText(cur.getString(2));
                    df.setText(cur.getString(3));
                    red.setText(cur.getInt(4));
                    btnNext.setEnabled(true);
                    if (cur.isFirst()){
                        btnPrevious.setEnabled(false);
                    }


                } catch (Exception e) {
                    e.printStackTrace();


                }
            }
        });
        exit = (Button) findViewById(R.id.button15);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rch = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(rch);
            }
        });
        retour = (Button) findViewById(R.id.button14);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent retour_intent = new Intent(getApplicationContext(), contrats.class);
                startActivity(retour_intent);
            }
        });

    }
}
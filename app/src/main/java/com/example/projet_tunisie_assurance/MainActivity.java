package com.example.projet_tunisie_assurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button contrat, client;
    SQLiteDatabase db ; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contrat = (Button) findViewById(R.id.button3);
        client = (Button) findViewById(R.id.button4);
        //create database//
        db = openOrCreateDatabase("TunisieAssuranceDB",MODE_PRIVATE,null);
        //create tables //
      //  db.execSQL("drop table CONTRATS");
     //   db.execSQL("drop table CLIENTS");

        db.execSQL("CREATE TABLE IF NOT EXISTS CONTRATS (id_contrat integer primary key AUTOINCREMENT, ref varchar, date_d varchar, date_f varchar, redevence integer, client_id integer);");
        db.execSQL("CREATE TABLE IF NOT EXISTS  CLIENTS (id_client integer primary key AUTOINCREMENT, nom varchar, adresse varchar, tel integer, fax integer, contact varchar, telcontact integer);");
        //insertion dans contrats
        db.execSQL("insert into CONTRATS (ref,date_d,date_f,redevence,client_id) values ('A23456','12-11-2022','12-12-2023',120,null)") ;
        db.execSQL("insert into CONTRATS (ref,date_d,date_f,redevence,client_id) values ('B23456','12-11-2022','12-12-2023',440,null)") ;

        //db.execSQL("insert into CONTRATS (nomc,ref,date_d,date_f,redevence) values ('ali','B23756','20-11-21','12-12-22',134,null)") ;
     //   db.execSQL("insert into CONTRATS (nomc,ref,date_d,date_f,redevence) values ('yassine',C20056,24-11-21,11-12-23,155)") ;
     //   db.execSQL("insert into CONTRATS (nomc,ref,date_d,date_f,redevence) values ('salwa',D23211,27-11-22,05-03-24,100)") ;
        //INSERTION DANS Clients
        db.execSQL("insert into CLIENTS (nom,adresse,tel,fax,contact,telcontact) values ('mayssa','tunis',22222222,71000022,'m.gmail.com',333311333)") ;
        db.execSQL("insert into CLIENTS (nom,adresse,tel,fax,contact,telcontact) values ('yassine','tunis',22233322,71000022,'y.gmail.com',322311333)") ;

        //   db.execSQL("insert into CLIENTS (nom,adresse,tel,fax,contact,telcontact) values (ali,tunis,22255522,71000011,a.gmail.com,333990033)") ;
       // db.execSQL("insert into CLIENTS (nom,adresse,tel,fax,contact,telcontact) values (yassine,tunis,22889922,71000055,y.gmail.com,333003333)") ;
       // db.execSQL("insert into CLIENTS (nom,adresse,tel,fax,contact,telcontact) values (salwa,tunis,22222342,71000077,s.gmail.com,333331133)") ;

        //interface contrat//
        contrat.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crt = new Intent(getApplicationContext(), contrats.class);
                startActivity(crt);
            }
        });

        //interface client//

        client.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clt = new Intent(getApplicationContext(), client.class);
                startActivity(clt);
            }
        });



    }
}

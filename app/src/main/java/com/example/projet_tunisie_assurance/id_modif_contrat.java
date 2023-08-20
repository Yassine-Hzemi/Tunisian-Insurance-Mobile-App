package com.example.projet_tunisie_assurance;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class id_modif_contrat extends AppCompatActivity {
Button suivant ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id_modif_contrat);
        suivant = (Button) findViewById(R.id.button17);

        //interface contrat//
        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(getApplicationContext(), modifier_contrat.class);
                startActivity(s);
            }
        });
    }
}
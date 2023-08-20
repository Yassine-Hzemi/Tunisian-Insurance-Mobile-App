package com.example.projet_tunisie_assurance;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class id_modif_client extends AppCompatActivity {
Button modif_btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id_modif_client);
        modif_btn = (Button) findViewById(R.id.button30);

        //interface contrat//
        modif_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ss = new Intent(getApplicationContext(), modifier_client.class);
                startActivity(ss);
            }
        });
    }
}
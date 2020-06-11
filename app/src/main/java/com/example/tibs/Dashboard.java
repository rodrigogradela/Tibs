package com.example.tibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
private Button teste;
Button btnfrota;
Button btnperfil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        teste =findViewById(R.id.btnrastreio);


        teste.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                        startActivity(new Intent(Dashboard.this, Searchline.class));



            }
        });


        btnfrota =findViewById(R.id.btnfrota);


        btnfrota.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                startActivity(new Intent(Dashboard.this, Buscarlinhagrafico.class));



            }
        });

        btnperfil =findViewById(R.id.btnperfil);


        btnperfil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                startActivity(new Intent(Dashboard.this, Perfil.class));



            }
        });
    }
}

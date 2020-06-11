package com.example.tibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Embarque extends AppCompatActivity {
Button btncarteiraes;
Button btndesembarque;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embarque);

        btncarteiraes =findViewById(R.id.btnestudante);


        btncarteiraes.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                startActivity(new Intent(Embarque.this, Carteira.class));



            }
        });
        btndesembarque =findViewById(R.id.btndesem);


        btndesembarque.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                startActivity(new Intent(Embarque.this, Desembarque.class));



            }
        });
    }
}

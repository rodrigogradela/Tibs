package com.example.tibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rastreio extends AppCompatActivity {
Button btnembarcar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rastreio);

        btnembarcar =findViewById(R.id.btnembarcar);


        btnembarcar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                startActivity(new Intent(Rastreio.this, Embarque.class));



            }
        });
    }
}

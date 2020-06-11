package com.example.tibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Desembarque extends AppCompatActivity {
Button btncondesem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desembarque);

        btncondesem=findViewById(R.id.btnconcluidesem);


        btncondesem.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                startActivity(new Intent(Desembarque.this, Dashboard.class));



            }
        });
    }
}

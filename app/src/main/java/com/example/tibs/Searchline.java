package com.example.tibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class Searchline extends AppCompatActivity {
Button btnprocurar;
Button btnvoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchline);


        btnprocurar =findViewById(R.id.btnprocurar);
        final LoadingDialog loadingDialog = new LoadingDialog(Searchline.this);

        btnprocurar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                loadingDialog.startLoadingDialog();
                Handler handler= new Handler();
                long delayMillis = 3000;
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loadingDialog.dismissDialog();
                        startActivity(new Intent(Searchline.this, Rastreio.class));


                    }

                }, delayMillis = 3000);
            }
        });

        btnvoltar =findViewById(R.id.btnvoltar);


        btnvoltar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                startActivity(new Intent(Searchline.this, Dashboard.class));



            }
        });

    }
}

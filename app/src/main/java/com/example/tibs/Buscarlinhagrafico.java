package com.example.tibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class Buscarlinhagrafico extends AppCompatActivity {
Button btnprocurar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscarlinhagrafico);


        btnprocurar2 =findViewById(R.id.btnprocurar2);
        final LoadingDialog loadingDialog = new LoadingDialog(Buscarlinhagrafico.this);

        btnprocurar2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                loadingDialog.startLoadingDialog();
                Handler handler= new Handler();
                long delayMillis = 3000;
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loadingDialog.dismissDialog();
                        startActivity(new Intent(Buscarlinhagrafico.this, Grafico.class));


                    }

                }, delayMillis = 3000);
            }
        });

    }
}

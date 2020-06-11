package com.example.tibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_btn =findViewById(R.id.login_btn);
        final LoadingDialog loadingDialog = new LoadingDialog(MainActivity.this);

        login_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                loadingDialog.startLoadingDialog();
                Handler handler= new Handler();
                long delayMillis = 3000;
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loadingDialog.dismissDialog();
                        startActivity(new Intent(MainActivity.this, Dashboard.class));


                    }

                }, delayMillis = 3000);
            }
        });


    }
}

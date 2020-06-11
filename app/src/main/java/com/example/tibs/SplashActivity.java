package com.example.tibs;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.AnimatorRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private ImageView tibslogo;
    private static int splashTimeOut=4000;
    private ImageView cidades;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_splash);
    tibslogo=(ImageView)findViewById(R.id.tibslogo);
        cidades=(ImageView)findViewById(R.id.cidades);
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent i = new  Intent(SplashActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        }
    },splashTimeOut);

        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mysplashanimation);
        tibslogo.startAnimation(myanim);
        Animation myanim2= AnimationUtils.loadAnimation(this,R.anim.mysplashanimation);
        cidades.startAnimation(myanim2);
    }
}

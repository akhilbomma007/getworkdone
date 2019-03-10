package com.example.akhil.getworkdone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.logging.Handler;

public class SplashScreen extends AppCompatActivity {


    private ImageView logo;
    private static int splashTimeOut = 4000 ;  // splash time out 5sec

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);        // to remove notification bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); // to remove notification bar

        setContentView(R.layout.activity_splash_screen);

        logo = (ImageView)findViewById(R.id.logo);          // initializing logo image view to a variable named "logo"

        new android.os.Handler().postDelayed(new Runnable() {           // navigation from splash screen to Slider Activity after 4sec
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,SliderActivity.class));
                finish();
            }
        },splashTimeOut);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.my_splash_screen_animation);    // creating animation object

        logo.setAnimation(myanim);                    // setting animation to logo
    }
}

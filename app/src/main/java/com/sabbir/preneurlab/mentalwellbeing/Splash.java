package com.sabbir.preneurlab.mentalwellbeing;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * Created by Sabbir on 1/14/2018.
 */

public class Splash extends AppCompatActivity {
    private Button buttonNext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);



        //setting action bar icon and text properties
        Toolbar toolbar = findViewById(R.id.mCustomToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  Mental Health");
        getSupportActionBar().setIcon(getDrawable(R.drawable.ic_action_name));
        toolbar.setTitleTextColor(getResources().getColor(R.color.iconTintColorFrontPageButton));

        Typeface raleway = Typeface.createFromAsset(this.getAssets(), "Raleway-Regular.ttf");
        TextView toolbarText = toolbar.findViewById(R.id.toolBarTextView);
        toolbarText.setTypeface(raleway);
        toolbarText.setText("  Mental Health");


        /*// splash screen timing
        int secondsDelayed = 2;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(Splash.this, MainActivity.class));
                finish();
            }
        }, secondsDelayed * 1000);*/

        ViewFlipper viewFlipper = findViewById(R.id.flipperid);
        viewFlipper.startFlipping();

        buttonNext = findViewById(R.id.button);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Splash.this, MeasurementQuestion.class));
            }
        });

    }
}
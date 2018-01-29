package com.sabbir.preneurlab.mentalwellbeing;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Sabbir on 1/29/2018.
 */

public class Choosing extends AppCompatActivity {

    private Button button, button2, button3;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosing);

        Typeface raleway = Typeface.createFromAsset(this.getAssets(), "Raleway-Regular.ttf");
        Typeface ralewaybold = Typeface.createFromAsset(this.getAssets(), "Raleway-Bold.ttf");


        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button.setTypeface(raleway);
        button2.setTypeface(raleway);
        button3.setTypeface(raleway);

        //facebook account kit for android

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Choosing.this, Depression.class);
                startActivity(i);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Choosing.this, AngerIssue.class);
                startActivity(i);
            }
        });
    }
}

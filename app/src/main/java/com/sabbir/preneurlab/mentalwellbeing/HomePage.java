package com.sabbir.preneurlab.mentalwellbeing;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Sabbir on 1/22/2018.
 */

public class HomePage extends AppCompatActivity {

    private Button buttonmain1, buttonmain2, addpair,
            mentalhealth, othertests,
            improveyourself, analysis,
            mesutFeed;

    TextView buttonmain1_text, buttonmain2_text;

    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        Typeface raleway = Typeface.createFromAsset(this.getAssets(), "Raleway-Regular.ttf");



        buttonmain1 = findViewById(R.id.buttonmain1);
        buttonmain2 = findViewById(R.id.buttonmain2);
        addpair = findViewById(R.id.button);
        mentalhealth = findViewById(R.id.buttonmain1);
        othertests = findViewById(R.id.buttonmain2);
        improveyourself = findViewById(R.id.buttonImroveYourself);
        analysis = findViewById(R.id.button2);
        mesutFeed = findViewById(R.id.button3);
        buttonmain1_text = findViewById(R.id.buttonmain1_text);
        buttonmain2_text = findViewById(R.id.buttonmain2_text);



        buttonmain1.setTypeface(raleway);
        buttonmain2.setTypeface(raleway);
        addpair.setTypeface(raleway);
        mentalhealth.setTypeface(raleway);
        othertests.setTypeface(raleway);
        improveyourself.setTypeface(raleway);
        analysis.setTypeface(raleway);
        mesutFeed.setTypeface(raleway);
        buttonmain1_text.setTypeface(raleway);
        buttonmain2_text.setTypeface(raleway);

        buttonmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, FindOutPromptPage.class);
                startActivity(i);
            }
        });

        buttonmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent i = new Intent(HomePage.this, AngerIssue.class);
                startActivity(i);*/
            }
        });


    }
}

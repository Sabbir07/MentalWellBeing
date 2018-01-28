package com.sabbir.preneurlab.mentalwellbeing;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button generalButton,
                    measurementButton,
                    rememberingChildhoodButton,
                    othersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //setting action bar icon and text properties
        Toolbar toolbar = findViewById(R.id.mCustomToolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("  Mental Well Being");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getSupportActionBar().setIcon(getDrawable(R.drawable.ic_action_name));
        }
        toolbar.setTitleTextColor(getResources().getColor(R.color.iconTintColorFrontPageButton));

        Typeface raleway = Typeface.createFromAsset(this.getAssets(), "Raleway-Regular.ttf");
        TextView toolbarText = toolbar.findViewById(R.id.toolBarTextView);
        toolbarText.setTypeface(raleway);
        toolbarText.setText("  Mental Health");


        generalButton = findViewById(R.id.generalQuestion);
        measurementButton = findViewById(R.id.measurementQuestion);
        rememberingChildhoodButton = findViewById(R.id.rememberingChildhood);
        othersButton = findViewById(R.id.others);

        generalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, GeneralQuestion.class);
                startActivity(i);
            }
        });

        measurementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, MeasurementQuestion.class);
                startActivity(i);
            }
        });

        rememberingChildhoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RememberingChildhood.class);
                startActivity(i);
            }
        });

        othersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, OtherQuestions.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {

            super.onBackPressed();
            moveTaskToBack(true); //left does not properly works without it. !
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
    }
}
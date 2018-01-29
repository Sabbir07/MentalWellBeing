package com.sabbir.preneurlab.mentalwellbeing;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sabbir on 1/17/2018.
 */

public class Depression extends AppCompatActivity{

    Button buttonNext, radioButton, radioButton2, radioButton3;
    RadioGroup radioGroup;
    TextView textView;
    ImageView imageView;
    private int a=2, b=0, sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depression_layout);

        Typeface raleway = Typeface.createFromAsset(this.getAssets(), "Raleway-Regular.ttf");

        //setting action bar icon and text properties
        Toolbar toolbar = findViewById(R.id.mCustomToolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("  Mental App");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getSupportActionBar().setIcon(getDrawable(R.drawable.ic_action_name));
        }
        toolbar.setTitleTextColor(getResources().getColor(R.color.primaryText));
        //toolbar.setTitleTextAppearance(this, setTypeface(raleway));
        //((Toolbar)toolbar.getChildAt(1)).setTypeface(raleway);

        TextView toolbarText = toolbar.findViewById(R.id.toolBarTextView);
        toolbarText.setTypeface(raleway);
        toolbarText.setText("  Mental Health");


        buttonNext = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);


        buttonNext.setTypeface(raleway);
        textView.setTypeface(raleway);
        radioButton.setTypeface(raleway);
        radioButton2.setTypeface(raleway);
        radioButton3.setTypeface(raleway);


        //final Intent intent = new Intent(getBaseContext(), DepressionResult.class);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioGroup.clearCheck();
                if(a==2){
                    sum = sum + b;
                    //radioGroup.clearCheck();
                    imageView.setImageResource(R.drawable.picturetest2);
                    textView.setText("2. What Did You See First?");
                    radioButton.setText("A Car");
                    radioButton2.setText("Man with Binoculars");
                    radioButton3.setText("Letter 'A'");
                    a=3;
                    //Toast.makeText(Depression.this, Integer.toString(sum), Toast.LENGTH_SHORT).show();

                } else if (a==3){
                    sum = sum + b;
                    //radioGroup.clearCheck();
                    imageView.setImageResource(R.drawable.picturetest3);
                    textView.setText("3. What Did You See First?");
                    radioButton.setText("Bowling pins");
                    radioButton2.setText("Footprints");
                    radioButton3.setText("Nesting dolls");
                    a=4;
                    //Toast.makeText(Depression.this, Integer.toString(sum), Toast.LENGTH_SHORT).show();

                } else if (a==4){
                    sum = sum + b;
                    //radioGroup.clearCheck();
                    imageView.setImageResource(R.drawable.picturetest4);
                    textView.setText("4. What Did You See First?");
                    radioButton.setText("Apple");
                    radioButton2.setText("Butterfly");
                    radioButton3.setText("Knife");
                    a=5;
                    //Toast.makeText(Depression.this, Integer.toString(sum), Toast.LENGTH_SHORT).show();

                } else if (a==5){
                    sum = sum + b;
                    //radioGroup.clearCheck();
                    imageView.setImageResource(R.drawable.picturetest5);
                    textView.setText("5. What Did You See First?");
                    radioButton.setText("A Face");
                    radioButton2.setText("A Dog");
                    radioButton3.setText("A Precipice");
                    a=6;
                    //Toast.makeText(Depression.this, Integer.toString(sum), Toast.LENGTH_SHORT).show();

                } else if (a==6){
                    sum = sum + b;
                    //radioGroup.clearCheck();
                    imageView.setImageResource(R.drawable.picturetest6);
                    textView.setText("6. What Did You See First?");
                    radioButton.setText("Crocodile");
                    radioButton2.setText("Mountains & Water");
                    radioButton3.setText("People in a boat");
                    a=7;
                    //Toast.makeText(Depression.this, Integer.toString(sum), Toast.LENGTH_SHORT).show();

                } else if (a==7){
                    sum = sum + b;
                    //radioGroup.clearCheck();
                    imageView.setImageResource(R.drawable.picturetest7);
                    textView.setText("7. What Did You See First?");
                    radioButton.setText("A Whale");
                    radioButton2.setText("Moon & Light on Water");
                    radioButton3.setText("A person surfing");
                    buttonNext.setText("Finish");
                    a=8;
                    //Toast.makeText(Depression.this, Integer.toString(sum), Toast.LENGTH_SHORT).show();

                } else if (a==8){
                    sum = sum + b;
                    a=9;
                    Intent intent = new Intent(getBaseContext(), DepressionResult.class);
                    intent.putExtra("sum_value", Integer.toString(sum));
                    startActivity(intent);
                }
            }
        });
    }

    public void onClick(View v){
        switch (v.getId()) {

            case R.id.radioButton:
                b=1;
                break;
            case R.id.radioButton2:
                b=2;
                break;
            case R.id.radioButton3:
                b=3;
                break;
        }
    }
}
/*
2
What Did You See First?
A Car
Man with Binoculars
Letter 'A'

3
What Did You See First?
Bowling pins
Footprints
Nesting dolls

4
What Did You See First?
Apple
Butterfly
Knife

5
What Did You See First?
A Face
A Dog
A Precipice

6
What Did You See First?
Crocodile
Mountains & Water
People in a boat

7
What Did You See First?
A Whale
Moon & Light on Water
A person surfing



*/


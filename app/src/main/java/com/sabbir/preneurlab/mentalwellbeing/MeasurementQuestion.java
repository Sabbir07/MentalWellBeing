package com.sabbir.preneurlab.mentalwellbeing;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sabbir on 1/10/2018.
 */

public class MeasurementQuestion extends AppCompatActivity{

    private TextView textView;
    private RadioGroup radioGroup;
    private Button buttonNext;
    private Button radioButton,
                    radioButton2,
                    radioButton3,
                    radioButton4,
                    radioButton5,
                    radioButton6;

    private EditText editText1,
                     editText2,
                     editText3,
                     editText4,
                     editText5,
                     editText6;
    int sum, a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.measurement_question);

        //setting action bar icon and text properties
        Toolbar toolbar = findViewById(R.id.mCustomToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  Measurement Question");
        getSupportActionBar().setIcon(getDrawable(R.drawable.ic_action_name));
        toolbar.setTitleTextColor(getResources().getColor(R.color.iconTintColorFrontPageButton));

        // customizing the underline's color

        //editText1 = findViewById(R.id.editText);
        //editText1.setVisibility(View.GONE);
        //editText2 = findViewById(R.id.editText2);
        //editText2.setVisibility(View.GONE);
        editText3 = findViewById(R.id.editText3);
        editText3.setVisibility(View.GONE);
        editText4 = findViewById(R.id.editText4);
        editText4.setVisibility(View.GONE);
        editText5 = findViewById(R.id.editText5);
        editText5.setVisibility(View.GONE);
        editText6 = findViewById(R.id.editText6);
        //editText6.setVisibility(View.GONE);


        //editText1.getBackground().setColorFilter(getResources().getColor(R.color.editTextBaseColor), PorterDuff.Mode.SRC_IN);
        //editText2.getBackground().setColorFilter(getResources().getColor(R.color.editTextBaseColor), PorterDuff.Mode.SRC_IN);
        editText3.getBackground().setColorFilter(getResources().getColor(R.color.editTextBaseColor), PorterDuff.Mode.SRC_IN);
        editText4.getBackground().setColorFilter(getResources().getColor(R.color.editTextBaseColor), PorterDuff.Mode.SRC_IN);
        editText5.getBackground().setColorFilter(getResources().getColor(R.color.editTextBaseColor), PorterDuff.Mode.SRC_IN);
        editText6.getBackground().setColorFilter(getResources().getColor(R.color.editTextBaseColor), PorterDuff.Mode.SRC_IN);





        radioGroup = findViewById(R.id.radioGroup);
        buttonNext = findViewById(R.id.button);


        textView = findViewById(R.id.textView);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        //radioButton5 = findViewById(R.id.radioButton5);
        //radioButton6 = findViewById(R.id.radioButton6);


        textView.setText("1. What brings your happiness?");
        radioButton.setText("Eating Food");
        radioButton2.setText("When you get a nice gift");
        radioButton3.setText("Hearing good news");
        radioButton4.setText("Create a new idea");
        //radioButton5.setText("Gossiping with friends");
        //radioButton6.setText("Others");


        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int selectedId = radioGroup.getCheckedRadioButtonId();
                //radioButton = findViewById(selectedId);

                /*

                Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
                if (radioButton.getText().toString().equals("Human"))
                {
*//*                    Toast.makeText(MainActivity.this, "Right Answer --" + radioButton.getText(),
                                                                Toast.LENGTH_SHORT).show();     *//*
                    Toast.makeText(MainActivity.this, "Right Answer",
                            Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Wrong Answer",
                            Toast.LENGTH_SHORT).show();
                }
                */

               /* switch (view.getId()) {

                    //.....Others answer session.....
                    case R.id.radioButton:
                        a=5;
                        break;

                    case R.id.radioButton2:
                        a=3;
                        break;
                    case R.id.radioButton3:
                        a=1;
                        break;


                    case R.id.radioButton7:
                        b=5;
                        break;
                    case R.id.radioButton8:
                        b=3;
                        break;
                    case R.id.radioButton9:
                        b=1;
                        break;
                }*/


                sum = a + b;
                Toast.makeText(MeasurementQuestion.this, Integer.toString(sum), Toast.LENGTH_SHORT).show();
                if (sum >= 6 && sum <= 10)
                {
                    startActivity(new Intent(MeasurementQuestion.this, DepressionClass.class));
                } else if (sum >= 2 && sum <= 5)
                {
                    startActivity(new Intent(MeasurementQuestion.this, GeneralQuestion.class));
                }
            }
        });



        //setting submit button
        /*Button submitButton = findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Replace with your action...", Toast.LENGTH_SHORT).show();

                switch (view.getId()) {

                    //.....Others answer session.....
                    case R.id.radioButton2:
                        a=5;
                        break;

                    case R.id.radioButton3:
                        a=3;
                        break;
                    case R.id.radioButton4:
                        a=1;
                        break;


                    case R.id.radioButton7:
                        b=5;
                        break;
                    case R.id.radioButton8:
                        b=3;
                        break;
                    case R.id.radioButton9:
                        b=1;
                        break;
                }

                sum = a + b;
                if (sum >= 6 && sum <= 10)
                {
                    startActivity(new Intent(MeasurementQuestion.this, OtherQuestions.class));
                } else if (sum >= 2 && sum <= 5)
                {
                    startActivity(new Intent(MeasurementQuestion.this, GeneralQuestion.class));
                }
            }
        });
*/
    }

    //.....Selecting different layout for each button click by switch.....
    public void onClick(View v){
        switch (v.getId()) {

            //.....Others answer session.....
            /*case R.id.radioButton6:
                    *//*if (viewGroupIsNotVisible1) {
                        editText2.setVisibility(View.VISIBLE);
                    } else {
                        editText2.setVisibility(View.GONE);
                    }
                    viewGroupIsNotVisible1 = !viewGroupIsNotVisible1;*//*
                editText2.setVisibility(View.VISIBLE);
                //v.startAnimation(buttonClick);
                break;*/

            /*case R.id.radioButton9:
                editText3.setVisibility(View.VISIBLE);
                break;*/
            case R.id.radioButton14:
                editText4.setVisibility(View.VISIBLE);
                break;
            case R.id.radioButton20:
                editText5.setVisibility(View.VISIBLE);
                break;



            //.....Others answer session.....
            case R.id.radioButton:
                a=5;
                break;

            case R.id.radioButton2:
                a=3;
                break;
            case R.id.radioButton3:
                a=1;
                break;


            case R.id.radioButton7:
                b=5;
                break;
            case R.id.radioButton8:
                b=3;
                break;
            case R.id.radioButton9:
                b=1;
                break;
        }
    }
}
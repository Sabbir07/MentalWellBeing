package com.sabbir.preneurlab.mentalwellbeing;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Sabbir on 1/14/2018.
 */

public class OtherQuestions extends AppCompatActivity {

    private boolean viewGroupIsNotVisible1 = true;
    private EditText editText2,
            editText3,
            editText4,
            editText5,
            editText6,
            editText7;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_questions);

        //setting action bar icon and text properties
        Toolbar toolbar = findViewById(R.id.mCustomToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  Other Questions");
        getSupportActionBar().setIcon(getDrawable(R.drawable.ic_action_name));
        toolbar.setTitleTextColor(getResources().getColor(R.color.iconTintColorFrontPageButton));


        // customizing the underline's color

        editText2 = findViewById(R.id.editText2);
        editText2.setVisibility(View.GONE);
        editText3 = findViewById(R.id.editText3);
        editText3.setVisibility(View.GONE);
        editText4 = findViewById(R.id.editText4);
        editText4.setVisibility(View.GONE);
        editText5 = findViewById(R.id.editText5);
        editText5.setVisibility(View.GONE);
        editText6 = findViewById(R.id.editText6);
        editText6.setVisibility(View.GONE);
        editText7 = findViewById(R.id.editText7);
        editText7.setVisibility(View.GONE);


        editText2.getBackground().setColorFilter(getResources().getColor(R.color.blueColorForButton), PorterDuff.Mode.SRC_IN);
        editText3.getBackground().setColorFilter(getResources().getColor(R.color.blueColorForButton), PorterDuff.Mode.SRC_IN);
        editText4.getBackground().setColorFilter(getResources().getColor(R.color.blueColorForButton), PorterDuff.Mode.SRC_IN);
        editText5.getBackground().setColorFilter(getResources().getColor(R.color.blueColorForButton), PorterDuff.Mode.SRC_IN);
        editText6.getBackground().setColorFilter(getResources().getColor(R.color.blueColorForButton), PorterDuff.Mode.SRC_IN);
        editText7.getBackground().setColorFilter(getResources().getColor(R.color.blueColorForButton), PorterDuff.Mode.SRC_IN);


        //setting submit button
        Button submitButton = findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Replace with your action...", Toast.LENGTH_SHORT).show();
            }
        });


    }


    //.....Selecting different layout for each button click by switch.....
    public void onClick(View v) {
        switch (v.getId()) {

            //.....Others answer session.....
            case R.id.radioButton5:
                    /*if (viewGroupIsNotVisible1) {
                        editText2.setVisibility(View.VISIBLE);
                    } else {
                        editText2.setVisibility(View.GONE);
                    }
                    viewGroupIsNotVisible1 = !viewGroupIsNotVisible1;*/
                editText2.setVisibility(View.VISIBLE);
                //v.startAnimation(buttonClick);
                break;

            case R.id.radioButton9_1:
                editText3.setVisibility(View.VISIBLE);
                break;
            case R.id.radioButton14_2:
                editText4.setVisibility(View.VISIBLE);
                break;
            case R.id.radioButton19:
                editText5.setVisibility(View.VISIBLE);
                break;
            case R.id.radioButton23:
                editText6.setVisibility(View.VISIBLE);
                break;
            case R.id.radioButton29:
                editText7.setVisibility(View.VISIBLE);
                break;
        }
    }
/*
    @Override
    public void onBackPressed() {

        super.onBackPressed();
        moveTaskToBack(true); //left does not properly works without it. !
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }*/
}

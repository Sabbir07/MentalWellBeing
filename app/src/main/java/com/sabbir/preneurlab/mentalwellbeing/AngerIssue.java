package com.sabbir.preneurlab.mentalwellbeing;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sabbir on 1/27/2018.
 */

public class AngerIssue extends AppCompatActivity{

    private int bb=0, b=0, b3=0, b5=0, b7=0, b9=0, b11=0, b13=0,b15=0,b17=0,b19=0,
        b21=0,b23=0,b25=0,b27=0,b29=0,b31=0,b33=0,b35=0,b37=0,b39=0,
        sum=0;

    int maxRange=20;

    TextView textView, textView2,textView3,textView4,textView5,
            textView6,textView7,textView8,textView9,textView10,
            textView11,textView12,textView13,textView14,textView15,
            textView16,textView17,textView18,textView19,textView20;

    RadioButton radioButton, radioButton2,radioButton3,radioButton4,radioButton5,
                radioButton6,radioButton7,radioButton8,radioButton9,radioButton10,
                radioButton11,radioButton12,radioButton13,radioButton14,radioButton15,
                radioButton16,radioButton17,radioButton18,radioButton19,radioButton20,
                radioButton21,radioButton22,radioButton23,radioButton24,radioButton25,
                radioButton26,radioButton27,radioButton28,radioButton29,radioButton30,
                radioButton31,radioButton32,radioButton33,radioButton34,radioButton35,
                radioButton36,radioButton37,radioButton38,radioButton39,radioButton40;

    Button submit_button;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anger_issue);

        Typeface raleway = Typeface.createFromAsset(this.getAssets(), "Raleway-Regular.ttf");

        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        radioButton5 = findViewById(R.id.radioButton5);
        radioButton6 = findViewById(R.id.radioButton6);
        radioButton7 = findViewById(R.id.radioButton7);
        radioButton8 = findViewById(R.id.radioButton8);
        radioButton9 = findViewById(R.id.radioButton9);
        radioButton10 = findViewById(R.id.radioButton10);
        radioButton11 = findViewById(R.id.radioButton11);
        radioButton12 = findViewById(R.id.radioButton12);
        radioButton13 = findViewById(R.id.radioButton13);
        radioButton14 = findViewById(R.id.radioButton14);
        radioButton15 = findViewById(R.id.radioButton15);
        radioButton16 = findViewById(R.id.radioButton16);
        radioButton17 = findViewById(R.id.radioButton17);
        radioButton18 = findViewById(R.id.radioButton18);
        radioButton19 = findViewById(R.id.radioButton19);
        radioButton20 = findViewById(R.id.radioButton20);
        radioButton21 = findViewById(R.id.radioButton21);
        radioButton22 = findViewById(R.id.radioButton22);
        radioButton23 = findViewById(R.id.radioButton23);
        radioButton24 = findViewById(R.id.radioButton24);
        radioButton25 = findViewById(R.id.radioButton25);
        radioButton26 = findViewById(R.id.radioButton26);
        radioButton27 = findViewById(R.id.radioButton27);
        radioButton28 = findViewById(R.id.radioButton28);
        radioButton29 = findViewById(R.id.radioButton29);
        radioButton30 = findViewById(R.id.radioButton30);
        radioButton31 = findViewById(R.id.radioButton31);
        radioButton32 = findViewById(R.id.radioButton32);
        radioButton33 = findViewById(R.id.radioButton33);
        radioButton34 = findViewById(R.id.radioButton34);
        radioButton35 = findViewById(R.id.radioButton35);
        radioButton36 = findViewById(R.id.radioButton36);
        radioButton37 = findViewById(R.id.radioButton37);
        radioButton38 = findViewById(R.id.radioButton38);
        radioButton39 = findViewById(R.id.radioButton39);
        radioButton40 = findViewById(R.id.radioButton40);



        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11=findViewById(R.id.textView11);
        textView12=findViewById(R.id.textView12);
        textView13=findViewById(R.id.textView13);
        textView14=findViewById(R.id.textView14);
        textView15=findViewById(R.id.textView15);
        textView16=findViewById(R.id.textView16);
        textView17=findViewById(R.id.textView17);
        textView18=findViewById(R.id.textView18);
        textView19=findViewById(R.id.textView19);
        textView20=findViewById(R.id.textView20);


        radioButton.setTypeface(raleway);
        radioButton2.setTypeface(raleway);
        radioButton3.setTypeface(raleway);
        radioButton4.setTypeface(raleway);
        radioButton5.setTypeface(raleway);
        radioButton6.setTypeface(raleway);
        radioButton7.setTypeface(raleway);
        radioButton8.setTypeface(raleway);
        radioButton9.setTypeface(raleway);
        radioButton10.setTypeface(raleway);
        radioButton11.setTypeface(raleway);
        radioButton12.setTypeface(raleway);
        radioButton13.setTypeface(raleway);
        radioButton14.setTypeface(raleway);
        radioButton15.setTypeface(raleway);
        radioButton16.setTypeface(raleway);
        radioButton17.setTypeface(raleway);
        radioButton18.setTypeface(raleway);
        radioButton19.setTypeface(raleway);
        radioButton20.setTypeface(raleway);
        radioButton21.setTypeface(raleway);
        radioButton22.setTypeface(raleway);
        radioButton23.setTypeface(raleway);
        radioButton24.setTypeface(raleway);
        radioButton25.setTypeface(raleway);
        radioButton26.setTypeface(raleway);
        radioButton27.setTypeface(raleway);
        radioButton28.setTypeface(raleway);
        radioButton29.setTypeface(raleway);
        radioButton30.setTypeface(raleway);
        radioButton31.setTypeface(raleway);
        radioButton32.setTypeface(raleway);
        radioButton33.setTypeface(raleway);
        radioButton34.setTypeface(raleway);
        radioButton35.setTypeface(raleway);
        radioButton36.setTypeface(raleway);
        radioButton37.setTypeface(raleway);
        radioButton38.setTypeface(raleway);
        radioButton39.setTypeface(raleway);
        radioButton40.setTypeface(raleway);


        textView.setTypeface(raleway);
        textView2.setTypeface(raleway);
        textView3.setTypeface(raleway);
        textView4.setTypeface(raleway);
        textView5.setTypeface(raleway);
        textView6.setTypeface(raleway);
        textView7.setTypeface(raleway);
        textView8.setTypeface(raleway);
        textView9.setTypeface(raleway);
        textView10.setTypeface(raleway);
        textView11.setTypeface(raleway);
        textView12.setTypeface(raleway);
        textView13.setTypeface(raleway);
        textView14.setTypeface(raleway);
        textView15.setTypeface(raleway);
        textView16.setTypeface(raleway);
        textView17.setTypeface(raleway);
        textView18.setTypeface(raleway);
        textView19.setTypeface(raleway);
        textView20.setTypeface(raleway);




        submit_button = findViewById(R.id.button);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((radioButton.isChecked()==true||radioButton2.isChecked()==true) &&
                        (radioButton3.isChecked()==true||radioButton4.isChecked()==true)&&
                        (radioButton5.isChecked()==true||radioButton6.isChecked()==true)&&
                        (radioButton7.isChecked()==true||radioButton8.isChecked()==true)&&
                        (radioButton9.isChecked()==true||radioButton10.isChecked()==true)&&
                        (radioButton11.isChecked()==true||radioButton12.isChecked()==true)&&
                        (radioButton13.isChecked()==true||radioButton14.isChecked()==true)&&
                        (radioButton15.isChecked()==true||radioButton16.isChecked()==true)&&
                        (radioButton17.isChecked()==true||radioButton18.isChecked()==true)&&
                        (radioButton19.isChecked()==true||radioButton20.isChecked()==true)&&
                        (radioButton21.isChecked()==true||radioButton22.isChecked()==true)&&
                        (radioButton23.isChecked()==true||radioButton24.isChecked()==true)&&
                        (radioButton25.isChecked()==true||radioButton26.isChecked()==true)&&
                        (radioButton27.isChecked()==true||radioButton28.isChecked()==true)&&
                        (radioButton29.isChecked()==true||radioButton30.isChecked()==true)&&
                        (radioButton31.isChecked()==true||radioButton32.isChecked()==true)&&
                        (radioButton33.isChecked()==true||radioButton34.isChecked()==true)&&
                        (radioButton35.isChecked()==true||radioButton36.isChecked()==true)&&
                        (radioButton37.isChecked()==true||radioButton38.isChecked()==true)&&
                        (radioButton39.isChecked()==true||radioButton40.isChecked()==true)){

                    sum=(b+b3+b5+b7+b9+b11+b13+b15+b17+b19+b21+b23+b25+b27+b29+b31+b33+b35+b37+b39);

                    Intent intent = new Intent(getBaseContext(), DepressionResult.class);
                    intent.putExtra("sum_value", Integer.toString(sum));
                    sum=0;
                    intent.putExtra("maxrange", Integer.toString(maxRange));
                    startActivity(intent);

                } else{
                    alertDialog();
                    //return false;
                }
            }
        });
    }


    private void alertDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                AngerIssue.this);
        alertDialogBuilder.setMessage("Please ensure all Questions are answered")
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }


    public void onClick(View v){
        switch (v.getId()) {

            case R.id.radioButton:
                b=1;
                //Toast.makeText(this, b+"hello",Toast.LENGTH_LONG).show();
                break;
            case R.id.radioButton2:
                b=0;
                //Toast.makeText(this, bb+"hello",Toast.LENGTH_LONG).show();
                break;

            case R.id.radioButton3:
                b3=1;
                //Toast.makeText(this, b3+"hello",Toast.LENGTH_LONG).show();
                break;
            case R.id.radioButton4:
                b3=0;
                break;

            case R.id.radioButton5:
                b5=1;
                break;
            case R.id.radioButton6:
                b5=0;
                break;

            case R.id.radioButton7:
                b7=1;
                break;
            case R.id.radioButton8:
                b7=0;
                break;

            case R.id.radioButton9:
                b9=1;
                break;
            case R.id.radioButton10:
                b9=0;
                break;

            case R.id.radioButton11:
                b11=1;
                break;
            case R.id.radioButton12:
                b11=0;
                break;

            case R.id.radioButton13:
                b13=1;
                break;
            case R.id.radioButton14:
                b13=0;
                break;

            case R.id.radioButton15:
                b15=1;
                break;
            case R.id.radioButton16:
                b15=0;
                break;

            case R.id.radioButton17:
                b17=1;
                break;
            case R.id.radioButton18:
                b17=0;
                break;

            case R.id.radioButton19:
                b19=1;
                break;
            case R.id.radioButton20:
                b19=0;
                break;

            case R.id.radioButton21:
                b21=1;
                break;
            case R.id.radioButton22:
                b21=0;
                break;

            case R.id.radioButton23:
                b23=1;
                break;
            case R.id.radioButton24:
                b23=0;
                break;

            case R.id.radioButton25:
                b25=1;
                break;
            case R.id.radioButton26:
                b25=0;
                break;

            case R.id.radioButton27:
                b27=1;
                break;
            case R.id.radioButton28:
                b27=0;
                break;

            case R.id.radioButton29:
                b29=1;
                break;
            case R.id.radioButton30:
                b29=0;
                break;

            case R.id.radioButton31:
                b31=1;
                break;
            case R.id.radioButton32:
                b31=0;
                break;

            case R.id.radioButton33:
                b33=1;
                break;
            case R.id.radioButton34:
                b33=0;
                break;

            case R.id.radioButton35:
                b35=1;
                break;
            case R.id.radioButton36:
                b35=0;
                break;

            case R.id.radioButton37:
                b37=1;
                break;
            case R.id.radioButton38:
                b37=0;
                break;

            case R.id.radioButton39:
                b39=1;
                break;
            case R.id.radioButton40:
                b39=0;
                break;
        }
    }
}

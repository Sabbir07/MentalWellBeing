package com.sabbir.preneurlab.mentalwellbeing;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by Sabbir on 1/18/2018.
 */

public class DepressionResult extends AppCompatActivity{

    TextView textView;
    double progressStatus = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depression_result_2);

        Typeface raleway = Typeface.createFromAsset(this.getAssets(), "Raleway-Regular.ttf");

        //setting action bar icon and text properties
        Toolbar toolbar = findViewById(R.id.mCustomToolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("  Mental App");
        getSupportActionBar().setIcon(getDrawable(R.drawable.ic_action_name));
        toolbar.setTitleTextColor(getResources().getColor(R.color.primaryText));

        TextView toolbarText = toolbar.findViewById(R.id.toolBarTextView);
        TextView textView2 = findViewById(R.id.textView_2);
        TextView textView4 = findViewById(R.id.textView_4);
        TextView textView_score = findViewById(R.id.textView_score);
        TextView textviewlike = findViewById(R.id.textView_5);
        TextView textviewdescription = findViewById(R.id.textView_6);
        Button buttonimprove = findViewById(R.id.buttonImroveYourself);
        Button buttonhome = findViewById(R.id.buttonHome);

        textviewlike.setTypeface(raleway);
        textviewdescription.setTypeface(raleway);
        buttonimprove.setTypeface(raleway);
        buttonhome.setTypeface(raleway);


        final ProgressBar progressBar = findViewById(R.id.progressBar);

        toolbarText.setTypeface(raleway);
        toolbarText.setText("  Mental Health");


        String s = getIntent().getStringExtra("sum_value");
        final int ii = Integer.parseInt(getIntent().getStringExtra("sum_value"));

        textView = findViewById(R.id.textView);
        textView.setText("Your Mental Wellbeing Score");
        textView.setTypeface(raleway);

        textView_score.setTypeface(raleway, Typeface.BOLD);
        textView_score.setText(s);
        //textView_score.setTypeface(raleway);



        textView2.setText("0");
        int ss = progressBar.getMax();
        textView4.setText(Integer.toString(ss));



        // Start long running operation in a background thread
        new Thread(new Runnable() {
            public void run() {
                //while (progressStatus < 100) {
                //while (progressStatus < progressBar.getMax()) {
                while (progressStatus < ii) {
                    progressStatus += 1;
                    // Update the progress bar and display the
                    //current value in the text view
                    handler.post(new Runnable() {
                        public void run() {
                            progressBar.setProgress((int) progressStatus);
                            //textView.setText(progressStatus+"/"+progressBar.getMax());
                            //textView.setText(progressStatus+"/"+progressBar.getMax());
                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();



    }
}

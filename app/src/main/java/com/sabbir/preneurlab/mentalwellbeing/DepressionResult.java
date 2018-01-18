package com.sabbir.preneurlab.mentalwellbeing;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by Sabbir on 1/18/2018.
 */

public class DepressionResult extends AppCompatActivity{

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depression_result);

        Typeface raleway = Typeface.createFromAsset(this.getAssets(), "Raleway-Regular.ttf");

        //setting action bar icon and text properties
        Toolbar toolbar = findViewById(R.id.mCustomToolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("  Mental App");
        getSupportActionBar().setIcon(getDrawable(R.drawable.ic_action_name));
        toolbar.setTitleTextColor(getResources().getColor(R.color.primaryText));

        TextView toolbarText = toolbar.findViewById(R.id.toolBarTextView);
        toolbarText.setTypeface(raleway);
        toolbarText.setText("  Mental Health");


        String s = getIntent().getStringExtra("sum_value");

        textView = findViewById(R.id.textView);
        textView.setText("Your Score is\n\n" + s);
        textView.setTypeface(raleway);
    }
}

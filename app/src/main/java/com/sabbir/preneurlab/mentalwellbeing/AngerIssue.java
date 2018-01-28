package com.sabbir.preneurlab.mentalwellbeing;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Sabbir on 1/27/2018.
 */

public class AngerIssue extends AppCompatActivity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anger_issue);

        Typeface raleway = Typeface.createFromAsset(this.getAssets(), "Raleway-Regular.ttf");

    }
}

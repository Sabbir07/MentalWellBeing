package com.sabbir.preneurlab.mentalwellbeing;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Sabbir on 1/22/2018.
 */

public class SelfAssessment extends AppCompatActivity {

    Button submitbutton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.self_assessment);

        Typeface raleway = Typeface.createFromAsset(this.getAssets(), "Raleway-Regular.ttf");


        submitbutton = findViewById(R.id.submitbutton);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SelfAssessment.this, DepressionResult.class);
                startActivity(i);
            }
        });
    }
}

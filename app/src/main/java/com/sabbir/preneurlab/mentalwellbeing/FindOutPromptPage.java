package com.sabbir.preneurlab.mentalwellbeing;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Sabbir on 1/29/2018.
 */

public class FindOutPromptPage extends AppCompatActivity{

    private Button button;
    TextView textView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_out_prompt_page);

        Typeface raleway = Typeface.createFromAsset(this.getAssets(), "Raleway-Regular.ttf");
        Typeface ralewaybold = Typeface.createFromAsset(this.getAssets(), "Raleway-Bold.ttf");

        button=findViewById(R.id.button);
        button.setTypeface(raleway);
        textView = findViewById(R.id.textView);
        textView.setTypeface(raleway);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FindOutPromptPage.this, Choosing.class);
                startActivity(i);
            }
        });
    }
}

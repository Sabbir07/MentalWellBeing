package com.sabbir.preneurlab.mentalwellbeing;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Sabbir on 1/22/2018.
 */

public class AppInfoActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_info_screen);

        Typeface raleway = Typeface.createFromAsset(this.getAssets(), "Raleway-Regular.ttf");


        Button buttonskip = findViewById(R.id.skipbutton);
        TextView textAppName = findViewById(R.id.textAppName);
        TextView infoText = findViewById(R.id.infoText);

        buttonskip.setTypeface(raleway);
        textAppName.setTypeface(raleway);
        infoText.setTypeface(raleway);

        buttonskip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AppInfoActivity.this, HomePage.class);
                startActivity(i);
            }
        });
    }
}

package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        final int[] ballArray = {R.drawable.ball1
        ,R.drawable.ball2
        ,R.drawable.ball3
        ,R.drawable.ball4
        ,R.drawable.ball5};
        Button myButton = (Button) findViewById(R.id.askButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                //Log.d("magic 8","before Image display");
                int randomNumber = randomNumberGenerator.nextInt(5);
                //
                // Log.d("magic 8","before Image display, random number is: "+randomNumber);
                ballDisplay.setImageResource(ballArray[randomNumber]);
            }
        });
    }


}

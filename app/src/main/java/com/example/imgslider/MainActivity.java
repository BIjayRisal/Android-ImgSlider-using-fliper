package com.example.imgslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int imgarray[] = {
                R.drawable.b,
                R.drawable.a,
                R.drawable.c
        };
        flipper = (ViewFlipper) findViewById(R.id.flipper);

        for (int i = 0; i<imgarray.length; i++){
            showimage(imgarray[i]);
        }
    }
    public  void showimage(int img){
        ImageView imageView =  new ImageView((this));
        imageView.setBackgroundResource(img);
        flipper.addView(imageView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}
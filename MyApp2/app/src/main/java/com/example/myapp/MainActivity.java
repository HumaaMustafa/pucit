package com.example.myapp;
import android.media.MediaPlayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;

import android.view.View;


public class MainActivity extends AppCompatActivity {







    TextView txt;
    Button b1 , b2 , b3 , b4 , b5 , b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt =(TextView) findViewById(R.id.ww);
        Button click1 =(Button) findViewById(R.id.orange);
        Button click2 = (Button) findViewById(R.id.red);
        Button click3 = (Button) findViewById(R.id.sky);
        Button click4 = (Button) findViewById(R.id.yellow);
        Button click5 = (Button) findViewById(R.id.green);
        Button click6 = (Button) findViewById(R.id.pink);

        final MediaPlayer mp1=MediaPlayer.create(getApplicationContext(), R.raw.orange);
        final MediaPlayer mp2=MediaPlayer.create(getApplicationContext(), R.raw.red);
        final MediaPlayer mp3=MediaPlayer.create(getApplicationContext(), R.raw.sky);
        final MediaPlayer mp4=MediaPlayer.create(getApplicationContext(), R.raw.yellow);
        final MediaPlayer mp5=MediaPlayer.create(getApplicationContext(), R.raw.green);
        final MediaPlayer mp6=MediaPlayer.create(getApplicationContext(), R.raw.pink);

        View.OnClickListener elem = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.orange:
                        mp1.start();
                        break;
                    case R.id.red:
                        mp2.start();
                        break;
                    case R.id.sky:
                        mp3.start();
                        break;
                    case R.id.yellow:
                        mp4.start();
                        break;
                    case R.id.green:
                        mp5.start();
                        break;
                    case R.id.pink:
                        mp6.start();
                        break;
                }
            }
        };
        click1.setOnClickListener(elem);
        click2.setOnClickListener(elem);
        click3.setOnClickListener(elem);
        click4.setOnClickListener(elem);
        click5.setOnClickListener(elem);
        click6.setOnClickListener(elem);
    }

}
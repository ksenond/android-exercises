package com.example.letmegetajob;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondactivity = (Button) findViewById(R.id.secret);
        secondactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(MainActivity.this,  Secondactivity.class );

                startActivity(startIntent);
            }
        });
        Button google = (Button) findViewById(R.id.goog);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://eva.ru";
                Uri webaddress = Uri.parse(url);

                Intent gotogoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                startActivity(gotogoogle);


            }
        });
        Button tamus = (Button) findViewById(R.id.cat);
        ImageView imageView = findViewById(R.id.imageView);
        tamus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            imageView.setVisibility(View.VISIBLE);

            }
        });


    }   }
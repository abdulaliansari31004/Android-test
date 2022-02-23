package com.example.mainactivity;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    Button sendimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // initialise the layout
        sendimage = findViewById(R.id.page1);
        sendimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // add the image in putExtra
                // and send the data in next activity
                Intent sendimage = new Intent(MainActivity4.this, Secondpage.class);
                sendimage.putExtra("image", R.drawable.img);
                startActivity(sendimage);
            }
        });
    }
}
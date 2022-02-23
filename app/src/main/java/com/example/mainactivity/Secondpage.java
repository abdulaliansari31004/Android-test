package com.example.mainactivity;



import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

    public class Secondpage  extends AppCompatActivity {

        ImageView imageView;
        int imagevalue;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_secondpage);

            // initialise the layout
            imageView = findViewById(R.id.images);

            // check if any value sent from previous activity
            Bundle bundle = getIntent().getExtras();

            // if bundle is not null then get the image value
            if (bundle != null) {
                imagevalue = bundle.getInt("image");
            }
            imageView.setImageResource(imagevalue);
        }
    }
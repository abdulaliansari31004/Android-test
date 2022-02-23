package com.example.intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;
    int imagevalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        // initialise the layout
//        imageView = findViewById(R.id.images);
//
//        // check if any value sent from previous activity
//        Bundle bundle = getIntent().getExtras();
//
//        // if bundle is not null then get the image value
//        if (bundle != null) {
//            imagevalue = bundle.getInt("images");
//        }
//        imageView.setImageResource(imagevalue);
    }
}

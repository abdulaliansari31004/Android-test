package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    TextView receiver_msg, receiver_msg2, receiver_msg3, receiver_msg4, receiver_msg5, receiver_msg6, receiver_msg7;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        receiver_msg = (TextView)findViewById(R.id.received_value_id);
        receiver_msg2 = (TextView)findViewById(R.id.received_value_id2);
        receiver_msg3 = (TextView)findViewById(R.id.received_value_id3);
        receiver_msg4 = (TextView)findViewById(R.id.received_value_id4);
        receiver_msg5 = (TextView)findViewById(R.id.received_value_id5);
        receiver_msg6 = (TextView)findViewById(R.id.received_value_id6);
        receiver_msg7 = (TextView)findViewById(R.id.received_value_id7);




        // create the get Intent object
        Intent intent = getIntent();



        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str = ((Intent) intent).getStringExtra("message key");
        String str1 = ((Intent) intent).getStringExtra("new message");
        String str2 = ((Intent) intent).getStringExtra("new message1");
        String str3 = ((Intent) intent).getStringExtra("new message2");
        String str4 = ((Intent) intent).getStringExtra("new message3");
        String str5 = ((Intent) intent).getStringExtra("new message4");
        String str6 = ((Intent) intent).getStringExtra("new message5");



        // display the string into textView
        receiver_msg.setText(str);
        receiver_msg2.setText(str1);
        receiver_msg3.setText(str2);
        receiver_msg4.setText(str3);
        receiver_msg5.setText(str4);
        receiver_msg6.setText(str5);
        receiver_msg7.setText(str6);

    }

}
package com.example.mainactivity;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    Button send_button;
    EditText send_text,send_father,send_mother,send_age,send_dob,send_email,send_contact;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        send_button = (Button)findViewById(R.id.send_button_id);
        send_text = (EditText)findViewById(R.id.send_nam_id);
        send_father=(EditText)findViewById(R.id.send_father_id);
        send_mother=(EditText)findViewById(R.id.send_mother_id);
        send_age=(EditText)findViewById(R.id.send_age_id);
        send_dob=(EditText)findViewById(R.id.send_dob_id);
        send_email=(EditText)findViewById(R.id.send_email_id);
        send_contact=(EditText)findViewById(R.id.send_contact_id);






        // add the OnClickListener in sender button
        // after clicked this button following Instruction will run
        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                // get the value which input by user in EditText
                // and convert it to string
                String str = send_text.getText().toString();
                String str1 = send_father.getText().toString();
                String str2 = send_mother.getText().toString();
                String str3 = send_age.getText().toString();
                String str4 = send_dob.getText().toString();
                String str5 = send_email.getText().toString();
                String str6 = send_contact.getText().toString();


                // Create the Intent object of this class Context() to Second_activity class
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);



                // now by putExtra method put the value in key, value pair
                // key is message_key by this key we will receive the value, and put the string

                //intent.putExtra("message_key", str);
                //Intent intent1 = intent.putExtra(str);
                intent.putExtra("message key",str);
                intent.putExtra("new message",str1);
                intent.putExtra("new message1",str2);
                intent.putExtra("new message2",str3);
                intent.putExtra("new message3",str4);
                intent.putExtra("new message4",str5);
                intent.putExtra("new message5",str6);



                // start the Intent
                startActivity(intent);


            }

        });
    }
}
package com.example.codetribe.happybirthdaycard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class messagesBirthday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages_birthday);
    }

    public void goBack(View v)
    {
        Intent i = new Intent(messagesBirthday.this, MainActivity.class);

        startActivity(i);



    }
}


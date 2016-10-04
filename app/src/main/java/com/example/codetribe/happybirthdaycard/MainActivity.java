package com.example.codetribe.happybirthdaycard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goNext(View v)
    {
        Intent i = new Intent(MainActivity.this,messagesBirthday.class);

        startActivity(i);



    }
}

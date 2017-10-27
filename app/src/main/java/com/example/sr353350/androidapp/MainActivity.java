package com.example.sr353350.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

/* As per the document ,I think this POC is all about learning how to build default android application
   and to print hello world on the screen.Hence I have not implemented anything in Mainactivity.java,
   a text field representing HELLO WORLD is added in activity_main layout */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

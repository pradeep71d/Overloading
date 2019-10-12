package com.example.overloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Adder ref=new Adder();
        System.out.println("Values are="+ref.sum(4,5)+"\t"+ref.sum(6,9,2)+"\t"+ref.sum(1.5,2.5));
    }
}

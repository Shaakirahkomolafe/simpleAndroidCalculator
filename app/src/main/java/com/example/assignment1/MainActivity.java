package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView displayText;
    Button button0,button1, button2, button3, button4, button5, button6, button7, button8,button9;
    Button buttonAdd, buttonMinus, buttonMultiply, buttonDivide, buttonEnter, buttonCancel, buttonHistory;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      displayText = (TextView) findViewById(R.id.result);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6= findViewById(R.id.button6);
        button7= findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonAdd = findViewById(R.id.plus);
        buttonMinus = findViewById(R.id.minus);
        buttonMultiply = findViewById(R.id.multiply);
        buttonDivide = findViewById(R.id.divide);
        buttonEnter = findViewById(R.id.enter);
        buttonCancel = findViewById(R.id.cancel);
        buttonHistory = findViewById(R.id.advance);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener (this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonEnter.setOnClickListener(this);
        buttonCancel.setOnClickListener(this);
        buttonHistory.setOnClickListener(this);



    }
    public void onClick(View view) {
        String value;
        switch (view.getId()){

        }


        }

}
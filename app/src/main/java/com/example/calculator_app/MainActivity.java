package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String oldNumber= " ";
    String op = "+";
    boolean isNewOp = true;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1= findViewById(R.id.ed1);
    }

    public void numberEvent(View view) {
        if (isNewOp)
            ed1.setText(" ");
        isNewOp = false;
        String number = ed1.getText().toString();
        switch (view.getId()){
            case R.id.bu1:
                number += "1";
                break;
            case R.id.bu2:
                number += "2";
                break;
            case R.id.bu3:
                number += "3";
                break;
            case R.id.bu4:
                number += "4";
                break;
            case R.id.bu5:
                number += "5";
                break;
            case R.id.bu6:
                number += "6";
                break;
            case R.id.bu7:
                number += "7";
                break;
            case R.id.bu8:
                number += "8";
                break;
            case R.id.bu9:
                number += "9";
                break;
            case R.id.bu0:
                number += "0";
                break;
            case R.id.budot:
                number += ".";
                break;
            case R.id.plusminus:
                number = "-"+number;
                break;

        }
        ed1.setText(number);
    }

    public void operatorEvent(View view) {
        isNewOp = true;
        oldNumber = ed1.getText().toString();
        switch (view.getId()){
            case R.id.divide: op = "/"; break;
            case R.id.multiply: op = "*"; break;
            case R.id.buplus: op = "+"; break;
            case R.id.buminus: op = "-"; break;
        }
    }

    public void equalEvent(View view) {
        String newnumber = ed1.getText().toString();
        double result = 0.0;
        switch (op){
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newnumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newnumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newnumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newnumber);
                break;
        }
        ed1.setText(result+ " ");}

    public void acEvent(View view) {
        ed1.setText("0");
        isNewOp = true;

    }

    public void percentEvent(View view) {
        double no = Double.parseDouble(ed1.getText().toString())/100;
        ed1.setText(no+" ");
        isNewOp = true;
    }
}



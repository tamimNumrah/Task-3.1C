package com.tamim.task31c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    TextView result;
    Button addButton;
    Button subtractButton;
    EditText firstNumber;
    EditText secondNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        result = findViewById(R.id.resultTextView);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
    }

    public void onAddButtonPressed(View view) {
        System.out.println("onAddButtonPressed");
        String firstNumberString = firstNumber.getText().toString();
        if (firstNumberString.matches("")) {
            showToast("You did not enter the first number");
            return;
        }
        String secondNumberString = secondNumber.getText().toString();
        if (secondNumberString.matches("")) {
            showToast("You did not enter the second number");
            return;
        }
        result.setText("Result = "+(Double.valueOf(firstNumberString)+Double.valueOf(secondNumberString)));
    }

    public void onSubtractButtonPressed(View view) {
        System.out.println("onSubtractButtonPressed");
        String firstNumberString = firstNumber.getText().toString();
        if (firstNumberString.matches("")) {
            showToast("You did not enter the first number");
            return;
        }
        String secondNumberString = secondNumber.getText().toString();
        if (secondNumberString.matches("")) {
            showToast("You did not enter the second number");
            return;
        }
        result.setText("Result = "+(Double.valueOf(firstNumberString)-Double.valueOf(secondNumberString)));
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
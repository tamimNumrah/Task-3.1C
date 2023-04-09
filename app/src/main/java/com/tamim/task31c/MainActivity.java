package com.tamim.task31c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.google.android.material.textfield.TextInputLayout;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button startButton;
    TextInputLayout nameTextInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startButton);
        nameTextInput = findViewById(R.id.nameInputLayout);
    }

    public void onStartButtonPressed(View view) {
        System.out.println("Start Button Pressed!");
        String name = nameTextInput.getEditText().getText().toString();
        if (name.matches("")) {
            showToast(getString(R.string.name_empty_error));
            return;
        }
        Intent quizIntent = new Intent(MainActivity.this, QuizActivity.class);
        quizIntent.putExtra("username", name);
        MainActivity.this.startActivity(quizIntent);
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
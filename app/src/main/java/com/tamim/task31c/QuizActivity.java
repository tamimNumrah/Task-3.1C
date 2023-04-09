package com.tamim.task31c;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    TextView welcomeTitle;
    TextView currentQuestionNumber;
    ProgressBar quizProgressBar;
    TextView quizQuestion;
    TextView quizQuestionDetails;

    Button option1Button;
    Button option2Button;
    Button option3Button;
    Button option4Button;
    Button submitButton;

    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Intent intent = getIntent();
        username = intent.getStringExtra("username");

        welcomeTitle = findViewById(R.id.welcomeTitle);
        currentQuestionNumber = findViewById(R.id.currentQuestionNumber);
        quizProgressBar = findViewById(R.id.QuizProgressBar);
        quizQuestion = findViewById(R.id.quizQuestion);
        quizQuestionDetails = findViewById(R.id.quizQuestionDetails);
        option1Button = findViewById(R.id.option1Button);
        option2Button = findViewById(R.id.option2Button);
        option3Button = findViewById(R.id.option3Button);
        option4Button = findViewById(R.id.option4Button);
        submitButton = findViewById(R.id.submitButton);
    }

    public void option1ButtonPressed(View view) {
        System.out.println("option1ButtonPressed!");
    }
    public void option2ButtonPressed(View view) {
        System.out.println("option2ButtonPressed!");
    }
    public void option3ButtonPressed(View view) {
        System.out.println("option3ButtonPressed!");
    }
    public void option4ButtonPressed(View view) {
        System.out.println("option4ButtonPressed!");
    }
    public void submitButtonPressed(View view) {
        System.out.println("submitButtonPressed!");
    }
}
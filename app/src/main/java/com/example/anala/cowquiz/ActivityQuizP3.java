package com.example.anala.cowquiz;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class ActivityQuizP3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_p3);
    }

    /**
     * Called when the user taps the Next button
     * */
    public void continueToPartFour(View view) {
        //Check answers for Part 3
        RadioButton Q6AnswerRadioButton = findViewById(R.id.Q6_correct_answer_radioButton);
        boolean hasQ6Correct = Q6AnswerRadioButton.isChecked();

        RadioButton Q7AnswerRadioButton = findViewById(R.id.Q7_correct_answer_radioButton);
        boolean hasQ7Correct = Q7AnswerRadioButton.isChecked();

        RadioButton Q8AnswerRadioButton = findViewById(R.id.Q8_correct_answer_radioButton);
        boolean hasQ8Correct = Q8AnswerRadioButton.isChecked();

        //Update the # of correct answers
        if(hasQ6Correct){
            ActivityBeginQuizP1.CorrectAnswers = ActivityBeginQuizP1.CorrectAnswers + 1;
        }
        if(hasQ7Correct){
            ActivityBeginQuizP1.CorrectAnswers = ActivityBeginQuizP1.CorrectAnswers + 1;
        }
        if(hasQ8Correct){
            ActivityBeginQuizP1.CorrectAnswers = ActivityBeginQuizP1.CorrectAnswers + 1;
        }

        // start next activity
        Intent intent = new Intent(this, ActivityQuizP4.class);
        startActivity(intent);
    }
}

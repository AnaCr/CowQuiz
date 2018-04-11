package com.example.anala.cowquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityQuizP2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_p2);
    }

    /**
     * Called when the user taps the Next button
     * */
    public void continueToPartThree(View view) {
        //Check answers for Part 2
        EditText Q4AnswerEditText = findViewById(R.id.Q4_response);
        String Q4response = Q4AnswerEditText.getText().toString().toLowerCase().trim();
        EditText Q5AnswerEditText = findViewById(R.id.Q5_response);
        String Q5response = Q5AnswerEditText.getText().toString().toLowerCase().trim();

        //Update the # of correct answers
        if(Q4response.equals("spot")){
            ActivityBeginQuizP1.CorrectAnswers = ActivityBeginQuizP1.CorrectAnswers +1;
        }
        if(Q5response.equals("red")){
            ActivityBeginQuizP1.CorrectAnswers = ActivityBeginQuizP1.CorrectAnswers +1;
        }

        // start next activity
        Intent intent = new Intent(this, ActivityQuizP3.class);
        startActivity(intent);
    }
}

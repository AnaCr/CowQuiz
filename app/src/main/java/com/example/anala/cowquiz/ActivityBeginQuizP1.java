package com.example.anala.cowquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.TextView;

public class ActivityBeginQuizP1 extends AppCompatActivity {

    /** variables */
    public static int CorrectAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin_quiz_p1);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        //TODO: call all find views by id here

        // display the good luck message include the Name
        TextView textView = findViewById(R.id.goodluck_textview);
        String goodLuckMessage = getString(R.string.good_luck)+ " " + MainActivity.Name + "!";
        textView.setText(goodLuckMessage);
    }

    /**
     * Called when the user taps the Next button
     * */
    public void continueToPartTwo(View view) {
        //Check answers for Part 1
        RadioButton Q1AnswerRadioButton = findViewById(R.id.Q1_correct_answer_radioButton);
        boolean hasQ1Correct = Q1AnswerRadioButton.isChecked();

        RadioButton Q2AnswerRadioButton = findViewById(R.id.Q2_correct_answer_radioButton);
        boolean hasQ2Correct = Q2AnswerRadioButton.isChecked();

        RadioButton Q3AnswerRadioButton = findViewById(R.id.Q3_correct_answer_radioButton);
        boolean hasQ3Correct = Q3AnswerRadioButton.isChecked();

        //Calculate the # of correct answers
        if(hasQ1Correct){
            CorrectAnswers = CorrectAnswers + 1;
        }
        if(hasQ2Correct){
            CorrectAnswers = CorrectAnswers + 1;
        }
        if(hasQ3Correct){
            CorrectAnswers = CorrectAnswers + 1;
        }

        // start next activity
        Intent intent = new Intent(this, ActivityQuizP2.class);
        startActivity(intent);

    }


}

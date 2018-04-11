package com.example.anala.cowquiz;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class ActivityQuizP4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_p4);
    }

    /**
     * Called when the user taps the Next button
     * */
    public void endQuiz_showScore(View view) {
        //Check answers for Part 4
        CheckBox Q9FirstResponseCheckBox = findViewById(R.id.Q9_first_correct_answer_CheckBox);
        boolean hasQ9Option1 = Q9FirstResponseCheckBox.isChecked();
        CheckBox Q9SecondResponseCheckBox = findViewById(R.id.Q9_second_correct_answer_CheckBox);
        boolean hasQ9Option2 = Q9SecondResponseCheckBox.isChecked();
        CheckBox Q9ThirdResponseCheckBox = findViewById(R.id.Q9_third_correct_answer_CheckBox);
        boolean hasQ9Option3 = Q9ThirdResponseCheckBox.isChecked();
        CheckBox Q9IncorrectResponseCheckBox = findViewById(R.id.Q9_incorrect_answer);
        boolean hasQ9IncorrectOption = Q9IncorrectResponseCheckBox.isChecked();

        CheckBox Q10FirstResponseCheckBox = findViewById(R.id.Q10_first_correct_answer_CheckBox);
        boolean hasQ10Option1 = Q10FirstResponseCheckBox.isChecked();
        CheckBox Q10IncorrectResponseCheckBox = findViewById(R.id.Q10_incorrect_answer);
        boolean hasQ10IncorrectOption = Q10IncorrectResponseCheckBox.isChecked();
        CheckBox Q10ThirdResponseCheckBox = findViewById(R.id.Q10_second_correct_answer_CheckBox);
        boolean hasQ10Option3 = Q10ThirdResponseCheckBox.isChecked();
        CheckBox Q10FourthResponseCheckBox = findViewById(R.id.Q10_third_correct_answer_CheckBox);
        boolean hasQ10Option4 = Q10FourthResponseCheckBox.isChecked();

        //Update the # of correct answers
        if(hasQ9Option1 && hasQ9Option2 && hasQ9Option3 && !hasQ9IncorrectOption){
            ActivityBeginQuizP1.CorrectAnswers = ActivityBeginQuizP1.CorrectAnswers + 1;
        }
        if(hasQ10Option1 && hasQ10Option3 && hasQ10Option4 && !hasQ10IncorrectOption){
            ActivityBeginQuizP1.CorrectAnswers = ActivityBeginQuizP1.CorrectAnswers + 1;
        }

        // start next activity
        Intent intent = new Intent(this, ActivityEndQuiz.class);
        startActivity(intent);
    }

}

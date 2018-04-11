package com.example.anala.cowquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityEndQuiz extends AppCompatActivity {

    /** variables */
    public static int TotalNumberOfQuestions = 10;
    public static int PointsPerQuestion = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_quiz);

        //Calculate incorrect answers and score using correctAnswers
        int incorrectAnswers = TotalNumberOfQuestions - ActivityBeginQuizP1.CorrectAnswers;
        int score = ActivityBeginQuizP1.CorrectAnswers * PointsPerQuestion;


        //Score summary text
        String scoreSummary = getString(R.string.name)+ " " + MainActivity.Name +
                getString(R.string.correct_answers)+ " " + ActivityBeginQuizP1.CorrectAnswers +
                getString(R.string.incorrect_answers) + " " + incorrectAnswers +
                getString(R.string.score) + " " + score + "%";

        // Capture the layout's TextView and set the score summary string as its text
        TextView textView = findViewById(R.id.score_summary_text_view);
        textView.setText(scoreSummary);
    }

    /**
     * Called when the user taps the Retake button
     * */
    public void retakeQuiz(View view) {
        // start MainActivity & reset all metrics

        MainActivity.Name = "";
        ActivityBeginQuizP1.CorrectAnswers = 0;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}

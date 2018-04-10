package com.example.anala.cowquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    /** variables */
    public static String Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user taps the Next button
     * */
    public void beginQuiz(View view) {
        // start next activity & send it the Name
        Intent intent = new Intent(this, ActivityBeginQuizP1.class);
        EditText editText = findViewById(R.id.name_field);
        Name = editText.getText().toString();
        startActivity(intent);

    }
}

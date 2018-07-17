package com.example.samuelthomas.quizzapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int scoreQuiz1 = 0;
    String Q4 = "The Same";
    String Q41 = "the same";
    String Q42 = "Equal";
    String Q423 = "equal";
    String Q4234 = "Both";
    String Q42345 = "both";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Correct/Incorrect Buttons
     */

    public void Q2istherightanswer(View view) {
        ScrollView sv = (ScrollView) findViewById(R.id.scroll_view);
        TextView tv = (TextView)  findViewById(R.id.question_2);
        sv.scrollTo(0, tv.getTop());
        scoreQuiz1 = scoreQuiz1 +1;
        displayQuiz(scoreQuiz1);


        Toast.makeText(this, "CORRECT!", Toast.LENGTH_SHORT).show();

    }

    public void WrongChoice1(View view) {
        Toast.makeText(this, "Incorrect, please try again!", Toast.LENGTH_LONG).show();
        scoreQuiz1 = scoreQuiz1 -1;
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

    public void WrongChoice2(View view) {
        Toast.makeText(this, "Incorrect, please try again", Toast.LENGTH_LONG).show();
        scoreQuiz1 = scoreQuiz1 -1;
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

    public void Wrongchoice3(View view) {
        Toast.makeText(this, "Incorrect, please try again!", Toast.LENGTH_LONG).show();
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

    public void WronganswerforQ2(View view) {
        Toast.makeText(this, "Incorrect, please try again!", Toast.LENGTH_LONG).show();
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

    public void WrongQ2(View view) {
        Toast.makeText(this, "Incorrect, please try again!", Toast.LENGTH_LONG).show();
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

    public void CorrectQ2(View view) {
        ScrollView sv = (ScrollView) findViewById(R.id.scroll_view);
        TextView qt = (TextView)  findViewById(R.id.question_4);
        sv.scrollTo(0, qt.getTop());
        scoreQuiz1 = scoreQuiz1 +1;
        displayQuiz(scoreQuiz1);

        Toast.makeText(this, "CORRECT!", Toast.LENGTH_LONG).show();
    }

    public void IncorrectQ2(View view) {
        Toast.makeText(this, "Incorrect, please try again!", Toast.LENGTH_LONG).show();
        scoreQuiz1 = scoreQuiz1 -1;
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

    public void IncorrectChoiceQ3(View view) {
        Toast.makeText(this, "Incorrect, please try again!", Toast.LENGTH_LONG).show();
        scoreQuiz1 = scoreQuiz1 -1;
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

    public void WrongQ3(View view) {
        Toast.makeText(this, "Incorrect, please try again!", Toast.LENGTH_LONG).show();
        scoreQuiz1 = scoreQuiz1 -1;
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

    public void IncorrectQ3(View view) {
        Toast.makeText(this, "Incorrect, please try again!", Toast.LENGTH_LONG).show();
        scoreQuiz1 = scoreQuiz1 -1;
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

    public void CorrectQ3(View view) {
        CheckBox q3R = (CheckBox) findViewById(R.id.Q3Answer);
        Boolean question3Answer = q3R.isChecked();
        scoreQuiz1 = scoreQuiz1 +1;
        displayQuiz(scoreQuiz1);


        Toast.makeText(this, "CORRECT!", Toast.LENGTH_LONG).show();
    }
    /** score/updated score

     */

    public void displayQuiz(int score) {
        TextView scoreView = (TextView) findViewById(R.id.point_view);
        scoreView.setText(String.valueOf(score));
        if (score == 5){
            Toast.makeText(this, "You cheated the score! The score should be out of 4", Toast.LENGTH_SHORT).show();
            return;
        }




    }

    public void edit_Text_answer(View view){
        EditText question4 = (EditText) findViewById(R.id.input_text_view);
        String question4Answer = question4.getText().toString();
        if (question4Answer.equalsIgnoreCase(Q4) || question4Answer.equalsIgnoreCase(Q41) || question4Answer.equalsIgnoreCase(Q423) || question4Answer.equalsIgnoreCase(Q4234)) question4Answer.equalsIgnoreCase(Q42345); {
        }
        scoreQuiz1 = scoreQuiz1 +1;
        displayQuiz(scoreQuiz1);
    }
    /** Give result/score visible when button is pressed

     */
    public void resultScore(View view) {
        TextView sV = (TextView) findViewById(R.id.point_view);
        sV.setVisibility(View.VISIBLE);




    }
    }



















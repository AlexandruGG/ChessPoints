package com.example.android.chesspoints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.chesspoints.R;

public class MainActivity extends AppCompatActivity {

    int scoreWhite = 0;
    int scoreBlack = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for White.
     */
    public void displayForWhite(int score) {
        TextView scoreView = (TextView) findViewById(R.id.white_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Black.
     */
    public void displayForBlack(int score) {
        TextView scoreView = (TextView) findViewById(R.id.black_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForWhite(View v) {
        scoreWhite += 1;
        displayForWhite(scoreWhite);
    }

    public void addOneForBlack(View v) {
        scoreBlack += 1;
        displayForBlack(scoreBlack);
    }

    public void addThreeForWhite(View v) {
        scoreWhite += 3;
        displayForWhite(scoreWhite);
    }

    public void addThreeForBlack(View v) {
        scoreBlack += 3;
        displayForBlack(scoreBlack);

    }
    public void addFiveForWhite(View v) {
        scoreWhite += 5;
        displayForWhite(scoreWhite);
    }

    public void addFiveForBlack(View v) {
        scoreBlack += 5;
        displayForBlack(scoreBlack);

    }public void addNineForWhite(View v) {
        scoreWhite += 9;
        displayForWhite(scoreWhite);
    }

    public void addNineForBlack(View v) {
        scoreBlack += 9;
        displayForBlack(scoreBlack);

    }

    public void resetScore(View v) {
        scoreWhite = 0;
        scoreBlack = 0;
        displayForWhite(scoreWhite);
        displayForBlack(scoreBlack);
    }
}

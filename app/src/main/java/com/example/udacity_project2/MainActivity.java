package com.example.udacity_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int TeamA = 0;
    int TeamB = 0;
    int conversion_TeamA = 0;
    int conversion_TeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void button_try(View view) {
        conversion_TeamA = 1;
        TeamA = TeamA + 5;
        displayForTeamA(TeamA);
    }

    public void button_conversion(View view) {
        if (conversion_TeamA == 1) {
            TeamA = TeamA + 3;
            displayForTeamA(TeamA);
            conversion_TeamA = 0;

        } else {
            displayForTeamA(TeamA);
        }

    }


    public void button_penalty(View view) {

        conversion_TeamA = 0;
        TeamA = TeamA + 3;
        displayForTeamA(TeamA);
    }

    public void button_dropkick(View view) {
        TeamA = TeamA + 3;
        conversion_TeamA = 0;
        displayForTeamA(TeamA);
    }

    public void buttonb_try(View view) {
        conversion_TeamB = 1;
        TeamB = TeamB + 5;
        displayForTeamB(TeamB);
    }


    public void buttonb_conversion(View view) {
        if (conversion_TeamB == 1) {
            TeamB = TeamB + 3;
            displayForTeamB(TeamB);
            conversion_TeamB = 0;

        } else {
            displayForTeamB(TeamB);
        }
    }

    public void buttonb_penalty(View view) {
        conversion_TeamB = 0;
        TeamB = TeamB + 3;
        displayForTeamB(TeamB);
    }

    public void buttonb_dropkick(View view) {
        conversion_TeamB = 0;
        TeamB = TeamB + 3;
        displayForTeamB(TeamB);
    }

    public void reset(View view) {
        TeamA = 0;
        TeamB = 0;
        conversion_TeamA = 0;
        conversion_TeamB = 0;
        displayForTeamA(TeamA);
        displayForTeamB(TeamB);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
package com.example.udacity_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int TeamA = 0;
    int TeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void button_plus3(View view) {
        TeamA = TeamA + 3;
        displayForTeamA(TeamA);
    }

    public void button_plus2(View view) {
        TeamA = TeamA + 2;
        displayForTeamA(TeamA);
    }

    public void button_plus1(View view) {
        TeamA++;
        displayForTeamA(TeamA);
    }

    public void buttonb_plus3(View view) {
        TeamB = TeamB + 3;
        displayForTeamB(TeamB);
    }

    public void buttonb_plus2(View view) {
        TeamB = TeamB + 2;
        displayForTeamB(TeamB);
    }

    public void buttonb_plus1(View view) {
        TeamB++;
        displayForTeamB(TeamB);
    }
    public void reset(View view){
        TeamA = 0;
        TeamB = 0;
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
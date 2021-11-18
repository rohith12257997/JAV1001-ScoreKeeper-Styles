
/*
  SName:Kavya Chapparapu , SID:A00246625
  SName : Alekhya , SID : A00245382
  SName : Rohit , SID : A00245384 */




package com.example.android.basketball;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

private Switch aswitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

       /* this is to set theme darkmode and light mode*/

        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.DarkTheme);


        }else
        {
            setTheme(R.style.AppTheme);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aswitch=findViewById(R.id.mode);
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            aswitch.setChecked(true);

        }

       /* Here we are checking about the toggle switch is on or off*/
        aswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                    Toast toast=Toast. makeText(getApplicationContext(),"Dark Mode Is On",Toast. LENGTH_SHORT);
                    toast.show();
                    reset();

                    
                }else
                {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    Toast toast=Toast. makeText(getApplicationContext(),"Dark Mode Is Off",Toast. LENGTH_SHORT);
                    toast.show();
                    reset();
                }
            }
        });
    }

   /* This is to kind of refreshing the mainactivity*/
    private void reset() {
        Intent intent =  new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

    /*initializing variables */
    int teamA = 0;
    int teamB = 0;

    /*incrementing score by 1 */
    public void setTeamA1(View view) {
        teamA = teamA + 1;
        score_board_a_current(teamA);
    }
    /*incrementing score by 2 */
    public void setTeamA2(View view) {
        teamA = teamA + 2;
        score_board_a_current(teamA);
    }
    /*incrementing score by 3 */
    public void setTeamA3(View view) {
        teamA = teamA + 3;
        score_board_a_current(teamA);
    }
    /*incrementing score */
    public void setTeamB1(View view) {
        teamB = teamB + 1;
        score_board_b_current(teamB);
    }
    /*incrementing score */
    public void setTeamB2(View view) {
        teamB = teamB + 2;
        score_board_b_current(teamB);
    }
    /*incrementing score */
    public void setTeamB3(View view) {
        teamB = teamB + 3;
        score_board_b_current(teamB);
    }

    /*update score */
    @SuppressLint("SetTextI18n")
    public void score_board_a_current(int number) {
        TextView textView = findViewById(R.id.score_board_team_A);
        textView.setText("" + number);
    }

    /*update score */
    @SuppressLint("SetTextI18n")
    public void score_board_b_current(int number) {
        TextView textView = findViewById(R.id.score_board_team_B);
        textView.setText("" + number);
    }
}

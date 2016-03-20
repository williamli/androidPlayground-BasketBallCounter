package io.bbi.williamli.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resetScore();

        final Button resetAllBtn = (Button) findViewById(R.id.resetButton);
        final Button teamAScoreBtn1 = (Button) findViewById(R.id.teamAScoreBtn1);
        final Button teamAScoreBtn2 = (Button) findViewById(R.id.teamAScoreBtn2);
        final Button teamAScoreBtn3 = (Button) findViewById(R.id.teamAScoreBtn3);
        final Button teamBScoreBtn1 = (Button) findViewById(R.id.teamBScoreBtn1);
        final Button teamBScoreBtn2 = (Button) findViewById(R.id.teamBScoreBtn2);
        final Button teamBScoreBtn3 = (Button) findViewById(R.id.teamBScoreBtn3);


        resetAllBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                resetScore();

            }
        });


        teamAScoreBtn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                addScore(1, 'A');

            }
        });

        teamAScoreBtn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                addScore(2, 'A');

            }
        });

        teamAScoreBtn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                addScore(3, 'A');

            }
        });


        teamBScoreBtn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                addScore(1, 'B');

            }
        });

        teamBScoreBtn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                addScore(2, 'B');

            }
        });

        teamBScoreBtn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                addScore(3, 'B');

            }
        });



    }



    private void resetScore() {
        scoreTeamA = 0;
        scoreTeamB = 0;
        renderScore();
    }

    private void addScore(int score, char team) {
        switch (team) {
            case 'A':
                scoreTeamA += score;
                break;

            case 'B':
                scoreTeamB += score;
                break;
        }

        renderScore();
    }

    private void renderScore() {
        TextView teamALabel = (TextView)findViewById(R.id.teamAScore);
        TextView teamBLabel = (TextView)findViewById(R.id.teamBScore);

        teamALabel.setText(Integer.toString(scoreTeamA));
        teamBLabel.setText(Integer.toString(scoreTeamB));
    }


}

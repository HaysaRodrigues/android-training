package com.haysarodrigues.velhagame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    // 0 = bug, 1 = fix
    int activePlayer = 0;

    boolean isGameActive = true;

    // 2 means that the slot wasn't palyed

    int [] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    int [] [] winningPositions = {{0, 1, 2}, {3, 4, 5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0, 4, 8}, {2, 4, 6}};

    public void dropIn(View view){

        ImageView counter = (ImageView) view;

        System.out.println(counter.getTag().toString());

        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        counter.setTranslationY(-1000f);

    if (gameState[tappedCounter] == 2 && isGameActive) {

        gameState[tappedCounter] = activePlayer;

        if (activePlayer == 0) {
            counter.setImageResource(R.drawable.fix);

            activePlayer = 1;
        } else {

            counter.setImageResource(R.drawable.bug);

            activePlayer = 0;
        }

        counter.animate().translationYBy(1000f).rotation(360).setDuration(300);

        for (int [] winningPosition : winningPositions){

            if(gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                    gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                    gameState[winningPosition[0]] != 2) {



                // para dizer quem ganhou:

                String winner = "Bug";

                if (gameState[winningPosition[0]] == 0) {

                    winner = "Fix";
                }


                // Ver quem ganhou pelo console
                System.out.println(counter.getTag().toString() + "GANHOUUUUUUUUUUUUU");


                //Someone has won.

                isGameActive = false;

                TextView winnerMessage = (TextView) findViewById(R.id.winnerMessage);

                winnerMessage.setText(winner + " has won!");

                // exibe o segundo layout

                LinearLayout layout = (LinearLayout) findViewById(R.id.linearLayout1);

                layout.setVisibility(View.VISIBLE);

            } else
                {

                    boolean gameIsOver = true;

                    for (int counterState : gameState){
                        if (counterState == 2)
                            gameIsOver = false;
                    }

                    if (gameIsOver){

                        TextView winnerMessage = (TextView) findViewById(R.id.winnerMessage);

                        winnerMessage.setText("Código ruim!");

                        // exibe o segundo layout

                        LinearLayout layout = (LinearLayout) findViewById(R.id.linearLayout1);

                        layout.setVisibility(View.VISIBLE);
                    }
                }

        }

        }

    }


    public void playAgain(View view){

        LinearLayout layout = (LinearLayout) findViewById(R.id.linearLayout1);

        layout.setVisibility(View.INVISIBLE);

        isGameActive = true;

        // 0 = bug, 1 = fix
        activePlayer = 0;

        for (int i = 0; i < gameState.length; i ++){

            gameState[i] = 2;
        }

        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);

        for (int i = 0; i < gridLayout.getChildCount(); i++){
            ((ImageView) gridLayout.getChildAt(i)).setImageResource(0);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

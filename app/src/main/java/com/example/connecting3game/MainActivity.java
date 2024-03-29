package com.example.connecting3game;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.assist.AssistStructure;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

                int active=0;
                int[] gamespot={2,2,2,2,2,2,2,2,2};
                boolean gameactive = true;
                Button b;


                public void change(View view) {
                    ImageView counter = (ImageView) view;
                    int gametag = Integer.parseInt((counter.getTag().toString()));
                    if (gamespot[gametag] == 2 && gameactive) {
                        if (active == 0) {
                            counter.setImageResource(R.drawable.red);
                            counter.animate().rotation(3600).setDuration(1500);
                            gamespot[gametag] = active;
                            check();
                            active = 1;
                        } else {
                            counter.setImageResource(R.drawable.yellow);
                            counter.animate().rotation(3600).setDuration(1500);
                            gamespot[gametag] = active;
                            check();
                            active = 0;
            }


        }
    }
        public void check(){
        if(gamespot[0]==1&&gamespot[1]==1&&gamespot[2]==1){
            Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
            tryagain();

        }
            else if(gamespot[3]==1&&gamespot[4]==1&&gamespot[5]==1){
                Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
                tryagain();
            }
            else if(gamespot[6]==1&&gamespot[7]==1&&gamespot[8]==1){
                Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
                tryagain();
            }
           else if(gamespot[0]==1&&gamespot[3]==1&&gamespot[6]==1){
                Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
                tryagain();
            }
            else if(gamespot[2]==1&&gamespot[5]==1&&gamespot[8]==1){
                Toast.makeText(this, " O won", Toast.LENGTH_SHORT).show();
                tryagain();
            }
            else if(gamespot[0]==1&&gamespot[4]==1&&gamespot[8]==1){
                Toast.makeText(this, " O won", Toast.LENGTH_SHORT).show();
                tryagain();
            }
            else if(gamespot[2]==1&&gamespot[4]==1&&gamespot[6]==1){
                Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
                tryagain();
            }
            else if(gamespot[0]==0&&gamespot[1]==0&&gamespot[2]==0){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
                tryagain();
            }
            else if(gamespot[3]==0&&gamespot[4]==0&&gamespot[5]==0){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
                tryagain();
            }
            else if(gamespot[6]==0&&gamespot[7]==0&&gamespot[8]==0){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
                tryagain();
            }
            else if(gamespot[0]==0&&gamespot[3]==0&&gamespot[6]==0){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
                tryagain();
            }
            else if(gamespot[2]==0&&gamespot[5]==0&&gamespot[8]==0){
                Toast.makeText(this, " X won", Toast.LENGTH_SHORT).show();
                tryagain();
            }
            else if(gamespot[0]==0&&gamespot[4]==0&&gamespot[8]==0){
                Toast.makeText(this, " X won", Toast.LENGTH_SHORT).show();
                tryagain();
            }
            else if(gamespot[2]==0&&gamespot[4]==0&&gamespot[6]==0){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
                tryagain();
            }


        }
        public void tryagain(){
            b = findViewById(R.id.button);
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("Game Over");
            builder.setMessage("game is over try again to win it");
            builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    b.setVisibility(View.VISIBLE);
                }
            });

            AlertDialog dialog=builder.create();
            dialog.show();


            gameactive=false;



        }
        public void refresh(View view){
            androidx.gridlayout.widget.GridLayout gridLayout = findViewById(R.id.gridLayout1);


            for(int i=0; i<gridLayout.getChildCount(); i++) {
                ImageView counter = (ImageView) gridLayout.getChildAt(i);
                // do stuff with child
                counter.setImageDrawable(null);

            }
             active=0;
            Button b = (Button) findViewById(R.id.button);
            b.setVisibility(View.INVISIBLE);
            gameactive = true;
            for(int i =0; i<9; i++){
                gamespot[i]=2;
            }
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

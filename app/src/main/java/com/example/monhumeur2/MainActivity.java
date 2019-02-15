package com.example.monhumeur2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private ImageView mSmiley;
    private ImageButton mCommentary;
    private ImageButton mHistory;

    int smiley;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSmiley = (ImageView) findViewById(R.id.imageSmiley);
        mCommentary = (ImageButton) findViewById(R.id.imageComment);
        mHistory = (ImageButton) findViewById(R.id.imageHistory);

        smiley=0;

        public void onSwipeBottom(){
            smiley++;
            if(smiley>4){
                  mSmiley.setImageResource(R.drawable.verynothappy);
                  }
            else if (smiley=1){
                mSmiley.setImageResource(R.drawable.nothappy);}
            else if (smiley=2){
                mSmiley.setImageResource(R.drawable.smiley_happy);}
            else if (smiley=3){
                mSmiley.setImageResource(R.drawable.veryhappy);}
            else if (smiley=4){
                mSmiley.setImageResource(R.drawable.VERYVERYHAPPY);}


            }

        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
        builder1.setMessage("your message");
        builder1.setCancelable(false);
        builder1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        AlertDialog Alert1 = builder1.create();
        Alert1 .show();
        (ImageButton)Alert1.findViewById(R.id.imageComment);

        }



    }
}

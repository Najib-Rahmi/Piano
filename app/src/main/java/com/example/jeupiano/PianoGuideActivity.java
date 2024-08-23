package com.example.jeupiano;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
public class PianoGuideActivity extends AppCompatActivity {
        Button tune1, tune2, tune3, back;
        public final static int code_tune1=1
                ,code_tune2=2
                ,code_tune3=3;
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pianoguide);

            tune1 = (Button) findViewById(R.id.tune1);
            tune2 = (Button) findViewById(R.id.tune2);
            tune3 = (Button) findViewById(R.id.tune3);
            back = (Button) findViewById(R.id.back);


            tune1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(PianoGuideActivity.this, tune1.class);
                    startActivityForResult(i,code_tune1);
                }
            });
            tune2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(PianoGuideActivity.this, tune2.class);
                    startActivityForResult(i,code_tune2);
                }
            });
            tune3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(PianoGuideActivity.this, tune3.class);
                    startActivityForResult(i,code_tune3);
                }
            });
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PianoGuideActivity.this);
                    builder.setMessage("Do you want to back to the last View ?");
                    builder.setTitle("Alert !");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                        Intent i= new Intent(PianoGuideActivity.this, choixActivity.class);
                        startActivity(i);

                    });
                    builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                        dialog.cancel();
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            });
        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==code_tune1){
            if(resultCode==RESULT_CANCELED){
                AlertDialog.Builder builder = new AlertDialog.Builder(PianoGuideActivity.this);
                builder.setMessage("would you like to back to list without completing the tune ?");
                builder.setTitle("Repture !");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {

                });
                builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                    Intent i= new Intent(PianoGuideActivity.this, tune1.class);
                    startActivity(i);
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }

        }
        if(requestCode==code_tune2){
            if(resultCode==RESULT_CANCELED){
            AlertDialog.Builder builder = new AlertDialog.Builder(PianoGuideActivity.this);
            builder.setMessage("would you like to back to list without completing the tune ?");
            builder.setTitle("Repture !");
            builder.setCancelable(false);
            builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {

            });
            builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                Intent i= new Intent(PianoGuideActivity.this, tune2.class);
                startActivity(i);
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }}
        if(requestCode==code_tune3){
            if(resultCode==RESULT_CANCELED){
            AlertDialog.Builder builder = new AlertDialog.Builder(PianoGuideActivity.this);
            builder.setMessage("would you like to back to list without completing the tune ?");
            builder.setTitle("Repture !");
            builder.setCancelable(false);
            builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
            });
            builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                Intent i= new Intent(PianoGuideActivity.this, tune3.class);
                startActivity(i);
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }}
    }
}

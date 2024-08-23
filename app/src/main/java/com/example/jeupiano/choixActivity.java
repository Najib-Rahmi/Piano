package com.example.jeupiano;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class choixActivity extends AppCompatActivity {
    Button guide,autonome,deconnection;
    TextView welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guide = (Button) findViewById(R.id.guide);
        autonome = (Button) findViewById(R.id.autonome);
        deconnection =(Button) findViewById(R.id.deconnection);
        welcome=(TextView)findViewById(R.id.welcome);
        Intent i=getIntent();
        String login=i.getStringExtra("cleLogin");
        welcome.setText(" Salut "+login);



        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(choixActivity.this, PianoGuideActivity.class);

                startActivity(i);
                guide.setBackgroundResource(R.color.purple_700);
            }
        });
        autonome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(choixActivity.this, PianoAutonomeActivity.class);

                startActivity(i);
                autonome.setBackgroundResource(R.color.purple_700);
            }
        });
        deconnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(choixActivity.this);
                builder.setMessage("Do you want to disconnect ?");
                builder.setTitle("Alert !");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                    Intent i= new Intent(choixActivity.this, ConnectActivity.class);
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
}
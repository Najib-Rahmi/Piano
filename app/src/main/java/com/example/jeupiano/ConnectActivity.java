package com.example.jeupiano;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
public class ConnectActivity extends AppCompatActivity {
    Button connect;
    String username="Najib";
    String password="rahmi";
    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
        connect=(Button) findViewById(R.id.connect);
        user=(EditText)findViewById(R.id.user);
        pass=(EditText)findViewById(R.id.password);
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((user.getText().toString()).equals(username) && (pass.getText().toString()).equals(password)) {
                    Intent i = new Intent(ConnectActivity.this, choixActivity.class);
                    i.putExtra("cleLogin",user.getText().toString());
                    startActivity(i);
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ConnectActivity.this);
                    builder.setMessage("dear customer , \n check your username and password ");
                    builder.setTitle("Alert !");
                    builder.setCancelable(true);
                    builder.setNegativeButton("OK", (DialogInterface.OnClickListener) (dialog, which) -> {
                        dialog.cancel();
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
    }
}

package com.example.jeupiano;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class record extends AppCompatActivity implements View.OnClickListener {
    Button doo,doo2,re,re2,mi,fa,fa2,sol;
    MediaPlayer mediaPlayerDo, mediaPlayerRe, mediaPlayerMi,
            mediaPlayerFa, mediaPlayerSol,mediaPlayerDo2, mediaPlayerRe2, mediaPlayerFa2;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record);
        doo=(Button) findViewById(R.id.doo);
        doo2=(Button) findViewById(R.id.doo2);
        re=(Button) findViewById(R.id.re);
        re2=(Button) findViewById(R.id.re2);
        mi=(Button) findViewById(R.id.mi);
        fa=(Button) findViewById(R.id.fa);
        fa2=(Button) findViewById(R.id.fa2);
        sol=(Button) findViewById(R.id.sol);

        mediaPlayerDo = MediaPlayer.create(this, R.raw.doo);
        mediaPlayerDo2 = MediaPlayer.create(this, R.raw.doo);
        mediaPlayerRe = MediaPlayer.create(this, R.raw.re);
        mediaPlayerRe2 = MediaPlayer.create(this, R.raw.re);
        mediaPlayerMi = MediaPlayer.create(this, R.raw.mi);
        mediaPlayerFa = MediaPlayer.create(this, R.raw.fa);
        mediaPlayerFa2 = MediaPlayer.create(this, R.raw.fa);
        mediaPlayerSol = MediaPlayer.create(this, R.raw.sol);

        doo.setOnClickListener(this);
        doo2.setOnClickListener(this);
        re.setOnClickListener(this);
        re2.setOnClickListener(this);
        mi.setOnClickListener(this);
        fa.setOnClickListener(this);
        fa2.setOnClickListener(this);
        sol.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case (R.id.doo):
                mediaPlayerDo.start();
                break;
            case (R.id.doo2):
                mediaPlayerDo2.start();
                break;
            case (R.id.re):
                mediaPlayerRe.start();
                break;
            case (R.id.re2):
                mediaPlayerRe2.start();
                break;
            case (R.id.mi):
                mediaPlayerMi.start();
                break;
            case (R.id.fa):
                mediaPlayerFa.start();
                break;
            case (R.id.fa2):
                mediaPlayerFa2.start();
                break;
            case (R.id.sol):
                mediaPlayerSol.start();
                break;
        }

    }
}

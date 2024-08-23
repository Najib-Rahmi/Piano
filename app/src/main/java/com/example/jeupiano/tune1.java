package com.example.jeupiano;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class tune1 extends AppCompatActivity implements View.OnClickListener {
    Button doo,doo2,re,re2,mi,fa,fa2,sol;
    MediaPlayer mediaPlayerDo, mediaPlayerRe, mediaPlayerMi,
            mediaPlayerFa, mediaPlayerSol,mediaPlayerDo2, mediaPlayerRe2, mediaPlayerFa2;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tune1);
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
                doo.setBackgroundResource(R.color.white);
                doo2.setBackgroundResource(R.color.teal_200);
                re.setBackgroundResource(R.color.white);
                re2.setBackgroundResource(R.color.black);
                mi.setBackgroundResource(R.color.white);
                sol.setBackgroundResource(R.color.white);
                fa.setBackgroundResource(R.color.white);
                fa2.setBackgroundResource(R.color.black);
                break;
            case (R.id.doo2):
                mediaPlayerDo2.start();
                doo.setBackgroundResource(R.color.white);
                doo2.setBackgroundResource(R.color.black);
                re.setBackgroundResource(R.color.teal_200);
                re2.setBackgroundResource(R.color.black);
                mi.setBackgroundResource(R.color.white);
                sol.setBackgroundResource(R.color.white);
                fa.setBackgroundResource(R.color.white);
                fa2.setBackgroundResource(R.color.black);
                break;
            case (R.id.re):
                mediaPlayerRe.start();
                doo.setBackgroundResource(R.color.white);
                doo2.setBackgroundResource(R.color.black);
                re.setBackgroundResource(R.color.white);
                re2.setBackgroundResource(R.color.teal_200);
                mi.setBackgroundResource(R.color.white);
                sol.setBackgroundResource(R.color.white);
                fa.setBackgroundResource(R.color.white);
                fa2.setBackgroundResource(R.color.black);
                break;
            case (R.id.re2):
                mediaPlayerRe.start();
                doo.setBackgroundResource(R.color.white);
                doo2.setBackgroundResource(R.color.black);
                re.setBackgroundResource(R.color.white);
                re2.setBackgroundResource(R.color.black);
                mi.setBackgroundResource(R.color.teal_200);
                sol.setBackgroundResource(R.color.white);
                fa.setBackgroundResource(R.color.white);
                fa2.setBackgroundResource(R.color.black);
                break;
            case (R.id.mi):
                mediaPlayerMi.start();
                doo.setBackgroundResource(R.color.white);
                doo2.setBackgroundResource(R.color.black);
                re.setBackgroundResource(R.color.white);
                re2.setBackgroundResource(R.color.black);
                mi.setBackgroundResource(R.color.white);
                sol.setBackgroundResource(R.color.white);
                fa.setBackgroundResource(R.color.teal_200);
                fa2.setBackgroundResource(R.color.black);
                break;

            case (R.id.fa):
                mediaPlayerFa.start();
                doo.setBackgroundResource(R.color.white);
                doo2.setBackgroundResource(R.color.black);
                re.setBackgroundResource(R.color.white);
                re2.setBackgroundResource(R.color.black);
                mi.setBackgroundResource(R.color.white);
                sol.setBackgroundResource(R.color.white);
                fa.setBackgroundResource(R.color.white);
                fa2.setBackgroundResource(R.color.teal_200);
                break;
            case (R.id.fa2):
                mediaPlayerSol.start();
                doo.setBackgroundResource(R.color.white);
                doo2.setBackgroundResource(R.color.black);
                re.setBackgroundResource(R.color.white);
                re2.setBackgroundResource(R.color.black);
                mi.setBackgroundResource(R.color.white);
                sol.setBackgroundResource(R.color.teal_200);
                fa.setBackgroundResource(R.color.white);
                fa2.setBackgroundResource(R.color.black);
                break;
            case (R.id.sol):
                mediaPlayerSol.start();
                doo.setBackgroundResource(R.color.teal_200);
                doo2.setBackgroundResource(R.color.black);
                re.setBackgroundResource(R.color.white);
                re2.setBackgroundResource(R.color.black);
                mi.setBackgroundResource(R.color.white);
                sol.setBackgroundResource(R.color.white);
                fa.setBackgroundResource(R.color.white);
                fa2.setBackgroundResource(R.color.black);
                setResult(RESULT_OK,new Intent());
                finish();
                break;

        }

    }

}

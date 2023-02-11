package com.yigit.catchthemodeloop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity2 extends AppCompatActivity {

    ImageView aang;
    ImageView katara;
    ImageView toph;
    ImageView zuko;

    String pickedImage;

    MediaPlayer player;

    Intent intent;
    String level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intent = getIntent();
        level = intent.getStringExtra("level");

        aang = findViewById(R.id.aangimg);
        katara = findViewById(R.id.kataraimg);
        toph = findViewById(R.id.tophimg);
        zuko = findViewById(R.id.zukoimg);



    }
    void afterPick()throws Exception{
        zuko.setClickable(false);
        aang.setClickable(false);
        katara.setClickable(false);
        toph.setClickable(false);
        Thread.sleep(3000);
        intent = new Intent(MainActivity2.this, MainActivity3.class);
        System.out.println("level " +level);
        intent.putExtra("level", level);
        intent.putExtra("pickedImage", pickedImage) ;
        startActivity(intent);






    }
    public void pickAang(View view ) throws Exception  {
        player = MediaPlayer.create(MainActivity2.this, R.raw.aangvoice);
        player.start();
        pickedImage = "aang";
        afterPick();


    }
    public void pickKatara(View view) throws Exception {
        player = MediaPlayer.create(MainActivity2.this, R.raw.kataravoice);
        player.start();
        pickedImage = "katara";
        afterPick();


    }
    public void pickToph(View view) throws Exception {
        player = MediaPlayer.create(MainActivity2.this, R.raw.tophvoice);
        player.start();
        pickedImage = "toph";
        afterPick();



    }
    public void pickZuko(View view) throws Exception {
        player = MediaPlayer.create(MainActivity2.this, R.raw.zukovoice);
        player.start();
        pickedImage = "zuko";
        afterPick();



    }

}
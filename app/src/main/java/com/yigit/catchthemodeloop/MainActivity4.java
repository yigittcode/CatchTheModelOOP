package com.yigit.catchthemodeloop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {


    Intent intent;

    String level;

    Button easy;
    Button hard;
    Button normal;
    Button insane;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        intent = getIntent();


    }

    void changeScreen(String level){
        intent = new Intent(MainActivity4.this, MainActivity2.class);
        intent.putExtra("level", level);

        easy = findViewById(R.id.easyPick);
        hard = findViewById(R.id.hardPick);
        insane = findViewById(R.id.insanePick);
        normal = findViewById(R.id.normalPick);

        easy.setClickable(false);
        normal.setClickable(false);
        hard.setClickable(false);
        insane.setClickable(false);

        startActivity(intent);



    }


    public void easyPick(View view){
      level = "easy";
      changeScreen(level);
    }

    public void hardPick(View view){
    level = "hard";
        changeScreen(level);


    }
    public void normalPick(View view){
    level = "normal";
        changeScreen(level);

    }
    public void insanePick(View view){
    level = "insane";
        changeScreen(level);

    }
}
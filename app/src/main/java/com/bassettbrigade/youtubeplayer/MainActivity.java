package com.bassettbrigade.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSingle = findViewById(R.id.btnPlaySingle);
        Button btnStandalone = findViewById(R.id.btnStandalone);
        btnSingle.setOnClickListener(this);
        btnStandalone.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()){
            case R.id.btnPlaySingle:
                intent = new Intent(this,YoutubeActivity.class);
                break;

            case R.id.btnStandalone:
                intent = new Intent(this,StandaloneActivity.class);
                break;

            default:
        }

        if (intent != null){
            startActivity(intent);
        }
    }
}

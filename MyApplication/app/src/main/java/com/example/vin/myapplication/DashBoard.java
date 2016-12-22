package com.example.vin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class DashBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        int width = getWindowManager().getDefaultDisplay().getWidth();
        int height = getWindowManager().getDefaultDisplay().getHeight();
        height=height-150;

        //Toast.makeText(getApplicationContext(), width+"wh"+height, Toast.LENGTH_LONG).show();

        Button btn_7 = (Button) findViewById(R.id.btn_7);
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(DashBoard.this,My_Profile.class);
                startActivity(k);
            }
        });
        Button btn_calender = (Button) findViewById(R.id.btn_calender);
        btn_calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(DashBoard.this,Calender_show.class);
                startActivity(k);
            }
        });

 /*
        ImageButton btn_2 = (ImageButton) findViewById(R.id.btn_2);
        btn_2.setMinimumWidth(width/2);
        btn_2.setMinimumHeight(height/3);
        btn_2.setMaxWidth(width/2);
        btn_2.setMaxHeight(height/3);

        ImageButton btn_3 = (ImageButton) findViewById(R.id.btn_3);
        btn_3.setMinimumWidth(width/2);
        btn_3.setMinimumHeight(height/3);
        btn_3.setMaxWidth(width/2);
        btn_3.setMaxHeight(height/3);

        ImageButton btn_4 = (ImageButton) findViewById(R.id.btn_4);
        btn_4.setMinimumWidth(width/2);
        btn_4.setMinimumHeight(height/3);
        btn_4.setMaxWidth(width/2);
        btn_4.setMaxHeight(height/3);

        ImageButton btn_5 = (ImageButton) findViewById(R.id.btn_5);
        btn_5.setMinimumWidth(width/2);
        btn_5.setMinimumHeight(height/3);
        btn_5.setMaxWidth(width/2);
        btn_5.setMaxHeight(height/3);

        ImageButton btn_6 = (ImageButton) findViewById(R.id.btn_6);
        btn_6.setMinimumWidth(width/2);
        btn_6.setMinimumHeight(height/3);
        btn_6.setMaxWidth(width/2);
        btn_6.setMaxHeight(height/3);
        */



    }
}

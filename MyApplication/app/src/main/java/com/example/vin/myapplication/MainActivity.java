package com.example.vin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_trace = (Button) findViewById(R.id.btn_tracing);
        button_trace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this,tracing.class);
                startActivity(k);
            }
        });

        Button button_state = (Button) findViewById(R.id.brn_state_example);
        button_state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this,State_show.class);
                startActivity(k);
            }
        });

        Button brn_DB_example = (Button) findViewById(R.id.brn_DB_example);
        brn_DB_example.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this,show_person.class);
                startActivity(k);
            }
        });


        Button btn_map = (Button) findViewById(R.id.btn_map);
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this,Map_activity.class);
                startActivity(k);
            }
        });

        Button btn_cal = (Button) findViewById(R.id.btn_calender);
        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this,Login.class);
                startActivity(k);
            }
        });



        /*hi this is comment*/



    }
}

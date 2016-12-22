package com.example.vin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class Calender_show extends AppCompatActivity {

    CalendarView calendarView;
    TextView dateDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_show);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        dateDisplay = (TextView) findViewById(R.id.date_display);
        dateDisplay.setText("Date: ");

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                dateDisplay.setText("Date: " + i2 + " / " + i1 + " / " + i);

               // Toast.makeText(getApplicationContext(), "Selected Date:\n" + "Day = " + i2 + "\n" + "Month = " + i1 + "\n" + "Year = " + i, Toast.LENGTH_LONG).show();


                Intent intent = new Intent(Calender_show.this, day_plan.class);
                Bundle b = new Bundle();

                b.putInt("dd", i2); //Your id
                b.putInt("mm", i1); //Your id
                b.putInt("yyyy", i); //Your id
                intent.putExtras(b); //Put your id to your next Intent



                startActivity(intent);
                finish();
            }
        });

    }
}

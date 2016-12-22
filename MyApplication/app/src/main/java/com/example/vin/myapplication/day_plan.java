package com.example.vin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.CompoundButton;


public class day_plan extends AppCompatActivity {
    TextView dateDisplay1;
    CheckBox chkBoxDCR;
    CheckBox chkBoxcme ;
    CheckBox chkBoxcamp ;
    CheckBox chkBoxmeeting ;
    CheckBox chkBoxleave;
    String DCR="";
    String CME;
    String CAMP;
    String MEETING;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_plan);
        dateDisplay1 = (TextView) findViewById(R.id.date_display1);

        Bundle b = getIntent().getExtras();
        int dd = -1; // or other values
        int mm = -1; // or other values
        int yyyy = -1; // or other values
        if (b != null) {
            dd = b.getInt("dd");
            mm = b.getInt("mm");
            yyyy = b.getInt("yyyy");
            dateDisplay1.setText("Date: " + dd + " / " + mm + " / " + yyyy);


        } else {
            dateDisplay1.setText("no date");


        }

        initialUISetup();


       /* dcr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                // TODO Auto-generated method stub
                if(dcr.isChecked()){
                    Toast.makeText(getApplicationContext(), "DCR checked", Toast.LENGTH_LONG);
                   // System.out.println("Checked");
                }else{
                    Toast.makeText(getApplicationContext(), "DCR unchecked", Toast.LENGTH_LONG);
                }
            }
        });*/

        Button btn_submit = (Button) findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                chkBoxleave = (CheckBox) findViewById(R.id.leave);
                if (chkBoxleave.isChecked()==true) {
                    Intent k = new Intent(day_plan.this,day_plan_Leave.class);
                    startActivity(k);
                }
                else
                {
                    DCR="f";
                    DCR="f";
                    DCR="f";
                    DCR="f";



                    Bundle b = new Bundle();
                    if (chkBoxDCR.isChecked()==true) {
                        b.putString("t", DCR);
                        DCR="t";
                    }
                    if (chkBoxcme.isChecked()==true) {
                        b.putString("t", CME);
                        CME="t";
                    }
                    if (chkBoxcamp.isChecked()==true) {
                        b.putString("t", CAMP);
                        CAMP="t";
                    }
                    if (chkBoxmeeting.isChecked()==true) {
                        b.putString("t", MEETING);
                        MEETING="t";
                    }

                    if((DCR=="f"))  /* check if dcr not checked and any of (CME,CAMP,CME) is selected */

                    {
                        int cnt=0;
                        if(CME=="t")
                        {  cnt++;}
                        if(CAMP=="t")
                        { cnt++;}
                        if(MEETING=="t")
                        { cnt++;}
                        if(cnt >0)
                        {
                            Intent intent = new Intent(day_plan.this, day_plan_other.class);
                            intent.putExtras(b); //Put your id to your next Intent
                            startActivity(intent);
                            finish();
                        }
                    }
                    else if(DCR=="t")
                    {
                        Intent intent = new Intent(day_plan.this, day_plan_dcr.class);
                        intent.putExtras(b); //Put your id to your next Intent
                        startActivity(intent);
                        finish();
                    }


                }



            }

        });


    }

    public void initialUISetup() {
        chkBoxDCR = (CheckBox) findViewById(R.id.dcr);
        chkBoxcme = (CheckBox) findViewById(R.id.cme);
        chkBoxcamp = (CheckBox) findViewById(R.id.camp);
        chkBoxmeeting = (CheckBox) findViewById(R.id.meeting);
        chkBoxleave = (CheckBox) findViewById(R.id.leave);

        chkBoxDCR.setOnCheckedChangeListener(new myCheckBoxChnageClicker());
        chkBoxcme.setOnCheckedChangeListener(new myCheckBoxChnageClicker());
        chkBoxcamp.setOnCheckedChangeListener(new myCheckBoxChnageClicker());
        chkBoxmeeting.setOnCheckedChangeListener(new myCheckBoxChnageClicker());
        chkBoxleave.setOnCheckedChangeListener(new myCheckBoxChnageClicker());

    }

    class myCheckBoxChnageClicker implements CheckBox.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton buttonView,
                                     boolean isChecked) {
            // TODO Auto-generated method stub

            // Toast.makeText(CheckBoxCheckedDemo.this, &quot;Checked =&gt; &quot;+isChecked, Toast.LENGTH_SHORT).show();

            if (isChecked) {
                if (buttonView == chkBoxDCR) {
                    Remove_leave();
                    //showTextNotification("chkBoxDCR");
                }

                if(buttonView==chkBoxcme) {
                    Remove_leave();
                    //showTextNotification("chkBoxcme");
                }

                if(buttonView==chkBoxcamp) {
                    Remove_leave();
                  //  showTextNotification("chkBoxcamp");
                }

                if(buttonView==chkBoxmeeting) {
                    Remove_leave();
                   // showTextNotification("chkBoxmeeting");
                }

                if(buttonView==chkBoxleave) {
                    Remove_work();
                  //  showTextNotification("chkBoxleave");
                }
            }
        }
    }

    public void showTextNotification(String msgToDisplay) {
        //Toast.makeText(this, msgToDisplay, Toast.LENGTH_SHORT).show();
    }

    public  void Remove_leave()
    {
        chkBoxleave = (CheckBox) findViewById(R.id.leave);
        chkBoxleave.setChecked(false);
    }

    public  void Remove_work()
    {
        chkBoxDCR = (CheckBox) findViewById(R.id.dcr);
        chkBoxcme = (CheckBox) findViewById(R.id.cme);
        chkBoxcamp = (CheckBox) findViewById(R.id.camp);
        chkBoxmeeting = (CheckBox) findViewById(R.id.meeting);
        chkBoxDCR.setChecked(false);
        chkBoxcme.setChecked(false);
        chkBoxcamp.setChecked(false);
        chkBoxmeeting.setChecked(false);
    }
}

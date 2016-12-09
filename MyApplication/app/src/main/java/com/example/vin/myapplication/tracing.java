package com.example.vin.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.util.Log;
import java.util.List;
import android.content.Context;
import android.net.ConnectivityManager;

import android.widget.Toast;


public class tracing extends AppCompatActivity {

    private TextView mcc;
    private TextView mnc;
    private TextView cellid;
    private TextView lac;
    private Button btn_refresh;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracing);

        try {
            mcc = (TextView) findViewById(R.id.mcc);
            mnc = (TextView) findViewById(R.id.mnc);
            cellid = (TextView) findViewById(R.id.cellid);
            lac = (TextView) findViewById(R.id.lac);


            TelephonyManager tt = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
            GsmCellLocation cellLocation = (GsmCellLocation) tt.getCellLocation();

            String networkop = tt.getNetworkOperator();
            mcc.setText("mcc/Countrycode: " + networkop.substring(0, 3));
            mnc.setText("mnc/Networkcode: " + networkop.substring(3));

            cellid.setText("cellid: " + cellLocation.getCid());
            lac.setText("LocationCode: " + cellLocation.getLac());

            /*  TelephonyManager tt = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
            CdmaCellLocation cellLocation = ()tt.getCellLocation();

            String networkop = tt.getNetworkOperator();
            mcc.setText("mcc/Countrycode: " + networkop.substring(0, 3));
            mnc.setText("mnc/Networkcode: " + networkop.substring(3));

            cellid.setText("cellid: " + cellLocation.getCid());
            lac.setText("LocationCode: " + cellLocation.getLac());*/
         /*   TelephonyManager tt = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

           // Toast.makeText(getApplicationContext(), tt.getNetworkOperatorName(),Toast.LENGTH_LONG).show();
            Log.d("getNetworkOperatorName",tt.getNetworkOperatorName());
            Log.d("getDeviceId",tt.getDeviceId());

            Log.d("getNetworkOperator",tt.getNetworkOperator());
            Log.d("getNetworkType", ( String.valueOf( tt.getNetworkType())));
            Log.d("getSimCountryIso",tt.getSimCountryIso());
            Log.d("getSimOperator",tt.getSimOperator());
            Log.d("getSimOperatorName",tt.getSimOperatorName());
            Log.d("getSimSerialNumber",tt.getSimSerialNumber());

            Log.d("getDeviceId", (tt.getDeviceId()));

            Log.d("getSimOperator",tt.getSimOperator());
            Log.d("getSimOperatorName",tt.getSimOperatorName());
            Log.d("getSimSerialNumber",tt.getSimSerialNumber());
            Log.d("getSimCountryIso",tt.getSimCountryIso());
            Log.d("getSimOperator",tt.getSimOperator());
            Log.d("getSimOperatorName",tt.getSimOperatorName());
            Log.d("getSimSerialNumber",tt.getSimSerialNumber());*/

            Button btn_refresh = (Button) findViewById(R.id.btn_refresh);
            btn_refresh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showinfo();
                }
            });

        }
        catch (Exception ex)
        {
            Toast.makeText(getApplicationContext(), ex.getMessage(),Toast.LENGTH_LONG).show();
        }


    }
   public  void showinfo()
   {
       TelephonyManager tt = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
       EditText multitext = (EditText) findViewById(R.id.multitext);
       multitext.setText("NetworkType: "+ ( String.valueOf( tt.getNetworkType()))+ "\r\n"+
               "NetworkOperatorName: "+ tt.getNetworkOperatorName()+ "\r\n"+
               "DeviceId: "+ tt.getDeviceId()+ "\r\n"+
               "NetworkOperator: "+ tt.getNetworkOperator()+ "\r\n"+
               "NetworkType: "+ ( String.valueOf( tt.getNetworkType()))+ "\r\n"+
               "SimCountryIso: "+tt.getSimCountryIso()+ "\r\n"+
               "SimOperator: "+tt.getSimOperator()+ "\r\n"+
               "SimOperatorName: "+tt.getSimOperatorName()+ "\r\n"+
               "SimSerialNumber: "+tt.getSimSerialNumber()+ "\r\n"+
               "DeviceId: "+tt.getDeviceId()+ "\r\n"+
               "SimSerialNumber: "+tt.getSimSerialNumber()

       );

      // multitext.setText("hi"+ "\r\n"+"hii"+ "\r\n"+"hee");

   }




}

package com.example.vin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
//import com.google.gso

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class State_show extends AppCompatActivity {

    ListView listView;
    Button btnGetAll,btnAdd;
    RestService restService;
    TextView student_Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_states);
        restService = new RestService();

      refreshScreen();
    }

    private void refreshScreen(){

        //Call to server to grab list of student records. this is a asyn
        restService.getService().getState(new Callback<List<State>>() {
            @Override
            public void success(List<State> state, Response response) {
                ListView lv = (ListView) findViewById(R.id.listView);

                State_CustomAdapter customAdapter = new State_CustomAdapter(State_show.this, R.layout.view_states_adapter, state);

            /*    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        student_Id = (TextView) view.findViewById(R.id.student_Id);
                        String studentId = student_Id.getText().toString();
                        Intent objIndent = new Intent(getApplicationContext(), StudentDetail.class);
                        objIndent.putExtra("student_Id", Integer.parseInt(studentId));
                        startActivity(objIndent);
                    }
                });*/
                lv.setAdapter(customAdapter);
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(State_show.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();
            }
        });


    }
}

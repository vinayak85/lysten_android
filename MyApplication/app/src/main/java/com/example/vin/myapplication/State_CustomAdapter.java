package com.example.vin.myapplication;

/**
 * Created by vin on 09-11-2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
public class State_CustomAdapter extends ArrayAdapter<State> {

    public State_CustomAdapter(Context context, int resource, List<State> state) {
        super(context, resource, state);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.view_states_adapter, parent, false);
        }

        State state = getItem(position);

        if (state != null) {
            TextView tvStudentId = (TextView) v.findViewById(R.id.Statename);
            TextView tvStudentName = (TextView) v.findViewById(R.id.Statecode);
            tvStudentId.setText(state.getStatename());
            tvStudentName.setText(state.getStatecode());
        }

        return v;
    }
}

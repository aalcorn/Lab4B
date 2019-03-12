package com.example.lab4b;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class MtoKmConverter extends Fragment implements View.OnClickListener {

    private TextView m;
    private TextView k;


    public MtoKmConverter() {
        // Required empty public constructor
    }

    public void onClick(View v) {

        double milesValue;
        double kmValue;

        if (!m.getText().toString().equals("")) {
            milesValue = Double.parseDouble(m.getText().toString());
        } else {
            milesValue = 0;
        }

        if (!k.getText().toString().equals("")) {
            kmValue = Double.parseDouble(k.getText().toString());
        } else {
            kmValue = 0;
        }

        if (milesValue == 0 && kmValue != 0) {
            //convert kmValue to miles and store in m
            milesValue = kmValue / 1.609;
            m.setText(Double.toString(milesValue));
        } else if (milesValue != 0 && kmValue == 0) {
            //convert milesValue to km and store in k
            kmValue = milesValue * 1.609;
            k.setText(Double.toString(kmValue));
        } else if (milesValue != 0 && kmValue != 0) {
            //convert milesValue to km and store in k
            kmValue = milesValue * 1.609;
            k.setText(Double.toString(kmValue));
        } else {
            //do nothing
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mtokm, container, false);

        Button b = (Button)v.findViewById(R.id.convertB); // Acquire button reference
        b.setOnClickListener(this);                     // Set event handler
        m = (TextView)v.findViewById(R.id.milesText);
        k = (TextView)v.findViewById(R.id.kmText);

        return v;

    }


}

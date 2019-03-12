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
public class FtoCconverter extends Fragment implements View.OnClickListener{

    private TextView f;
    private TextView c;

    public FtoCconverter() {
        // Required empty public constructor
    }

    public void onClick(View v) {

        double fahValue;
        double celValue;

        if(!f.getText().toString().equals("")) {
            fahValue = Double.parseDouble(f.getText().toString());
        }
        else{
            fahValue = 0;
        }

        if(!c.getText().toString().equals("")) {
            celValue = Double.parseDouble(c.getText().toString());
        }
        else{
            celValue = 0;
        }

        if(fahValue == 0 && celValue != 0) {
            //convert celValue to fah and store in f
            f.setText(Double.toString((celValue * 9/5) + 32));
        }
        else if(fahValue != 0 && celValue == 0) {
            //convert fahValue to cel and store in c
            c.setText(Double.toString((fahValue - 32) * 5/9));
        }
        else if(fahValue != 0 && celValue != 0) {
            //convert fahValue to cel and store in c
            c.setText(Double.toString((fahValue - 32) * 5/9));
        }
        else {
            //do nothing
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ftoc, container, false);

        Button b = (Button)v.findViewById(R.id.convertButton); // Acquire button reference
        b.setOnClickListener(this);                     // Set event handler
        f = (TextView)v.findViewById(R.id.fahrenheitText);
        c = (TextView)v.findViewById(R.id.celsiusText);

        return v;

    }

}

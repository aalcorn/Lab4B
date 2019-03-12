package com.example.lab4b;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.NumberFormat;
import android.widget.*;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class TipCalculator extends Fragment implements View.OnClickListener{

    private TextView t;
    private TextView u;
    private TextView n;
    private TextView p;

    public TipCalculator() {
        // Required empty public constructor
    }


    public void onClick(View v) {


        double totalBill = Double.parseDouble(t.getText().toString());
        double tipPercentage = Double.parseDouble(u.getText().toString());
        double numberOfPeople = Double.parseDouble(n.getText().toString());
        double totalPerPerson;

        totalPerPerson = (totalBill + (totalBill * tipPercentage/100)) / numberOfPeople;

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        p.setText(defaultFormat.format(totalPerPerson));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tip_calculator, container, false);

        Button b = (Button)v.findViewById(R.id.calcButton); // Acquire button reference
        b.setOnClickListener(this);                     // Set event handler

        t = (TextView)v.findViewById((R.id.totalBillText));
        u = (TextView)v.findViewById(R.id.tipText);
        n = (TextView)v.findViewById(R.id.numberOfPeopleText);
        p = (TextView)v.findViewById(R.id.totalPerPersonText);



        return v;

    }

}

package com.myapps.salmans.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double currency=0;
    double dollars=0;
    public void convert(View view){
        //create the edit text variable
        EditText cText = (EditText) findViewById(R.id.editText);
        //String newstr = Integer.parseInt(cText.getText().toString());

        //parse the edit text string to an integer
        currency = Double.parseDouble(cText.getText().toString());

        //perform the necessary calculations
        dollars =currency*1.3;

        //convert to string
        String strDollars=String.format("%.2f",dollars);

        Toast.makeText(this, cText.getText()+" pounds is "+strDollars+" dollars", Toast.LENGTH_SHORT).show();


        Log.i("Amount in dollars is",strDollars);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

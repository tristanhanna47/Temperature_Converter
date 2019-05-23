package com.example.t00584336.temperatureconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText temp;
    Spinner spinner1, spinner2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp = (EditText) findViewById(R.id.TempEdit);
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        result = findViewById(R.id.result);

    }

    public void Convert(View view) {
        double value = new Double(temp.getText().toString());


        //if spinner1 is set to Fahrenheit and spinner2 is set to Celsius use temp converter method
        if (spinner1.getSelectedItem().toString().equals("Fahrenheit") && spinner2.getSelectedItem().toString().equals("Celsius")) {
            value = (value-32)* 5/9;
            result.setText(value + "°C");


        }

        //if spinner1 is set to Celsius and spinner2 is set to Fahrenheit use temp converter method
        if (spinner1.getSelectedItem().toString().equals("Celsius") && spinner2.getSelectedItem().toString().equals("Fahrenheit")) {
            value = 32 + value * 9/5;
            result.setText(value + "°F");

        }

        //if spinner1 is set to Celsius and spinner2 is set to Celsius display "No conversion needed" message
        if (spinner1.getSelectedItem().toString().equals("Celsius") && spinner2.getSelectedItem().toString().equals("Celsius")) {
            Toast.makeText(this, "No conversion needed" , Toast.LENGTH_LONG).show();
        }


        //if spinner1 is set to Fahrenheit and spinner2 is set to Fahrenheit display "No conversion needed" message
        if (spinner1.getSelectedItem().toString().equals("Fahrenheit") && spinner2.getSelectedItem().toString().equals("Fahrenheit")) {
            Toast.makeText(this, "No conversion needed", Toast.LENGTH_LONG).show();
        }
    }
}










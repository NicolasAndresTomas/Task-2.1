////////// SIT305 Mobile Application Development
//////// Task: Pass Task 2.1
////// Student Name: Nicolas Andres Tomas
//// Student ID: 221351413
// Updated On: 5-04-2023
package com.example.conversionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //LENGTH CONVERSION VARIABLES
    EditText txtvalue1;
    Spinner spfrom1,spto1;
    Button btn1;

    //WEIGHT CONVERSION VARIABLES
    EditText txtvalue2;
    Spinner spfrom2,spto2;
    Button btn2;

    //TEMPERATURE CONVERSION VARIABLES
    EditText txtvalue3;
    Spinner spfrom3,spto3;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INITIALIZING LENGTH CONVERSION VARIABLES
        txtvalue1 = findViewById(R.id.txtvalue1);
        spfrom1 = findViewById(R.id.spfrom1);
        spto1 = findViewById(R.id.spto1);
        btn1 = findViewById(R.id.btn1);

        //INITIALIZING WEIGHT CONVERSION VARIABLES
        txtvalue2 = findViewById(R.id.txtvalue2);
        spfrom2 = findViewById(R.id.spfrom2);
        spto2 = findViewById(R.id.spto2);
        btn2 = findViewById(R.id.btn2);

        //INITIALIZING TEMPERATURE CONVERSION VARIABLES
        txtvalue3 = findViewById(R.id.txtvalue3);
        spfrom3 = findViewById(R.id.spfrom3);
        spto3 = findViewById(R.id.spto3);
        btn3 = findViewById(R.id.btn3);

        //ARRAY ADAPTER FOR LENGTH CONVERSION
        String[] from1 = {"Inch"};
        ArrayAdapter lengthAdapter1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from1);
        spfrom1.setAdapter(lengthAdapter1);
        String[] to1 = {"Centimeter"};
        ArrayAdapter lengthAdapter2 = new ArrayAdapter<String>(this,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to1);
        spto1.setAdapter(lengthAdapter2);

        //ARRAY ADAPTER FOR WEIGHT CONVERSION
        String[] from2 = {"Pound"};
        ArrayAdapter weightAdapter1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from2);
        spfrom2.setAdapter(weightAdapter1);
        String[] to2 = {"Ounce"};
        ArrayAdapter weightAdapter2 = new ArrayAdapter<String>(this,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to2);
        spto2.setAdapter(weightAdapter2);

        //ARRAY ADAPTER FOR TEMPERATURE CONVERSION
        String[] from3 = {"Kelvin"};
        ArrayAdapter temperatureAdapter1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from3);
        spfrom3.setAdapter(temperatureAdapter1);
        String[] to3 = {"Celsius"};
        ArrayAdapter temperatureAdapter2 = new ArrayAdapter<String>(this,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to3);
        spto3.setAdapter(temperatureAdapter2);

        //BUTTON ONCLICK LISTENER FOR LENGTH CONVERSION
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double total;
                Double value = Double.parseDouble(txtvalue1.getText().toString());

                if (spfrom1.getSelectedItem().toString() == "Inch" && spto1.getSelectedItem().toString() == "Centimeter")
                {
                    total = value * 2.54;
                    Toast.makeText(getApplicationContext(),total.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });

        //BUTTON ONCLICK LISTENER FOR WEIGHT CONVERSION
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double total;
                Double value = Double.parseDouble(txtvalue2.getText().toString());

                if (spfrom2.getSelectedItem().toString() == "Pound" && spto2.getSelectedItem().toString() == "Ounce")
                {
                    total = value * 16;
                    Toast.makeText(getApplicationContext(),total.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });

        //BUTTON ONCLICK LISTENER FOR TEMPERATURE CONVERSION
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double total;
                Double value = Double.parseDouble(txtvalue2.getText().toString());

                if (spfrom3.getSelectedItem().toString() == "Kelvin" && spto3.getSelectedItem().toString() == "Celsius")
                {
                    total = value - 273.15;
                    Toast.makeText(getApplicationContext(),total.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });}
}
// SIT305 Mobile Application Development
//// Pass Task 2.1
////// Student Name: Nicolas Andres Tomas
//////// Student ID: 221351413
////////// Updated On: 5-04-2023
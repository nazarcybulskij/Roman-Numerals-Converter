package com.example.nazarko.romainconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText roman;
    EditText arabic1;
    EditText arabic2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roman = (EditText)findViewById(R.id.roman);
        roman.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
        arabic1 = (EditText)findViewById(R.id.arabic1);
        arabic2 = (EditText)findViewById(R.id.arabic2);
        findViewById(R.id.convert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arabic1.setText(""+new Converter4().toNumerical(roman.getText().toString()));
                arabic2.setText(""+new Converter5().toNumerical(roman.getText().toString()));
            }
        });
    }
}

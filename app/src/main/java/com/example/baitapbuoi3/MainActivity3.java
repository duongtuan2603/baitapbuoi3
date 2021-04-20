package com.example.baitapbuoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView result;
    Button plus;
    Button minus;
    Button multiple;
    Button divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Anhxa();
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.valueOf(Integer.parseInt(number1.getText().toString())+Integer.parseInt(number2.getText().toString())));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.valueOf(Integer.parseInt(number1.getText().toString())-Integer.parseInt(number2.getText().toString())));
            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.valueOf(Integer.parseInt(number1.getText().toString())*Integer.parseInt(number2.getText().toString())));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.valueOf(Integer.parseInt(number1.getText().toString())/Integer.parseInt(number2.getText().toString())));
            }
        });
    }

    private void Anhxa() {
        number1 = findViewById(R.id.edtnumber1);
        number2 = findViewById(R.id.edtnumber2);
        result = findViewById(R.id.txtresult);
        plus = findViewById(R.id.btnplus);
        minus = findViewById(R.id.btnminus);
        multiple = findViewById(R.id.btnmultiple);
        divide = findViewById(R.id.btndivide);
    }

}
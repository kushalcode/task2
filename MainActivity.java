package com.example.celsius_to_fahrenheit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText e1;
TextView tv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        tv=findViewById(R.id.tv);
    }

    public void fah(View view)
    {
        double num= Double.parseDouble(e1.getText().toString());
        double res=num*(1.8)+32;
        tv.setText(""+res);
    }
}

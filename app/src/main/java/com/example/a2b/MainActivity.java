package com.example.a2b;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button oblicz = findViewById(R.id.oblicz);
        oblicz.setOnClickListener((View view) -> {
            EditText editText = findViewById(R.id.waga);
            EditText editText2 = findViewById(R.id.wzrost);
            double waga = Double.parseDouble(editText.getText().toString());
            double wzrost = Double.parseDouble(editText2.getText().toString());
            double bmi = waga/((wzrost/100)*(wzrost/100));
            TextView wynik = findViewById(R.id.textView3);
            wynik.setText(Double.toString(bmi));

        });
    }
}
package com.example.learning;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_screen);

        Button studentForm = findViewById(R.id.Form);
        Button calculator = findViewById(R.id.Calculator);
    }

    public void gotoForm(View view) {
        Intent form = new Intent(this, FormActivity.class);
        startActivity(form);
    }

    public void gotoCalculator(View view) {
        System.out.println("is it working?");
        Intent calc = new Intent(this, CalculatorActivity.class);
        startActivity(calc);
    }
}
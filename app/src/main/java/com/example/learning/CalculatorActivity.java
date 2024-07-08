package com.example.learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculatorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
    }

    public void gotoHome(View view) {
        Intent back = new Intent(this, HomeScreen.class);
        startActivity(back);
    }
    public void addNum(View view) {
    }

    public void subNum(View view) {
    }

    public void divNum(View view) {
    }

    public void mulNum(View view) {
    }

}
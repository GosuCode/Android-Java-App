package com.example.learning;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_menu, menu);
        return true;
    }

    public void gotoForm(View view) {
        Intent form = new Intent(this, FormActivity.class);
        startActivity(form);
    }

    public void gotoCalculator(View view) {
        Intent calc = new Intent(this, CalculatorActivity.class);
        startActivity(calc);
    }

    public void fragment(View view) {
        Intent frag = new Intent(this, FragmentActivity.class);
        startActivity(frag);
    }
    public void dropdown(View view) {
        Intent frag = new Intent(this, DropdownMenuActivity.class);
        startActivity(frag);
    }
}
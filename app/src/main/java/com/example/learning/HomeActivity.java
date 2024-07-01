package com.example.learning;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        EditText username = findViewById(R.id.Username);
        EditText email = findViewById(R.id.Email);
        Button btnShow = findViewById(R.id.ShowData2);
        TextView allData = findViewById(R.id.see_data_here);
//        RadioGroup gender = findViewById(R.id.gender);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                allData.setText("Username :" + username.getText() + "\nEmail :" + email.getText());
            }
        });
    }
    public void showDataInNextScreen(View view) {
        EditText username = findViewById(R.id.Username);
        EditText email = findViewById(R.id.Email);
        String name = username.getText().toString();
        String mail = email.getText().toString();

        Intent intent = new Intent(this, ShowData.class);
        intent.putExtra("name", name);
        intent.putExtra("email", mail);
        startActivity(intent);
    }
}
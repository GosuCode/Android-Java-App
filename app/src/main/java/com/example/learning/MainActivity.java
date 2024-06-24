package com.example.learning;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showButton = findViewById(R.id.ShowData);
        EditText fullName = findViewById(R.id.FullName);
        EditText email = findViewById(R.id.Email);
        EditText username = findViewById(R.id.Username);
        TextView showData = findViewById(R.id.YourData);

        showButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                showData.setText("Username: " + username.getText() + "\nEmail: " + email.getText());
            }
        });
    }
}
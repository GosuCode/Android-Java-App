package com.example.learning;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DialogActivity extends AppCompatActivity {
    Button btn;
    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dialog);

        btn = findViewById(R.id.dialogBtn);
        addBtn = findViewById(R.id.dialogSum);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
                builder.setTitle("Alert Dialog");
                builder.setMessage("Alert Dialog Message");
                builder.setNegativeButton("NO", null);
                builder.setPositiveButton("YES", null);
//                builder.setCancelable(true);

                // Create and show the alert dialog
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
                builder.setTitle("Addition");
                builder.setCancelable(true);

                LayoutInflater li = getLayoutInflater();
                View dialogView = li.inflate(R.layout.custom_dialog, null);
                builder.setView(dialogView);

                EditText number1 = dialogView.findViewById(R.id.number1);
                EditText number2 = dialogView.findViewById(R.id.number2);
                Button calculateSum = dialogView.findViewById(R.id.calculateSum);
                TextView sumResult = dialogView.findViewById(R.id.sumResult);

                calculateSum.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String num1Str = number1.getText().toString();
                        String num2Str = number2.getText().toString();

                        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
                            int num1 = Integer.parseInt(num1Str);
                            int num2 = Integer.parseInt(num2Str);
                            int sum = num1 + num2;
                            sumResult.setText("Result: " + sum);
                            sumResult.setVisibility(View.VISIBLE);
                        }
                    }
                });
//                addBtn = findViewById(R.id.dialogSum);

                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}
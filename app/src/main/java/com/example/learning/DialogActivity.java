package com.example.learning;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DialogActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dialog);

        btn = findViewById(R.id.dialogBtn);

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
    }
}
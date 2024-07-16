package com.example.learning;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fragment);

        Button tab1 = findViewById(R.id.tab1);
        Button tab2 = findViewById(R.id.tab2);

        tab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager frg = getSupportFragmentManager();
                FragmentTransaction frt = frg.beginTransaction();
                frt.replace(R.id.fragmentContainerView, new FirstFragment());
                frt.commit();
            }
        });

        tab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager frm = getSupportFragmentManager();
                FragmentTransaction frt = frm.beginTransaction();
                frt.replace(R.id.fragmentContainerView, new SecondFragment());
                frt.commit();
            }
        });
    }
}
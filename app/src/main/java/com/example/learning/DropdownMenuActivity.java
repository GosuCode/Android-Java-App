package com.example.learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DropdownMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dropdown_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int selectedID=item.getItemId();
        if(selectedID==R.id.item1){
            Intent i =   new Intent(getApplicationContext(), FormActivity.class);
            startActivity(i) ;
            return true;
        } else if (selectedID==R.id.item2) {
            Intent i =   new Intent(getApplicationContext(),CalculatorActivity.class);
            startActivity(i) ;
            return true;
        } else{
            Intent i =   new Intent(getApplicationContext(),FragmentActivity.class);
            startActivity(i) ;
            return true;
        }
        //return super.onOptionsItemSelected(item);
    }
}
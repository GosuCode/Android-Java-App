package com.example.learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {

    private CheckBox checkBox1;
    private CheckBox checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form);

        EditText username = findViewById(R.id.Username);
        EditText email = findViewById(R.id.Email);
        Button btnShow = findViewById(R.id.ShowData2);
        TextView allData = findViewById(R.id.see_data_here);
        RadioGroup radioGroup = findViewById(R.id.select_gender);
        checkBox1 =findViewById(R.id.sports);
        checkBox2 =findViewById(R.id.gaming);


        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gender = "";
                int selectedId = radioGroup.getCheckedRadioButtonId();
                System.out.println("radio data"+selectedId);
                if(selectedId != -1){
                    RadioButton selectedGender = findViewById(selectedId);
                    gender = selectedGender.getText().toString();
                }
                StringBuilder hobbies = new StringBuilder();
                if(checkBox1.isChecked()){
                    hobbies.append("Sports");
                }
                if (checkBox2.isChecked()){
                    hobbies.append("Gaming");
                }
                if (hobbies.length() == 0){
                    hobbies.append("No Life No Hobbies");
                }
                String msg = "Username :" + username.getText() + "\nEmail :" + email.getText() + "\nGender" + gender + "\nHobbies: " + hobbies;;
                allData.setText(msg);
            }
        });
    }
    public void showDataInNextScreen(View view) {
        EditText username = findViewById(R.id.Username);
        EditText email = findViewById(R.id.Email);
        RadioGroup radioGroup = findViewById(R.id.select_gender);
        String name = username.getText().toString();
        String mail = email.getText().toString();

        String gender="";
        int selectedId = radioGroup.getCheckedRadioButtonId();

        if(selectedId != -1){
            RadioButton selectedGender = findViewById(selectedId);
            gender = selectedGender.getText().toString();
        }

        StringBuilder hobbies = new StringBuilder();
        if (checkBox1.isChecked()) {
            hobbies.append("Sports ");
        }
        if (checkBox2.isChecked()) {
            hobbies.append("Gaming ");
        }
        if (hobbies.length() == 0) {
            hobbies.append("None");
        }
        System.out.println("Selected Gender"+gender);

        Intent intent = new Intent(this, ShowData.class);
        intent.putExtra("Name", name);
        intent.putExtra("Mail", mail);
        intent.putExtra("Gender", gender);
        intent.putExtra("Hobbies", hobbies.toString());
        startActivity(intent);
    }

    public void gotoHome(View view) {
        Intent goBack = new Intent(this, HomeScreen.class);
        startActivity(goBack);
    }
}
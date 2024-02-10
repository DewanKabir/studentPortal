package com.example.studentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class sign_up extends AppCompatActivity {
    EditText user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        user=findViewById(R.id.editTextText2);
        Intent i= getIntent();
        String a=i.getStringExtra("username");
        String phone=i.getStringExtra("phone");

        user.setText(a);
    }
}
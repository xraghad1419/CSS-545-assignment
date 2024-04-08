package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signIn extends AppCompatActivity {

    EditText editTextPhone;
    EditText editTextTextPersonName;
    Button blogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        editTextPhone = findViewById(R.id.editTextPhone);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        blogin = findViewById(R.id.blogIn);

        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signIn.this, menu.class);
                startActivity(intent);
            }
        });
    }
}
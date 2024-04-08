package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class details_page3 extends AppCompatActivity {

    Button GoBill3;
    ImageButton back3;
    Spinner drinkSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page3);
        GoBill3 = (Button) findViewById(R.id.GoBill3);
        back3 = (ImageButton) findViewById(R.id.backMenu3);
        drinkSpinner = findViewById(R.id.drinkSpinner);

        GoBill3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(details_page3.this, BillPage.class);
                startActivity(intent);
            }
        });
    }

    public void numItem(View view){

        int numberOfDrinks = Integer.parseInt(drinkSpinner.getSelectedItem().toString());
    }

    public void backMenu(View view) {
        Intent back3= new Intent(details_page3.this,menu.class);
        startActivity(back3);

    }
}
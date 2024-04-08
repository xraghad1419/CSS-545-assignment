package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class details_page4 extends AppCompatActivity {
    Button GoBill4;
    ImageButton back4;
    Spinner drinkSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page4);

        GoBill4 = (Button) findViewById(R.id.GoBill4);
        back4 = (ImageButton) findViewById(R.id.backMenu);
        drinkSpinner = findViewById(R.id.drinkSpinner);

        GoBill4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(details_page4.this, BillPage.class);
                startActivity(intent);
            }
        });
    }



    public void numItem(View view){

        int numberOfDrinks = Integer.parseInt(drinkSpinner.getSelectedItem().toString());
    }

    public void backMenu(View view) {
        Intent back= new Intent(details_page4.this,menu.class);
        startActivity(back);

    }

}
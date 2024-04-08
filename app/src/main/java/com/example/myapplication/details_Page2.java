package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class details_Page2 extends AppCompatActivity {

    Button GoBill2;
    ImageButton back2;
    Spinner drinkSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page2);

        GoBill2 = (Button) findViewById(R.id.GoBill2);
        back2 = (ImageButton) findViewById(R.id.backMenu2);
        drinkSpinner = findViewById(R.id.drinkSpinner);

        drinkSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Retrieve the selected item (number of drinks)
                String selectedNumber = parent.getItemAtPosition(position).toString();
                Toast.makeText(details_Page2.this, "Selected: " + selectedNumber, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        GoBill2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(details_Page2.this, BillPage.class);
                startActivity(intent);
            }
        });
    }



    public void numItem(View view){

        int numberOfDrinks = Integer.parseInt(drinkSpinner.getSelectedItem().toString());
    }

    public void backMenu(View view) {
        Intent back2= new Intent(details_Page2.this,menu.class);
        startActivity(back2);

    }
}
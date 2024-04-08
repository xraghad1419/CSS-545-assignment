package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.time.Instant;

public class detailsPage extends AppCompatActivity {

    Button GoBill;
    ImageButton back;
    Spinner drinkSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);

        GoBill = (Button) findViewById(R.id.GoBill);
        back = (ImageButton) findViewById(R.id.backMenu);
        drinkSpinner = findViewById(R.id.drinkSpinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.drink_numbers, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        drinkSpinner.setAdapter(adapter);

        drinkSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Retrieve the selected item (number of drinks)
                String selectedNumber = parent.getItemAtPosition(position).toString();
                Toast.makeText(detailsPage.this, "Selected: " + selectedNumber, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        GoBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detailsPage.this, BillPage.class);
                startActivity(intent);
            }
        });

    }

    public void backMenu(View view) {
        Intent back= new Intent(detailsPage.this,menu.class);
        startActivity(back);

    }
}
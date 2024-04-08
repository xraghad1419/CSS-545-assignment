package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class menu extends AppCompatActivity {
    CardView C1, C2, C3, C4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        C1 = findViewById(R.id.coffee1);
        C2 = findViewById(R.id.coffee2);
        C3 = findViewById(R.id.coffee3);
        C4 = findViewById(R.id.coffee4);




C1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(menu.this, detailsPage.class);
        startActivity(intent);
    }
});

        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, details_Page2.class);
                startActivity(intent);
            }
        });

        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, details_page3.class);
                startActivity(intent);
            }
        });


        C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, details_page4.class);
                startActivity(intent);
            }
        });

    }


}
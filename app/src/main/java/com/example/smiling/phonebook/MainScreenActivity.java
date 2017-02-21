package com.example.smiling.phonebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;


public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        LinearLayout phoneBookLinearLayout = (LinearLayout) findViewById(R.id.phone_book);
        phoneBookLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreenActivity.this, PhoneBookActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout myEventsLinearLayout = (LinearLayout) findViewById(R.id.my_events);
        myEventsLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreenActivity.this, PhoneBookActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout myDayBookLinearLayout = (LinearLayout) findViewById(R.id.my_day_book);
        myDayBookLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreenActivity.this, PhoneBookActivity.class);
                startActivity(intent);
            }
        });

    }
}

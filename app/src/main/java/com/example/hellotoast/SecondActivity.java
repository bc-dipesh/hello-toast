package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView totalCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // get the intent and receive data from the intent
        Intent intent = getIntent();
        int count = intent.getIntExtra("count", 0);

        // get the view and set the data received from the intent
        totalCount = findViewById(R.id.total_count);
        totalCount.setText(count + "");
    }
}
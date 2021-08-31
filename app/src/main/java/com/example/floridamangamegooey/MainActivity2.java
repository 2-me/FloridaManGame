package com.example.floridamangamegooey;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            // Get the Intent that started this activity and extract the string
            Intent intent = getIntent();
            String message = intent.getStringExtra(MainActivity.text);

            // Capture the layout's TextView and set the string as its text
            TextView textView = findViewById(R.id.displayText);
            textView.setText(message);


        }
    }


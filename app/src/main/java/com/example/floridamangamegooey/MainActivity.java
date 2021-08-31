package com.example.floridamangamegooey;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView appTitle;
    static String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appTitle = findViewById(R.id.displayText);

    }
        public void sendMessage(View view) {
            Intent intent = new Intent(this, MainActivity2.class);
            TextView editText = (findViewById(R.id.enterText));
            String message = editText.getText().toString();
            intent.putExtra(text, message);
            startActivity(intent);


        }
    }

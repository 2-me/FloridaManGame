package com.example.floridamangamegooey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.floridamangamegooey.data.model.UserDatabase;

public class LoginScreen extends AppCompatActivity {
    TextView inputUsername;
    TextView inputPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        inputUsername = findViewById(R.id.loginUsername);
        inputPassword = findViewById(R.id.loginPassword);

    }

    public void loginPress(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String username = inputUsername.getText().toString();
        String password = inputPassword.getText().toString();
        Toast toast = Toast.makeText(getApplicationContext(), "Incorrect Username/Password", Toast.LENGTH_LONG);
        if (UserDatabase.validateUser(username,password)) {
            startActivity(intent);
        } else {
            toast.show();
        }
    }

    public void loadScreen(View view) { //To have buttons able to call a method, the param must be (View view)
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

}
package ViewControllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.floridamangamegooey.R;

import java.io.IOException;

import Data.UserDatabase;

public class LoginScreen extends AppCompatActivity {
    TextView inputUsername;
    TextView inputPassword;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        inputUsername = findViewById(R.id.loginUsername);
        inputPassword = findViewById(R.id.loginPassword);
        loginButton = findViewById(R.id.loginButton);
        UserDatabase.loadPlayers();
    }

    public void loginPress(View view) {
        Intent intent = new Intent(this, Game.class);
        String username = inputUsername.getText().toString();
        String password = inputPassword.getText().toString();
        Toast toast = Toast.makeText(getApplicationContext(), "Incorrect Username/Password", Toast.LENGTH_LONG);
        if (UserDatabase.validateUser(username,password)) {
            startActivity(intent);
        } else {
            toast.show();
        }
    }

}
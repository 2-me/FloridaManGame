package ViewControllers;

import Data.Player;
import Data.UserDatabase;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.floridamangamegooey.R;

import java.io.IOException;

public class GameOver extends AppCompatActivity {
    TextView overUsername;
    TextView overFullName;
    TextView overScore;
    TextView overBestScore;
    Button signOutButton;
    Button newGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        overUsername = findViewById(R.id.overUsername);
        overFullName = findViewById(R.id.overFullName);
        overScore = findViewById(R.id.overScore);
        overBestScore = findViewById(R.id.overBestScore);
        signOutButton = findViewById(R.id.signOutButton);
        newGameButton = findViewById(R.id.newGameButton);
        Player p1 = UserDatabase.getPlayer(LoginScreen.playerName);
        try {
            p1.savePlayer(getApplicationContext(),p1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
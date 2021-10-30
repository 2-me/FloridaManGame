package ViewControllers;

import Data.Headline;
import Data.MyHeadlineBank;
import Data.Player;
import Data.Session;
import Data.UserDatabase;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
        if (Session.getCorrect() > p1.getBestScore())
            p1.setBestScore(Session.getCorrect());
        try {
            p1.savePlayer(getApplicationContext(),p1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        overUsername.setText(p1.getUsername());
        overFullName.setText(p1.getFullName());
        overScore.setText(String.valueOf(Session.getCorrect()));
        overBestScore.setText(String.valueOf(p1.getBestScore()));
    }

    public void signOut(View view) {
        Intent toLogin = new Intent(this, LoginScreen.class);
        MyHeadlineBank.emptyGameHeadlines();
        Headline.resetHeadlineCount();
        Session.resetSessionData();
        startActivity(toLogin);
    }

    public void newGame(View view) {
        Intent newGame = new Intent(this, Game.class);
        MyHeadlineBank.emptyGameHeadlines();
        Headline.resetHeadlineCount();
        Session.resetSessionData();
        startActivity(newGame);
    }

}
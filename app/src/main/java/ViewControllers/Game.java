package ViewControllers;

import Data.Headline;
import Data.MyHeadlineBank;
import Data.UserDatabase;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.floridamangamegooey.R;

    public class Game extends AppCompatActivity {
        int index = 0;
        TextView correctNumber;
        TextView wrongNumber;
        TextView headlineView;
        TextView questionNum;
        TextView totalNumberQues;
        TextView bestScore;
        Button ansButtonTL;
        Button ansButtonTR;
        Button ansButtonBL;
        Button ansButtonBR;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_game_screen);
            correctNumber = findViewById(R.id.correctNumber);
            wrongNumber = findViewById(R.id.wrongNumber);
            headlineView = findViewById(R.id.headlineView);
            questionNum = findViewById(R.id.questionNum);
            totalNumberQues = findViewById(R.id.totalNumberQues);
            bestScore = findViewById(R.id.bestScore);
            ansButtonTL = findViewById(R.id.ansButtonTL);
            ansButtonTR = findViewById(R.id.ansButtonTR);
            ansButtonBL = findViewById(R.id.ansButtonBL);
            ansButtonBR = findViewById(R.id.ansButtonBR);
            MyHeadlineBank.loadHeadlines();
            // Get the Intent that started this activity and extract the string
            //  Intent intent = getIntent();
            //  String message = intent.getStringExtra(GameOver.text);

            // Capture the layout's TextView and set the string as its text
            //  TextView textView = findViewById(R.id.gameTitle);
            //  textView.setText(message);
        }

        public void nextQuestion(){
            index++;
        }

        public void answerClicked(View view) {
            Toast toastCorrect = Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT);
            Toast toastWrong = Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT);

        }

    }



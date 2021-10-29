package ViewControllers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.floridamangamegooey.R;

import Data.Headline;
import Data.MyHeadlineBank;
import Data.Session;
import androidx.appcompat.app.AppCompatActivity;

public class Game extends AppCompatActivity {
        int questionNumber = 1;
        Headline currentHeadline;
        String temp;
        TextView correctNumber;
        TextView wrongNumber;
        TextView headlineView;
        TextView questionNum;
        TextView totalNumberQues;
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
            ansButtonTL = findViewById(R.id.ansButtonTL);
            ansButtonTR = findViewById(R.id.ansButtonTR);
            ansButtonBL = findViewById(R.id.ansButtonBL);
            ansButtonBR = findViewById(R.id.ansButtonBR);
            MyHeadlineBank.loadHeadlines();
            totalNumberQues.setText(String.valueOf(MyHeadlineBank.numOfHeadlines()));
            currentHeadline = MyHeadlineBank.gameHeadlines.get(questionNumber);
            currentHeadline.optionsShuffle();
            updateScreen();
        }

        public void loadNextHeadline(){
           if(!MyHeadlineBank.outOfHeadlines(questionNumber)) {
               Intent intent = new Intent(this, GameOver.class);
               startActivity(intent);
           }
           else {
               questionNumber++;
               currentHeadline = MyHeadlineBank.gameHeadlines.get(questionNumber);
               currentHeadline.optionsShuffle();
           }
        }

            //check if the stuff is valid
            //loadNextHeadline
            //updateScreen(currentHeadline)

        public void updateScreen() {
            ansButtonTL.setText(currentHeadline.options.remove(0));
            ansButtonTR.setText(currentHeadline.options.remove(0));
            ansButtonBL.setText(currentHeadline.options.remove(0));
            ansButtonBR.setText(currentHeadline.options.remove(0));
            headlineView.setText(currentHeadline.getStory());
            correctNumber.setText(String.valueOf(Session.getCorrect()));
            wrongNumber.setText(String.valueOf(Session.getWrong()));
            questionNum.setText(String.valueOf(questionNumber));
            currentHeadline.emptyOptions();
        }



        public void answerClicked(View view) {
            Toast toastCorrect = Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT);
            Toast toastWrong = Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT);
            Button buttonClicked = (Button) view;
            if ((buttonClicked.getText().toString()).equals(currentHeadline.keyword)) {
                Session.addCorrect();
                toastCorrect.show();
            }
            else {
                toastWrong.show();
                Session.addWrong();
            } //answer checked
            loadNextHeadline();
            updateScreen();
        }

    }



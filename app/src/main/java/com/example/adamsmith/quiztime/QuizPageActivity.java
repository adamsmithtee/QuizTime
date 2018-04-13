package com.example.adamsmith.quiztime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizPageActivity extends AppCompatActivity {


    //ques 1
    private RadioButton option1_one;
   //ques 2
    private RadioButton option2_three;
   //ques 3
    private RadioButton option3_two;
    //ques 4
    private RadioButton option4_four;
    //ques 5
    private EditText option5_answer;
    //ques 6
    private RadioButton option6_one;
    //ques 7
    private RadioButton option7_three;
    //ques 8
    private EditText option8_answer;
    //ques 9
    private RadioButton option9_one;
    //ques 10
    private RadioButton option10_four;
    //ques 11
    private EditText option11_answer;
    //ques 12
    private CheckBox option12_one;
    private CheckBox option12_two;
    private CheckBox option12_three;
    private CheckBox option12_four;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        Button submitAnswer = (Button) findViewById(R.id.sbmitAnswer);
        //adding Onclick Listener to the View id (numbers)
        submitAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                int score1;
                int score2;
                int score3;
                int score4;
                int score5;
                int score6;
                int score7;
                int score8;
                int score9;
                int score10;
                int score11;
                int score12;
                int totalScore;


                //ques 1
                Boolean ans1;
                option1_one = (RadioButton)findViewById(R.id.option1_0ne);
                ans1 = option1_one.isChecked();
                if (ans1) {
                    score1 = 1;
                } else {
                    score1 = 0;
                }

                //ques 2
                Boolean ans2;
                option2_three = (RadioButton) findViewById(R.id.option2_three);
                ans2 = option2_three.isChecked();
                if (ans2) {
                    score2 = 1;
                } else {
                    score2 = 0;
                }

                //ques 3
                Boolean ans3;
                option3_two = (RadioButton) findViewById(R.id.option3_two);
                ans3 = option3_two.isChecked();
                if (ans3) {
                    score3 = 1;
                } else {
                    score3 = 0;
                }


                //ques 4
                Boolean ans4;
                option4_four = (RadioButton) findViewById(R.id.option4_four);
                ans4 = option4_four.isChecked();
                if (ans4) {
                    score4 = 1;
                } else {
                    score4 = 0;
                }

                //ques 5
                String ans5;
                option5_answer = (EditText) findViewById(R.id.option5_answer);
                ans5 = option5_answer.getText().toString();
                if (ans5.equalsIgnoreCase("anti-clockwise")) {
                    score5 = 1;
                } else if (ans5.equalsIgnoreCase("anti clockwise")) {
                    score5 = 1;
                } else if (ans5.equalsIgnoreCase("anticlockwise")) {
                    score5 = 1;
                } else {
                    score5 = 0;
                }

                //ques 6
                Boolean ans6;
                option6_one = (RadioButton) findViewById(R.id.option6_One);
                ans6 = option6_one.isChecked();
                if (ans6) {
                    score6 = 1;
                } else {
                    score6 = 0;
                }

                //ques 7
                Boolean ans7;
                option7_three = (RadioButton) findViewById(R.id.option7_three);
                ans7 = option7_three.isChecked();
                if (ans7) {
                    score7 = 1;
                } else {
                    score7 = 0;
                }

                //ques 8
                String ans8;
                option8_answer = (EditText) findViewById(R.id.option8_answer);
                ans8 = option8_answer.getText().toString();
                if (ans8.equalsIgnoreCase("flux")) {
                    score8 = 1;
                } else {
                    score8 = 0;
                }

                //ques 9
                Boolean ans9;
                option9_one = (RadioButton) findViewById(R.id.option9_One);
                ans9 = option9_one.isChecked();
                if (ans9) {
                    score9 = 1;
                } else {
                    score9 = 0;
                }

                //ques 10
                Boolean ans10;
                option10_four = (RadioButton) findViewById(R.id.option10_four);
                ans10 = option10_four.isChecked();
                if (ans10) {
                    score10 = 1;
                } else {
                    score10 = 0;
                }

                //ques 11
                String ans11;
                option11_answer = (EditText) findViewById(R.id.option11_answer);
                ans11 = option11_answer.getText().toString();
                if (ans11.equalsIgnoreCase("charge")) {
                    score11 = 1;
                } else {
                    score11 = 0;
                }

                //ques 12
                boolean ans12_one, ans12_two, ans12_three, ans12_four;
                option12_one = (CheckBox) findViewById(R.id.option12_One);
                option12_two = (CheckBox) findViewById(R.id.option12_two);
                option12_three = (CheckBox) findViewById(R.id.option12_three);
                option12_four = (CheckBox) findViewById(R.id.option12_four);

                ans12_one = option12_one.isChecked();
                ans12_two = option12_two.isChecked();
                ans12_three = option12_three.isChecked();
                ans12_four = option12_four.isChecked();


                if (ans12_one && !ans12_two && ans12_three && !ans12_four) {
                    score12 = 1;
                } else {
                    score12 = 0;
                }

                totalScore = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10 + score11 + score12;
                Intent result = new Intent(QuizPageActivity.this, resultPage.class);
                result.putExtra("total", totalScore);

                startActivity(result);


                if (totalScore == 12) {
                    //Toast.makeText(QuizPageActivity.this, "you are a genius, you score " + totalScore + "/12", Toast.LENGTH_SHORT).show();
                    //creating an intents that links to the numberActivity
                 //   Intent result1 = new Intent(QuizPageActivity.this, resultPage.class);
                  //  result1.putExtra("totali", totalScore);
                    result.putExtra("well", "cool");
                   // startActivity(result1);

               /** } else if (totalScore >= 7 && < 11)) {
                   //Toast.makeText(QuizPageActivity.this, "you tried, you score " + totalScore + "/12", Toast.LENGTH_SHORT).show();
                    //displayResult (totalScore) ;
                   Intent result1 = new Intent(QuizPageActivity.this, resultPage.class);
                    result1.putExtra("totalii", totalScore);
                   startActivity(result1); **/
                } /**else  {
                   // Toast.makeText(QuizPageActivity.this, "poor, you score " + totalScore + "/12", Toast.LENGTH_SHORT).show();
                    //displayResult (totalScore) ;
                    Intent result3 = new Intent(QuizPageActivity.this, resultPage.class);
                    result3.putExtra("totaliii", totalScore);
                    startActivity(result3);
                }**/
            }

        });
    }

//private String results(String testTaker) {
//    Intent receiver = getIntent();
//    testTaker = receiver.getStringExtra("username");
//        String message = "Name" + testTaker;
//    return message;
//    }



/**
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }**/
}

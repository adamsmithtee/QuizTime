package com.example.adamsmith.quiztime;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ChooseSubjectActivity extends AppCompatActivity {

    String testTaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_subject);

        Intent receiver = getIntent();
        testTaker = receiver.getStringExtra("username");
       displayText("Welcome:  " + testTaker);

        TextView mathematics = (TextView) findViewById(R.id.maths);
        //adding Onclick Listener to the View id (numbers)

        mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creating an intents that links to the numberActivity
                Intent mathematics = new Intent(ChooseSubjectActivity.this, QuizPageActivity.class);
                startActivity(mathematics);
            }
        });

        TextView myTextView =(TextView)findViewById(R.id.subject);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),"fonts/Sofia-Regular.otf");
        myTextView.setTypeface(custom_font);

    }
//@Override
//   public void onBackPressed() {
//        Intent mainActivityIntent = new Intent(this, MainActivity.class);
//        startActivity(mainActivityIntent);
//    }




    /**@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_subject, menu);
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
    }
}**/

    public void displayText (String name){
        TextView textview=(TextView) findViewById(R.id.view_name);
        textview.setText(name);
        textview.setTextSize(25);


    }
}
  /**  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizlist);
        Intent receiver = getIntent();
        testTaker = receiver.getStringExtra("username");
        TextView testTakerText = (TextView) findViewById(R.id.test_taker);
        String welcomeMessage = "Welcome " + testTaker;
        testTakerText.setText(welcomeMessage);
        setListener();**/
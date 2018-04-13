package com.example.adamsmith.quiztime;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.Closeable;

public class resultPage extends AppCompatActivity {
    SharedPreferences pref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        pref = getSharedPreferences("username", MODE_PRIVATE);

        String name = pref.getString("user1", "");
        displayName("Name: "+name);



     Intent receiver = getIntent();
        int results = receiver.getIntExtra("total", 0);
        displayResult(" you scored  " + results + " /12");

/**
  Intent receiver2 = getIntent();
        int results2 = receiver2.getIntExtra("totali", 0);
        displayResult("you tried \n you scored" + results2);
**/
 /**Intent receiver3 = getIntent();
        int results3 = receiver3.getIntExtra("totaliii", 0);
        displayResult("poor \n you scored" + results3);
**/

       /** Intent namereceiver = getIntent();
       String testTaker= namereceiver.getStringExtra("username");
        displayName(testTaker); **/


        Button start = (Button)findViewById(R.id.restart_text_view);

        //adding Onclick Listener to the View id (numbers)

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creating an intents that links to the numberActivity
                Intent start = new Intent(resultPage.this,NameActivity.class);
                startActivity(start);
            }
        });

    }
    @Override
   public void onBackPressed() {
       Intent mainActivityIntent = new Intent(this, MainActivity.class);
       startActivity(mainActivityIntent);
        finish();

    }


    /** @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result_page, menu);
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
     * @param message **/


    public void displayResult (String message){
        TextView result = (TextView)findViewById(R.id.result);
        result.setText("" + message);
    }

    public void displayName(String message){
        TextView result = (TextView)findViewById(R.id.name_result);
        result.setText("" + message);
    }
}







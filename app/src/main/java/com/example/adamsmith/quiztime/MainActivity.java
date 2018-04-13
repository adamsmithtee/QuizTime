package com.example.adamsmith.quiztime;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button)findViewById(R.id.button_start);

        //adding Onclick Listener to the View id (numbers)

       start.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               //creating an intents that links to the numberActivity
               Intent start = new Intent(MainActivity.this, NameActivity.class);
               startActivity(start);
           }
       });
        TextView myTextView =(TextView)findViewById(R.id.quiz);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),"fonts/Sofia-Regular.otf");
        myTextView.setTypeface(custom_font);
    }
    //for going back
//    public void onBackPressed() {
//        Intent mainActivityIntent = new Intent(this, MainActivity.class);
//        startActivity(mainActivityIntent);
//    }
    public void onBackPressed(){
        new AlertDialog.Builder(this)
           .setTitle("Really exit")
                .setMessage("are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.super.onBackPressed();
                    }
                }).create().show();

    }


   /** @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

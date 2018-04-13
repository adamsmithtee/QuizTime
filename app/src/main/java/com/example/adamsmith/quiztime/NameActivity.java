package com.example.adamsmith.quiztime;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NameActivity extends AppCompatActivity {


String name;
    SharedPreferences pref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        pref = getSharedPreferences("username", MODE_PRIVATE);


       Button next = (Button)findViewById(R.id.button_next);

        //adding Onclick Listener to the View id (numbers)
       next.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               EditText nameField = (EditText) findViewById(R.id.name_field);
               name = nameField.getText().toString();

              SharedPreferences.Editor editor = pref.edit();
               editor.putString("user1",name);
               editor.commit();

               //if (Integer.parseInt(name) == 0) {
               //this is to check whether the user filled in his/her name
//                   if (name.matches("")){
//                    Toast.makeText(NameActivity.this, "please fill in your name", Toast.LENGTH_SHORT).show();

               //another way of putting it
               if (TextUtils.isEmpty(name)) {
                   //nameField.setError("please fill in your Name");
                   Toast.makeText(NameActivity.this, "please fill in your name", Toast.LENGTH_SHORT).show();

               } else {
                   //creating an intents that links to the numberActivity
                   Intent next = new Intent(NameActivity.this, ChooseSubjectActivity.class);
                   next.putExtra("username", name);
                   startActivity(next);
               }


           }


       });

        Intent next2 = new Intent(NameActivity.this, resultPage.class);
        next2.putExtra("username", name);

        TextView myTextView =(TextView)findViewById(R.id.quiz);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),"fonts/Sofia-Regular.otf");
        myTextView.setTypeface(custom_font);

    }

    //onBackPressed for going back
//    public void onBackPressed() {
//        Intent mainActivityIntent = new Intent(this, MainActivity.class);
//        startActivity(mainActivityIntent);
//    }

    /**@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_name, menu);
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




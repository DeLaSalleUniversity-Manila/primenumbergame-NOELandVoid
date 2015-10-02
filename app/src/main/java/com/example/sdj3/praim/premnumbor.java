package com.example.sdj3.praim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import java.util.*;

public class premnumbor extends AppCompatActivity {
    private int number;
    private int score;
    private boolean answer;

    public void onClickPrime(View view){
        answer = true;
        if (!(isPrime(number) ^ answer)) {
            score++;
            Toast.makeText(this, "Correct! You've been doing your homework!", Toast.LENGTH_SHORT).show();
        } else {
            score = score - 5;
            Toast.makeText(this, "Incorrect! Keep on studying!", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Previous number: "+ number,Toast.LENGTH_SHORT).show();
        TextView tv = (TextView) findViewById(R.id.textViewScore);
        tv.setText("Your score is " + score + ".");
        Random r = new Random();
        number = 2 + r.nextInt(1000);  // Random numbers: 2 - 999
        tv = (TextView) findViewById(R.id.textViewNumber);
        tv.setText("" + number); // String
    }

    public void onClickComposite(View view){
        answer = false;
        if (!(isPrime(number) ^ answer)) {
            score++;
            Toast.makeText(this, "Correct! You've been doing your homework!", Toast.LENGTH_SHORT).show();
        } else {
            score = score - 5;
            Toast.makeText(this, "Incorrect! Keep on studying!", Toast.LENGTH_SHORT).show();
        }
        TextView tv = (TextView) findViewById(R.id.textViewScore);
        tv.setText("Your score is " + score + ".");
        Random r = new Random();
        number = 2 + r.nextInt(1000);  // Random numbers: 2 - 999
        tv = (TextView) findViewById(R.id.textViewNumber);
        tv.setText("" + number); // String
    }


    private boolean isPrime(int value){
        Boolean temp = true;
        for (int divisor = 2; divisor < Math.sqrt(value); divisor++) {
            if (value % divisor == 0) {
                temp = false;
            }
        }
        return temp;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premnumbor);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_premnumbor, menu);
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
}

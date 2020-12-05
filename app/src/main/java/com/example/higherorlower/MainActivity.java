package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomnumber;

    public void generaterandomnumber()
    {
        Random rand = new Random();
        randomnumber = rand.nextInt(20) + 1 ;
    }

    public void guess(View view)
    {
        Log.i("Info", Integer.toString(randomnumber));
        EditText editText = findViewById(R.id.editTextNumber);
        int n = Integer.parseInt(editText.getText().toString());
        String message="";
        if(n<randomnumber)
        {
            message = "Go Higher";
        }
        else if(n>randomnumber)
        {
            message = "Go Lower";
        }
        else
        {
            message = "You guessed Correct!! Try Again";
            generaterandomnumber();
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generaterandomnumber();
    }
}
package com.example.android.android;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup firstRadioGroup;
    CheckBox choice1;
    CheckBox choice2;
    CheckBox choice3;
    CheckBox choice4;
    CheckBox choice5;
    CheckBox choice6;
    CheckBox choice7;
    CheckBox choice8;
    Button Selection1;
    Button Selection2;
    Button Selection3;
    Button Selection4;
    private String Name;
    TextView mScore;
    private int numScore = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstRadioGroup = (RadioGroup) findViewById(R.id.RadioGroup);
        choice1 = (CheckBox) findViewById(R.id.checkBox1);
        choice2 = (CheckBox) findViewById(R.id.checkBox2);
        choice3 = (CheckBox) findViewById(R.id.checkBox4);
        choice4 = (CheckBox) findViewById(R.id.checkBox5);
        choice5 = (CheckBox) findViewById(R.id.checkBox7);
        choice6 = (CheckBox) findViewById(R.id.checkBox8);
        choice7 = (CheckBox) findViewById(R.id.checkBox10);
        choice8 = (CheckBox) findViewById(R.id.checkBox11);
        mScore = (TextView) findViewById(R.id.Scor);
        Selection1 = (Button) findViewById(R.id.button);
        Selection2 = (Button) findViewById(R.id.button2);
        Selection3 = (Button) findViewById(R.id.button3);
        Selection4 = (Button) findViewById(R.id.button4);
        Selection1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice1.isChecked()) {

                        Toast.makeText(MainActivity.this, "Good Jop +point"+ numScore++, Toast.LENGTH_LONG).show();
                }
                if (choice2.isChecked()) {
                    Toast.makeText(MainActivity.this, "Try again", Toast.LENGTH_LONG).show();
                }
            }
        });
        Selection2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice3.isChecked()) {
                    Toast.makeText(MainActivity.this, "Nice Work+ point" + numScore++, Toast.LENGTH_LONG).show();
                }
                if (choice4.isChecked()) {
                    Toast.makeText(MainActivity.this, "Try again", Toast.LENGTH_LONG).show();
                }
            }
        });
        Selection3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice5.isChecked()) {
                    Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_LONG).show();
                }
                if (choice6.isChecked()) {
                    Toast.makeText(MainActivity.this, "Great +point" + numScore++, Toast.LENGTH_LONG).show();
                }
            }
        });
        Selection4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice7.isChecked()) {

                    Toast.makeText(MainActivity.this, "Good jop +point" + numScore++, Toast.LENGTH_LONG).show();
                }
                if (choice8.isChecked()) {
                    Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void done(View view) {
        EditText firstName = (EditText) findViewById(R.id.EditText);
        Name = firstName.getText().toString();
        TextView done = (TextView) findViewById(R.id.button5);

        System.out.println("Welcome" + done.getText() + Name);
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
    }
}
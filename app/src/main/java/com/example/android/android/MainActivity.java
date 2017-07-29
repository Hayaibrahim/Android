package com.example.android.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private CheckBox Linearlayout;
    private CheckBox RelativeLayout;
    private Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);


        }


        final Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (Linearlayout.isChecked()) {
                    Toast.makeText(MainActivity.this, "LinearLayout is correct", Toast.LENGTH_LONG).show();

                    if
                            (RelativeLayout.isChecked()) {
                        Toast.makeText(MainActivity.this, "RelativeLayout is correct", Toast.LENGTH_LONG).show();

                    }


                }
            }
        });


    }
}



       /* CheckBox Linearlayout = (CheckBox) findViewById(R.id.checkBox);
        CheckBox RelativeLayout = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox RecyclerView = (CheckBox) findViewById(R.id.checkBox3);
        Linearlayout.setOnClickListener((View.OnClickListener) this);
    }

}
  /*  private void test(View v) {
        if (Linearlayout.isChecked()) {
            Toast.makeText(MainActivity.this, "Linearlayout is incorrect", Toast.LENGTH_LONG).show();
        }
        if (RelativeLayout.isChecked()) {
            Toast.makeText(MainActivity.this, "RelativeLayout is correct", Toast.LENGTH_LONG).show();
        }

        if (RecyclerView.isChecked()) {
            Toast.makeText(MainActivity.this, "RecyclerViewis incorrect", Toast.LENGTH_LONG).show();
        }
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs

        // Find second menu item TextView and print the text to the logs

        // Find third menu item TextView and print the text to the logs

    */

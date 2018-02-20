package net.michelison.sumcalculator;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    // define instance variables for widgets

    private EditText editTextNum1;
    private EditText editTextNum2;
    private TextView sumOf;
    private Button sumButton;

    //define shared preferences object
    private SharedPreferences savedValues;

    //variables to be saved
    private int num1 = 0;
    private int num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get references to widgets
        editTextNum1 = (EditText) findViewById(R.id.editTextNum1);
        editTextNum2 = (EditText) findViewById(R.id.editTextNum2);
        sumButton = (Button) findViewById(R.id.sumButton);
        sumOf = (TextView) findViewById(R.id.sumOf);

        // set the listener
        // sumButton.setOnClickListener((View.OnClickListener) this);

        // get SharedPreferences object
        savedValues = getSharedPreferences("SavedValues", MODE_PRIVATE);

    }
    // create method to sendMessage using intent to new activity

    /*public void calculateAndDisplay(){
        // parsing strings to floats
        num1 = Integer.parseInt(editTextNum1.getText().toString());
        num2 = Integer.parseInt(editTextNum2.getText().toString());

        int sum = num1 + num2;

        sumOf.setText(String.valueOf(sum));
    } */

    public void sendMessage(View v) {
        // The intent has the Sending activity and the recieving activity as parameters
        Intent intent = new Intent(MainActivity.this, ShowSumActivity.class);
        // getting the values
        num1 = Integer.parseInt(editTextNum1.getText().toString());
        num2 = Integer.parseInt(editTextNum2.getText().toString());
        // sending the values

        intent.putExtra("num1", num1);
        intent.putExtra("num2", num2);

        startActivity(intent);

    }

    /*
    @Override
    public void onClick(View v) {
        calculateAndDisplay();
    }
    */
}

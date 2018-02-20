package net.michelison.sumcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ShowSumActivity extends Activity {

    // create instance variable
    private TextView showSum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_sum);

        // get reference to the textView
        showSum = (TextView) findViewById(R.id.showSum);

        // Bundle is necessary to grab variables and values from the MainActivity
        Bundle bundle = getIntent().getExtras();
        int num1 = bundle.getInt("num1");
        int num2 = bundle.getInt("num2");

        int sum = num1 + num2;

        //output the sum
        showSum.setText(Integer.toString(sum));
    }
}

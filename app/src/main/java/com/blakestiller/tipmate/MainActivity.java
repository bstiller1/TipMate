package com.blakestiller.tipmate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Locate and Identify Button
        Button button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                // Locate and Identify Controls
                EditText editText = (EditText) findViewById(R.id.editText);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                EditText editText3 = (EditText) findViewById(R.id.editText3);
                EditText editText4 = (EditText) findViewById(R.id.editText4);
                // Convert User Input to Double
                double amount = Double.parseDouble(editText.getText().toString());
                double guests = Double.parseDouble(editText2.getText().toString());
                double tip = Double.parseDouble(editText3.getText().toString());
                // Do Calculation
                Float total = (float) (Math.round((amount + tip) / guests));
                // Format to Decimal for Money
                DecimalFormat totalEach = new DecimalFormat("$0.00");
                // Construct StringBuilder Object for final output
                StringBuilder sb = new StringBuilder();
                // Format for USD
                Formatter formatter = new Formatter(sb, Locale.US);
                // Display final amount to user
                editText4.setText(totalEach.format(total));
    }
    });

}
}
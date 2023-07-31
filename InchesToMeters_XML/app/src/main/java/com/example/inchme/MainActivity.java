package com.example.inchme;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView resultTextView;
    Button calculateButton;
    EditText inchesEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setClickListener();
    }

    private void setClickListener() {
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isEmpty();
            }
        });
    }

    private void isEmpty() {
        if (inchesEditText.getText().length() == 0) {
            Toast.makeText(this, "INSERT INCHES!1!1", Toast.LENGTH_LONG).show();
        } else {
            displayResult(convert());
        }
    }

    private void displayResult(double r) {
        DecimalFormat df = new DecimalFormat("0.00");
        String result = df.format(r);

        resultTextView.setText(result + " M");
    }

    private double convert() {
        double inches = Double.parseDouble(inchesEditText.getText().toString());
        return inches * 0.0254;

    }

    private void findViews() {
        inchesEditText = findViewById(R.id.inchesEditTextID);
        calculateButton = findViewById(R.id.calculateButtonID);
        resultTextView = findViewById(R.id.resultTextViewID);
    }
}
package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private RadioButton radioFemale;
    private RadioButton radioMale;
    private TextView textViewResult;
    private EditText feetEditText;
    private EditText inchesEditText;
    private EditText weightEditText;
    private EditText ageEditText;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        calculateButtonSetOnClickListener();

    }

    private void displayResult(double bmi) {
        String bmiText;
        int age = Integer.parseInt(ageEditText.getText().toString());

        if (age < 18) {
            bmiText = checkGender();
        } else {
            if (bmi < 18.5) {
                bmiText = "- Underweight";
            } else if (bmi > 25) {
                bmiText = "- Overweight";
            } else {
                bmiText = "- Healthy";
            }
        }
        String bmiT = String.valueOf(bmi);
        String fullTextResult = bmiT + bmiText;
        textViewResult.setText(fullTextResult);
    }

    private String checkGender() {
        String bmiText;
        if (radioMale.isChecked()) {
            bmiText = "- Male,UnderAge(Cant Use)";
        } else if (radioFemale.isChecked()) {
            bmiText = "- Female,UnderAge(Cant Use)";
        } else {
            bmiText = "- No Gender,UnderAge(Cant Use)";
        }

        return bmiText;
    }

    private double calculateBMI() {
        double weight = Double.parseDouble(weightEditText.getText().toString());
        int feet = Integer.parseInt(feetEditText.getText().toString());
        int inches = Integer.parseInt(inchesEditText.getText().toString());


        //feet+inches
        int totalInches = (feet * 12) + inches;
        //inches to meter2
        double totalInMeters = totalInches * 0.0254;
        //calculate BMI = KG/M^2
        double BMI = weight / (totalInMeters * totalInMeters);
        String formattedBMI = String.format("%.2f", BMI);
        return Double.parseDouble(formattedBMI);
        //set textResult
        //textViewResult.setText("Your BMI:" + formattedBMI);

    }

    private void findViews() {
        radioFemale = findViewById(R.id.radio_button_female);
        radioMale = findViewById(R.id.radio_button_male);
        textViewResult = findViewById(R.id.text_view_result);
        feetEditText = findViewById(R.id.edit_text_feet);
        inchesEditText = findViewById(R.id.edit_text_inches);
        weightEditText = findViewById(R.id.edit_text_weight);
        ageEditText = findViewById(R.id.edit_text_age);
        calculateButton = findViewById(R.id.button_calculate);
    }

    private void calculateButtonSetOnClickListener() {
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculateBMI();
                displayResult(calculateBMI());
            }
        });
    }


}
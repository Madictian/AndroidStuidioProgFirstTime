package com.example.myapplication;

import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText givenNumberOne;
    private EditText givenNumberTwo;
    private TextView showResult;
    private Button calculate;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        givenNumberOne = (EditText) findViewById(R.id.givenNumberOne);
        givenNumberOne.setText("");

        givenNumberTwo = (EditText) findViewById(R.id.givenNumberTwo);
        givenNumberTwo.setText("");

        showResult = (TextView) findViewById(R.id.showResult);

        calculate = findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first = Double.parseDouble(givenNumberOne.getText().toString());
                double second = Double.parseDouble(givenNumberTwo.getText().toString());
                double result = first * second;
                showResult.setText(String.valueOf(result));
            }
        });


    }

}
package com.jacobconner.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAddButton();
        initSubtractButton();
        initMultiplyButton();
        initDivideButton();
    }

    private void initAddButton() {
        Button addButton = findViewById(R.id.btnAdd);
        addButton.setOnClickListener(view -> {
            EditText editText1 = findViewById(R.id.txtInputVariable1);
            EditText editText2 = findViewById(R.id.txtInputVariable2);
            TextView result = findViewById(R.id.txtAnswer);

            double variable1 = Double.parseDouble(editText1.getText().toString());
            double variable2 = Double.parseDouble(editText2.getText().toString());
            double answer = variable1 + variable2;
            result.setText(String.format("Total: %s", answer));
        });
    }


    private void initSubtractButton(){
        Button subtractButton = findViewById(R.id.btnSubtract);
        subtractButton.setOnClickListener(view -> {
            EditText editText1 = findViewById(R.id.txtInputVariable1);
            EditText editText2 = findViewById(R.id.txtInputVariable2);
            TextView result = findViewById(R.id.txtAnswer);

            double variable1 = Double.parseDouble(editText1.getText().toString());
            double variable2 = Double.parseDouble(editText2.getText().toString());
            double answer = variable1 - variable2;
            result.setText(String.format("Total: %s", answer));
        });
    }

    private void initMultiplyButton(){
        Button multiplyButton = findViewById(R.id.btnMultiply);
        multiplyButton.setOnClickListener(view -> {
            EditText editText1 = findViewById(R.id.txtInputVariable1);
            EditText editText2 = findViewById(R.id.txtInputVariable2);
            TextView result = findViewById(R.id.txtAnswer);

            double variable1 = Double.parseDouble(editText1.getText().toString());
            double variable2 = Double.parseDouble(editText2.getText().toString());
            double answer = variable1 * variable2;
            result.setText(String.format("Total: %s", answer));
        });
    }

    private void initDivideButton(){
        Button divideButton = findViewById(R.id.btnDivide);
        divideButton.setOnClickListener(view -> {
            EditText editText1 = findViewById(R.id.txtInputVariable1);
            EditText editText2 = findViewById(R.id.txtInputVariable2);
            TextView result = findViewById(R.id.txtAnswer);

            double variable1 = Double.parseDouble(editText1.getText().toString());
            double variable2 = Double.parseDouble(editText2.getText().toString());
            double answer = variable1 / variable2;
            result.setText(String.format("Total: %s", answer));
        });
    }

}
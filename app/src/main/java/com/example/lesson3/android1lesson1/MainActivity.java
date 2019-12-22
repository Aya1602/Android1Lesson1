package com.example.lesson3.android1lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button seven;
    Button eight;
    Button nine;
    Button divide;
    Button four;
    Button five;
    Button six;
    Button multiply;
    Button one;
    Button two;
    Button three;
    Button minus;
    Button point;
    Button zero;
    Button equality;
    Button plus;
    Button percent;
    Button deletion;

    double num1;
    double num2;
    String operation;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        divide = findViewById(R.id.divide);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        multiply = findViewById(R.id.multiply);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        minus = findViewById(R.id.minus);
        point = findViewById(R.id.point);
        zero = findViewById(R.id.zero);
        equality = findViewById(R.id.equality);
        plus = findViewById(R.id.plus);
        percent = findViewById(R.id.percent);
        deletion = findViewById(R.id.deletion);

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = findViewById(R.id.result);
                switch (v.getId()){
                    case R.id.seven:
                        result.append(seven.getText().toString());
                        break;
                    case R.id.eight:
                        result.append(eight.getText().toString());
                        break;
                    case R.id.nine:
                        result.append(nine.getText().toString());
                        break;
                    case R.id.divide:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText(" ");
                        operation = "/";
                        break;
                    case R.id.four:
                        result.append(four.getText().toString());
                        break;
                    case R.id.five:
                        result.append(five.getText().toString());
                        break;
                    case R.id.six:
                        result.append(six.getText().toString());
                        break;
                    case R.id.multiply:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText(" ");
                        operation = "*";
                        break;
                    case R.id.one:
                        result.append(one.getText().toString());
                        break;
                    case R.id.two:
                        result.append(two.getText().toString());
                        break; 
                    case R.id.three:
                        result.append(three.getText().toString());
                        break;
                    case R.id.minus:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText(" ");
                        operation = "-";
                        break;
                    case R.id.point:
                        result.append(point.getText().toString());
                        break;
                    case R.id.zero:
                        result.append(zero.getText().toString());
                        break;
                    case R.id.equality:
                        num2 = Double.parseDouble(result.getText().toString());
                        if (operation == "+"){
                            result.setText(Double.toString(num1+num2));
                        }else if (operation == "-"){
                            result.setText(Double.toString(num1-num2));
                        }else if (operation == "*"){
                            result.setText(Double.toString(num1*num2));
                        }else if (operation == "/"){
                            result.setText(Double.toString(num1+num2));
                        }else if (operation == "%"){
                            result.setText(Double.toString((num1*100)/num2));
                        }
                        break;
                    case R.id.plus:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText(" ");
                        operation = "+";
                        break;
                    case R.id.percent:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText(" ");
                        operation = "%";
                        break;
                    case R.id.deletion:
                        result.append(result.getText().toString());
                        result.setText(" ");
                        break;
                }
            }
        };

        seven.setOnClickListener(ocl);
        eight.setOnClickListener(ocl);
        nine.setOnClickListener(ocl);
        divide.setOnClickListener(ocl);
        four.setOnClickListener(ocl);
        five.setOnClickListener(ocl);
        six.setOnClickListener(ocl);
        multiply.setOnClickListener(ocl);
        one.setOnClickListener(ocl);
        two.setOnClickListener(ocl);
        three.setOnClickListener(ocl);
        minus.setOnClickListener(ocl);
        point.setOnClickListener(ocl);
        zero.setOnClickListener(ocl);
        equality.setOnClickListener(ocl);
        plus.setOnClickListener(ocl);
        percent.setOnClickListener(ocl);
        deletion.setOnClickListener(ocl);

    }

}

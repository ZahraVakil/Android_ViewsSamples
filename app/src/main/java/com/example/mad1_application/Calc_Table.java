package com.example.mad1_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calc_Table extends AppCompatActivity implements View.OnClickListener {

        String res, res_plus, res_minus, res_times, res_divide;
        Integer  wswitch;
        Double answer = 0.0;
        TextView result;
        Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, times, divide, clear, equals;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_calc_table);
            initializeVars();
        }

        public void initializeVars(){
            result = (TextView)findViewById(R.id.et_result);
            one = (Button)findViewById(R.id.btn_one);
            two = (Button)findViewById(R.id.btn_two);
            three = (Button)findViewById(R.id.btn_three);
            four = (Button)findViewById(R.id.btn_four);
            five = (Button)findViewById(R.id.btn_five);
            six = (Button)findViewById(R.id.btn_six);
            seven = (Button)findViewById(R.id.btn_seven);
            eight = (Button)findViewById(R.id.btn_eight);
            nine = (Button)findViewById(R.id.btn_nine);
            zero = (Button)findViewById(R.id.btn_zero);
            plus = (Button)findViewById(R.id.btn_plus);
            minus = (Button)findViewById(R.id.btn_minus);
            times = (Button)findViewById(R.id.btn_times);
            divide = (Button)findViewById(R.id.btn_divide);
            equals = (Button)findViewById(R.id.btn_equals);
            clear = (Button)findViewById(R.id.btn_clear);

            one.setOnClickListener(this);
            two.setOnClickListener(this);
            three.setOnClickListener(this);
            four.setOnClickListener(this);
            five.setOnClickListener(this);
            six.setOnClickListener(this);
            seven.setOnClickListener(this);
            eight.setOnClickListener(this);
            nine.setOnClickListener(this);
            zero.setOnClickListener(this);
            plus.setOnClickListener(this);
            minus.setOnClickListener(this);
            clear.setOnClickListener(this);
            times.setOnClickListener(this);
            divide.setOnClickListener(this);
            equals.setOnClickListener(this);

        }


        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            switch (arg0.getId()){
                case R.id.btn_one:
                    res = result.getText().toString()+"1";
                    result.setText(res);
                    break;
                case R.id.btn_two:
                    res = result.getText().toString()+"2";
                    result.setText(res);
                    break;
                case R.id.btn_three:
                    res = result.getText().toString()+"3";
                    result.setText(res);
                    break;
                case R.id.btn_four:
                    res = result.getText().toString()+"4";
                    result.setText(res);
                    break;
                case R.id.btn_five:
                    res = result.getText().toString()+"5";
                    result.setText(res);
                    break;
                case R.id.btn_six:
                    res = result.getText().toString()+"6";
                    result.setText(res);
                    break;
                case R.id.btn_seven:
                    res = result.getText().toString()+"7";
                    result.setText(res);
                    break;
                case R.id.btn_eight:
                    res = result.getText().toString()+"8";
                    result.setText(res);
                    break;
                case R.id.btn_nine:
                    res = result.getText().toString()+"9";
                    result.setText(res);
                    break;
                case R.id.btn_zero:
                    res = result.getText().toString()+"0";
                    result.setText(res);
                    break;
                case R.id.btn_plus:

                    res_plus = result.getText().toString();
                    result.setText("");
                    wswitch = 1;
                    break;
                case R.id.btn_minus:
                    res_minus = result.getText().toString();
                    result.setText("");
                    wswitch = 2;
                    break;
                case R.id.btn_times:
                    res_times = result.getText().toString();
                    result.setText("");
                    wswitch = 3;
                    break;
                case R.id.btn_divide:
                    res_divide = result.getText().toString();
                    result.setText("");
                    wswitch = 4;
                    break;
                case R.id.btn_equals:
                    switch(wswitch){
                        case 1:
                            if(res_plus.matches("") || result.getText().toString().matches("")){
                                result.setText("");
                            }else{
                                answer = Double.parseDouble(res_plus)+Double.parseDouble(result.getText().toString());
                                res = Double.toString(answer);
                                result.setText(res);
                            }
                            break;
                        case 2:
                            if(res_minus.matches("") || result.getText().toString().matches("")){
                                result.setText("");
                            }else{
                                answer = Double.parseDouble(res_minus)-Double.parseDouble(result.getText().toString());
                                res = Double.toString(answer);
                                result.setText(res);
                            }
                            break;
                        case 3:
                            if(res_times.matches("") || result.getText().toString().matches("")){
                                result.setText("");
                            }else{
                                answer = Double.parseDouble(res_times)*Double.parseDouble(result.getText().toString());
                                res = Double.toString(answer);
                                result.setText(res);
                            }
                            break;
                        case 4:
                            if(res_divide.matches("") || result.getText().toString().matches("")){
                                result.setText("");
                            }else{
                                answer = Double.parseDouble(res_divide)/Double.parseDouble(result.getText().toString());
                                res = Double.toString(answer);
                                result.setText(res);
                            }
                            break;
                    }
                    break;
                case R.id.btn_clear:
                    result.setText("");
                    break;
            }
        }

    }
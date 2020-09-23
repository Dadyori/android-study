package kr.teamcadi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 처음으로 입력된 숫자인가?
    boolean isFirstInput = true;
    int num1,num2,resultNum=0;
    String op="+",save;

    TextView tv_input,tv_result;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button plus,minus,multiple,divide,mod, equal, clear, delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result=findViewById(R.id.tv_result);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        plus=(Button)findViewById(R.id.btn_plus);
        minus=(Button)findViewById(R.id.btn_min);
        multiple=(Button)findViewById(R.id.btn_mul);
        divide=(Button)findViewById(R.id.btn_div);
        mod=(Button)findViewById(R.id.btn_mod);
        equal=(Button)findViewById(R.id.btn_equal);
        clear=(Button)findViewById(R.id.btn_clear);
        delete=(Button)findViewById(R.id.btn_del);


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isFirstInput = true;
                resultNum=0;
                op="+";
                tv_result.setText("");
                tv_input.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_result.setText("0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirstInput){
                    tv_result.setText("1");
                    isFirstInput=false;
                }
                else{
                    tv_result.append("1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirstInput){
                    tv_result.setText("2");
                    isFirstInput=false;
                }
                else{
                    tv_result.append("2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirstInput){
                    tv_result.setText("3");
                    isFirstInput=false;
                }
                else{
                    tv_result.append("3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirstInput){
                    tv_result.setText("4");
                    isFirstInput=false;
                }
                else{
                    tv_result.append("4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirstInput){
                    tv_result.setText("5");
                    isFirstInput=false;
                }
                else{
                    tv_result.append("5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirstInput){
                    tv_result.setText("6");
                    isFirstInput=false;
                }
                else{
                    tv_result.append("6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirstInput){
                    tv_result.setText("7");
                    isFirstInput=false;
                }
                else{
                    tv_result.append("7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirstInput){
                    tv_result.setText("8");
                    isFirstInput=false;
                }
                else{
                    tv_result.append("8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirstInput){
                    tv_result.setText("9");
                    isFirstInput=false;
                }
                else{
                    tv_result.append("9");
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(tv_result.getText().toString());
                if(op == "+") {
                    resultNum = resultNum + num1;
                    tv_result.setText("" + resultNum);
                } else if (op == "-") {
                    resultNum = resultNum - num1;
                    tv_result.setText("" + resultNum);
                }else if (op == "*") {
                    resultNum = resultNum * num1;
                    tv_result.setText("" + resultNum);
                }else if (op == "/") {
                    resultNum = resultNum / num1;
                    tv_result.setText("" + resultNum);
                }else if (op == "%") {
                    resultNum = resultNum % num1;
                    tv_result.setText("" + resultNum);
                }

                save = tv_input.getText().toString() + " + ";
                tv_input.setText(save);
                tv_result.setText("");

                op = "+";
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Integer.parseInt(tv_result.getText().toString());
                save = save + tv_result.getText().toString();
                tv_input.setText(save);

                if(op == "+") {
                    resultNum = num1 + num2;
                    tv_result.setText("" + resultNum);
                } else if (op == "-") {
                    resultNum = num1 - num2;
                    tv_result.setText("" + resultNum);
                }else if (op == "*") {
                    resultNum = num1 * num2;
                    tv_result.setText("" + resultNum);
                }else if (op == "/") {
                    resultNum = num1 / num2;
                    tv_result.setText("" + resultNum);
                }else if (op == "%") {
                    resultNum = num1 % num2;
                    tv_result.setText("" + resultNum);
                }
            }
        });



    }
}
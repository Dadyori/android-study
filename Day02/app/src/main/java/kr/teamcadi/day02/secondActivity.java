package kr.teamcadi.day02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText et_num1 = (EditText)findViewById(R.id.et_num1);
        final EditText et_num2 = (EditText)findViewById(R.id.et_num2);
        Button add = (Button)findViewById(R.id.btn_add);
        final TextView tv = (TextView)findViewById(R.id.tv_result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //클릭했을 때 두 개 더한 값
                //art+shift+enter로 final 지정해주어야한다.
                String num1 = et_num1.getText().toString(); //tostring하면 문자열
                String num2 = et_num2.getText().toString();

                int num_1 = Integer.parseInt(num1); //string타입 정수형태로 바꾸어준다
                int num_2 = Integer.parseInt(num2);
                int num_3 = num_1+num_2;
                tv.setText(num_3+""); //string타입만 받아야함 ("") 추가한다
            }
        });

        //ex04)
        Button btn_goto = (Button)findViewById(R.id.btn_goto);
        btn_goto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(secondActivity.this, LayoutActivity.class);
                i.putExtra("key","hi"); //값을 추가해서 던진다
                startActivity(i);
                finish();
            }
        });

    }
}
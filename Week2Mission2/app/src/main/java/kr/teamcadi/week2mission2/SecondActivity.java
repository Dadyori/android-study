package kr.teamcadi.week2mission2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final TextView tv_print =(TextView)findViewById(R.id.tv_print);
        Button btn_check = (Button)findViewById(R.id.btn_check);
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = getIntent();
                String value =j.getStringExtra("key");
                tv_print.setText(value);
            }
        });


    }
}
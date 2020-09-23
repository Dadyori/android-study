package kr.teamcadi.week2mission2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et_value = (EditText)findViewById(R.id.et_input);
        Button btn_go =(Button)findViewById(R.id.btn_go);

        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                String value =et_value.getText().toString();
                i.putExtra("key",value);
                startActivity(i);
                finish();
            }
        });
    }
}
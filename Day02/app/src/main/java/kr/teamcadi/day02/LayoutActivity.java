package kr.teamcadi.day02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        Intent j = getIntent();
        String test = j.getStringExtra("key"); //던진 값 저장하는 부분
        Toast.makeText(getApplicationContext(), test, Toast.LENGTH_LONG).show();

    }
}
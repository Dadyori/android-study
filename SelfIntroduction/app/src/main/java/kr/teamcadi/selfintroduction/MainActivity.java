package kr.teamcadi.selfintroduction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_school = (Button)findViewById(R.id.button);
        Button btn_num = (Button)findViewById(R.id.button2);
        Button btn_name = (Button)findViewById(R.id.button3);
        Button btn_invisible = (Button)findViewById(R.id.button4);
        final ImageView profile = (ImageView)findViewById(R.id.imageView);

        btn_school.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),"가톨릭대학교", Toast.LENGTH_LONG).show();
            }
        });

        btn_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"201820945",Toast.LENGTH_LONG).show();
            }
        });

        btn_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"강다솔",Toast.LENGTH_LONG).show();
            }
        });

        btn_invisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"사진을 나타냅니다",Toast.LENGTH_LONG).show();
                profile.setVisibility(View.VISIBLE);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile.setVisibility(View.INVISIBLE);
            }
        });
    }
}
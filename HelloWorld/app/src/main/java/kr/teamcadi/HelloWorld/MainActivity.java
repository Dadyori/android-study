package kr.teamcadi.HelloWorld;

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

        Button btn1 = (Button)findViewById(R.id.btn_toast);
        final ImageView iv = (ImageView)findViewById(R.id.imageView);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) // 실제 동작을 정의하는 부분
            {
                Toast.makeText(getApplicationContext(),"안녕하세요", Toast.LENGTH_LONG).show();
                iv.setVisibility(View.INVISIBLE); //안보이게 하겠다
            }
        });

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}
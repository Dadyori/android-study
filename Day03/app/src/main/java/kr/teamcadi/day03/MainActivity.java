package kr.teamcadi.day03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_quit = (Button)findViewById(R.id.btn_quit);
        btn_quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //빌드업 객체 생성 (밖에 생성해도 된디_
                //android.app에 있는 것 가져온다
                //override 안에서 정체성 잃었을 때 mainactivity추가해서 this앞에 써준다
                AlertDialog.Builder msgBuilder = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("어플을 종료하시겠습니까?") //타이틀을 셋팅
                        .setMessage("정말 어플을 종료하시겠습니까?")
                        .setPositiveButton("종료", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish(); //종료하는 메서드
                            }
                        }) // 무조건 확인 옵션 설정하는 것 아니다. (위치 기준)
                        .setNegativeButton("앱 계속 실행", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"앱을 계속 실행합니다",Toast.LENGTH_LONG).show();
                            }
                        }); //띄우고자 하는 AlertDialog의 속성을 지정해주는 것을 마무리 한다.

                //Alert dialog와 연결
                AlertDialog msgDlg = msgBuilder.create(); //속성을 지정한 msgBuilder 객체를 바탕으로 새로운 AlertDialog 만들어짐
                //속성 지정된 alert dialog 보여주기
                msgDlg.show();
            }
        });
    }

}
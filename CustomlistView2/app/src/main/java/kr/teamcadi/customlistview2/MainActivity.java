package kr.teamcadi.customlistview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview ;
        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView_Shape);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        // 선언한 순서에 맞게 데이터 넣어준다.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.instagram), "instagram", "this is instagram");

        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.youtube), "youtube", "this is youtube");

        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.facebook), "facebook", "this is facebook");

        // 위에서 생성한 listview에 클릭 이벤트 핸들러 정의.
        // 아이템을 클릭할 때의 이벤트 리스너를 등록함
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            // AdapterView : 카카오톡 화면과 같이 일정한 디자인 패턴을 갖고 있는 항목
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id)
            {
                // Posistion에 위치한 값을 가져와 변수에 저장하여 사용가능
                // 각 위치의 값을 가져와야한다.
                // parent 붙어있는 이유? 껍데기인 원본 리스트뷰에서 가져오므로
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position); //반드시 필요
                Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
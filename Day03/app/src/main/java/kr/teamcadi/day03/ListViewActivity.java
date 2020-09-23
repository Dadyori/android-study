package kr.teamcadi.day03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        final TextView tv_select = (TextView)findViewById(R.id.tv_select);
        //다른것과 동일하게 listview 선언
        ListView listview = (ListView)findViewById(R.id.listview);

        //리스트뷰에 뿌려줄 데이터 선언
        //자바에는 리스트라는 타입이 있다
        List<String> list = new ArrayList<>();

        //데이터 선언부 (껍데기)
        //리스트타입에 데이터 넣을 때 list.add 메서드 사용
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("감자");

        //중간 매개체 역할인 어뎁터 있어야한다.
        //어뎁터는 다양한 타입있다. 기본 어뎁터 == 베이스 어뎁터
        //어뎁터도 스트링 타입으로 받는다
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_multiple_choice,list);


        //리스트와 데이터 사이의 어뎁터 이용하여 묶어주겠다
        listview.setAdapter(adapter);

        //아이템 클릭시 문자열 가져와서 텍스트뷰에 띄어준다 (OnclickListener와 차이있다)
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 항목 클릭 시 어떤 이벤트 발생시킬 것인가?
                // 인자값 adapter, view, int, long < int값 주목해야한다 이것은 각 항목의 인덱스
                // setText 와 getItemAtPosition 이 둘이 하는 역할과 각 어디에서 나온 것인가?
                // 선택 했을 시 문자열 출력하는 것 완성하는 것이 과제.
                tv_select.setText((String)parent.getItemAtPosition(position));
            }
        });
    }
}
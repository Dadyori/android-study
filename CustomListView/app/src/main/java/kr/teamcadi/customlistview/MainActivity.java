package kr.teamcadi.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

// 커스텀 어댑터 클래스 (베이스 어댑터 상속)
class CustomAdapter extends BaseAdapter
{
    // arraylist의 역할? 데이터 세트를 담아서 사용할 데이터 모임(4개 한 세트)
    // 4개 모두 String이라고 인자값 String이라고 넣으면 안된다. 새로운 구조라고 생각한다
    // 4개 관련 새로운 클래스를 인자값 넣어준다.
    ArrayList<CustomItem> items;
    Context context; //context 객체도 하나 만든다.

    //layoutinflater : 부풀리는 장치
    //기존의 레이아웃 깔려있는데 그 위에 새로운 레이아웃으로 덮는다
    LayoutInflater inflater;

    //생성자(새로만드는 객체 초기화) 만들어주어야한다.
    public CustomAdapter(Context context,ArrayList<CustomItem> items)
    {
        //기본 생성자는 인자값 안들어간다
        //초기화 하려고 하면 인자값 넘겨 받아야한다.
        // inflater는 초기화할 필요가 없다. <- 뷰 객체 통해 초기화한다.(getView에서 초기화)
        // 어댑터 객체를 통해 context, items 입력받아서 맵핑시켜준다
        this.items = new ArrayList<>();
        this.items.addAll(items);
        this.context = context;
        //inflater는 서비스 호출만 해주면 된다. 밑의 getView에서 어떻게 사용할지 초기화한다
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        return null;
    }
}
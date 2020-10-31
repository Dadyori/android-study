package kr.teamcadi.customlistview2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>();

    // 기본생성자를 통한 초기화
    // lombok을 이용하여 없앨 수 있다.
    // 받아올 값 없으면 빈칸으로 둔다.
    public ListViewAdapter() {
    }

    // Adapter에 사용되는 데이터의 개수를 Return함 : Input되는 데이터 항목의 개수
    @Override
    public int getCount()
    {
        return listViewItemList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return listViewItemList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        //위치값
        return position;
    }

    // 지정된 Position에 위치한 데이터를 화면에 출력하는데 사용할 View를 불러와 Return함
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null)
        {
            //해당 위치에 껍데기 없을 경우 만들어준다!
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);
            //parent는 listView이다.
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        // convertView는 껍데기에서만 찾겠다!
        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.imageView1);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.textView1);
        TextView descTextView = (TextView) convertView.findViewById(R.id.textView2);

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        // 위치별 저장된 데이터 불러와서 새로운 리스트뷰아이템객체로 만든다.
        ListViewItem listViewItem = listViewItemList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        // 이미지 뷰에다가 인자값으로 받은 파일을 뿌려준다.
        iconImageView.setImageDrawable(listViewItem.getIcon());
        // 입력받은 타이틀값을 불러와서 뿌려준다.
        titleTextView.setText(listViewItem.getTitle());
        descTextView.setText(listViewItem.getDesc());

        return convertView;
    }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem(Drawable icon, String title, String desc)
    {
        //데이터 주기 위해서 인수값으로 데이터 원형 들어온다.
        ListViewItem item = new ListViewItem(); // 하나의 리스트 항목을 하나의 객체로 간주함

        item.setIcon(icon);
        item.setTitle(title);
        item.setDesc(desc);

        listViewItemList.add(item);
    }


}

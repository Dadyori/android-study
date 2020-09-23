package kr.teamcadi.customlistview;

import android.graphics.drawable.Drawable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomItem {
    // 실제 처리되는 데이터들의 원형을 정의한다
    // 여기에 getter, setter 들어간다
    Drawable profile;
    String chatting_name;
    String chatting_contents;
    String last_time;

    //getter, setter (art+insert)
    //lombok 적용해보자
}

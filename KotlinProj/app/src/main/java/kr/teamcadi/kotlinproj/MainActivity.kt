package kr.teamcadi.kotlinproj

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 문자열을 바탕으로 한 데이터 정의
        val LIST_MENU = arrayOf("앱 종료", "날짜", "시간", "네이버")

        // ListView 객체 생성 및 초기화
        var listView : ListView = findViewById(R.id.listview) as ListView

        // Adapter 객체 생성 후 ListView 객체와 DataSet과 연동
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU)
        listView.adapter = adapter  // 주의
                                    // getAdapter & setAdapter 함수 통일 되면서 adapter 연동 방식이 코틀린에서 변경됨


        // setonClicklistener
        listView.setOnItemClickListener { parent, view, position, id ->
            val item=parent.getItemAtPosition(position)
            when (item.toString()){
                "앱 종료" -> endApp()
                "날짜" -> showDate()
                "시간" -> showTime()
                "네이버" -> goNaver()
            }
        }
    }

    // ? Menu 1 - AlertDialog 메시지를 띄운 후 어플 종료시키기
    fun endApp(){
        AlertDialog.Builder(this)
            .setTitle("앱 종료")
            .setMessage("앱을 종료하시겠습니까?")
            .setPositiveButton("종료",DialogInterface.OnClickListener{dialog, which ->
                finish()
            })
            .setNegativeButton("계속 실행",DialogInterface.OnClickListener{dialog, which ->
                Toast.makeText(this,"앱을 계속 실행합니다",Toast.LENGTH_LONG).show()
            }).show()
    }

    // ? Menu 2 - 현재 날짜 및 시간을 입력 받아 Toast 메시지로 출력시키기(DatePickerDialog)-선택하는 dialog
    fun showDate(){
        val cal = Calendar.getInstance()
        var year = cal.get(Calendar.YEAR)
        var month = cal.get(Calendar.MONTH)
        var day = cal.get(Calendar.DAY_OF_MONTH)

        var date_listener = object : DatePickerDialog.OnDateSetListener{
            override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
                Toast.makeText(this@MainActivity,"${year}년 ${month+1}월 ${dayOfMonth}일",Toast.LENGTH_LONG).show()
            }
        }
        var builder = DatePickerDialog(this, date_listener,year,month,day)
        builder.show()
    }

    fun showTime(){
        var time = Calendar.getInstance()
        var hour = time.get(Calendar.HOUR)
        var min = time.get(Calendar.MINUTE)

        var timeListener = object : TimePickerDialog.OnTimeSetListener{
            override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
                Toast.makeText(this@MainActivity,"${hourOfDay}시 ${minute}분",Toast.LENGTH_LONG).show()
            }
        }
        var builder = TimePickerDialog(this,timeListener,hour,min,false)
        builder.show()
    }

    // ? Menu 3 - 웹 브라우저를 띄워 네이버 사이트로 연결시키기
    fun goNaver(){
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com")))
    }


}
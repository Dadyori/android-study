package kr.teamcadi.day02

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() { //클래스명 extends 상속받고자 하는 클래스
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ex01)
        val btn_intent = findViewById<View>(R.id.btn_intent) as Button
        btn_intent?.setOnClickListener { // Intent가 정의되는 부분
            //쓸데없는 코드 줄이자
            // Intent i = new Intent(MainActivity.this, secondActivity.class);
            startActivity(Intent(this@MainActivity, secondActivity::class.java))
            finish()
        }

        //ex02)
        val btn_link = findViewById<View>(R.id.btn_link) as Button
        btn_link.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"))) }

        //ex03)
        val btn_layout: Button? = findViewById(R.id.btn_layout);
        btn_layout?.setOnClickListener { // Intent가 정의되는 부분
            //쓸데없는 코드 줄이자
            // Intent i = new Intent(MainActivity.this, secondActivity.class);
            startActivity(Intent(this@MainActivity, LayoutActivity::class.java))
            finish()
        }
    }
}
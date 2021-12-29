package com.example.pizzaorderapp_jaewhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
//  무조건 한 번은 실행을 보장받는 공간이다. 그러므로 맨 앞에 두고 밑의 setupEvents와 setValues를 포함시켜준다.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

//        버튼 클릭등의 이벤트 관련 코드 모음.

    }

    override fun setValues() {

//        화면에 데이터를 표시하기 위한 코드 모음.

//        뷰페이저 작업



//        탭레이아웃과 연결

//       mainTabLayout.setupWithViewPager()

    }


}
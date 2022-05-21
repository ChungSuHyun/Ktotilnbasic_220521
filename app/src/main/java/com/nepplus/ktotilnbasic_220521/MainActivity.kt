package com.nepplus.ktotilnbasic_220521

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {

            Log.d("메인화면", "로그 버튼 눌림")
            Log.e("메인화면","에러 로그 테스트" )



        }

        btnToast.setOnClickListener {

            Toast.makeText(this, "토스트 자동완성", Toast.LENGTH_SHORT).show()


        }

        btnVariable.setOnClickListener {

//            여기는 변수 문법 연습 (주석 - Ctrl + /)
//            주석 : 코드에 남기는 메모


            Log.d("변수", name1) // 내부에 들어있는 "박철수" 출력
            Log.d("변수", name2)

            val address = "서울시 동대문구"

            Toast.makeText(this, "address", Toast.LENGTH_SHORT)
        }

        btnCondition.setOnClickListener {

            val userAge = 21 // Int 형태.

//            나이가 20살 이상이라면? => "성인입니다." 토스트로
            if (userAge >= 20) {

                Toast.makeText(this, "성인입니다.", Toast.LENGTH_SHORT).show()

            }

                else if (userAge >= 17) {
                Toast.makeText(this, "고등학생 입니다.", Toast.LENGTH_SHORT).show()
            }
                else if (userAge >= 14) {
                Toast.makeText(this, "중학생 입니다.", Toast.LENGTH_SHORT).show()
            }

            else {
//                위의 모든 질문이 다 틀리면 실행할 내용
                Toast.makeText(this, "초등학생 혹은 미취학아동입니다.", Toast.LENGTH_SHORT).show()
            }

//            조건식 논리 연산 예시.

//            1. 급여 높음 2. 거리가 가까움 3. 근로시간 적으면

            val salary = 7800
            val minutes = 80
            val workHour = 35

//            연봉 4000이상 AND 거리는 50분 이내

            if (salary >= 4000 && minutes <= 50 ) {
                Log.d("조건문", "연봉 & 거리 모두 만족.")
            }

//            거리가 20분 이내 or 근무시간 40시간 이내
            if (minutes <= 20 || workHour = <= 40 ) {

            }

//            근무시간이 50시간 이상만 아니면 된다.
            if (!(workHour < 50)) {

        }


        }

//        복사 버튼이 눌리면 > 입력도니 내용을 받아서 > 텍스트뷰에 반영

        btnCopy.setOnClickListener {

//            (edtMessage에) 입력된 내용 (text 속성에 들어있는 값)을 기억 해야 > 테그슽 뷰에 적을 수 있다.
//            변수에 담아두자.

            val inputMessage = edtMessage.text.toString()

            txtMessage.text = inputMessage
        }
    }
}
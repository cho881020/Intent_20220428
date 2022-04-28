package kr.nepp.intent_20220428

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend.setOnClickListener {

            val inputMessage = edtMessage.text.toString()

            val testNum = 10

            val myIntent = Intent(this, MessageActivity::class.java)

//            myIntent변수에, 들고 갈 데이터 첨부.
            myIntent.putExtra("메세지", inputMessage)
            myIntent.putExtra("정수", testNum)

            startActivity(myIntent)

        }

        btnMove.setOnClickListener {

            val myIntent = Intent( this, OtherActivity::class.java )
            startActivity(myIntent)

        }

    }
}
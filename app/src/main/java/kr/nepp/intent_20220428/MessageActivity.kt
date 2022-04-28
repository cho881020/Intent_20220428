package kr.nepp.intent_20220428

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_message.*

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        val receivedMessage =  intent.getStringExtra("메세지")

        txtMessage.text = receivedMessage

        val num =  intent.getIntExtra("정수", 0)

        Toast.makeText(this, "받은 숫자 : ${num}", Toast.LENGTH_SHORT).show()

    }
}
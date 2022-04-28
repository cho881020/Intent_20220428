package kr.nepp.intent_20220428

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMove.setOnClickListener {

            val myIntent = Intent( this, OtherActivity::class.java )
            startActivity(myIntent)

        }

    }
}
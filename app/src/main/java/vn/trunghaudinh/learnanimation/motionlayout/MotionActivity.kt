package vn.trunghaudinh.learnanimation.motionlayout

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_motion.*
import vn.trunghaudinh.learnanimation.R


class MotionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContentView(R.layout.activity_motion)


        btn1.setOnClickListener {
            startActivity(Intent(this,Example1Activity::class.java))
        }

        btn2.setOnClickListener {
            startActivity(Intent(this,ReadBookActivity::class.java))
        }


    }
}
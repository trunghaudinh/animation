package vn.trunghaudinh.learnanimation

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity


class MotionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContentView(R.layout.activity_motion)

//        view.setOnClickListener {
//            Toast.makeText(this,"Start",Toast.LENGTH_LONG).show()
//        }
    }
}
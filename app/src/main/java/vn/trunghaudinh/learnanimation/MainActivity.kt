package vn.trunghaudinh.learnanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDrawable.setOnClickListener {
            startActivity(Intent(this,DrawableAnimation::class.java))
        }

        btnTween.setOnClickListener {
            startActivity(Intent(this,TweenAnimation::class.java))
        }
    }
}

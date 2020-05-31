package vn.trunghaudinh.learnanimation

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_demo_drawable_animation.*

class DrawableAnimation : AppCompatActivity() {

    var animation: AnimationDrawable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_drawable_animation)

        imvDoraemon.setBackgroundResource(R.drawable.animation_doraemon)

        animation = imvDoraemon.background as AnimationDrawable?

        btnStart.setOnClickListener {
            if (animation?.isRunning!!){
                animation?.stop()
            }else{
                animation?.start()
            }
        }

    }
}

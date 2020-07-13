package vn.trunghaudinh.learnanimation.motionlayout

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.android.synthetic.main.activity_splash.*
import vn.trunghaudinh.learnanimation.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContentView(R.layout.activity_splash)

        motionSplash.setTransition(R.id.startSplash, R.id.endSplash)
        motionSplash.transitionToEnd()

        motionSplash.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
            }

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                when (p1) {
                    R.id.startSplash -> {
                        motionSplash.setTransition(p1, R.id.endSplash)
                    }

                    R.id.endSplash -> {
                        motionSplash.setTransition(p1, R.id.writeText)
                    }

                    R.id.writeText -> {
                        motionSplash.setTransition(p1, R.id.centerPen)
                    }
                }
                motionSplash.transitionToEnd()
            }

        })
    }
}
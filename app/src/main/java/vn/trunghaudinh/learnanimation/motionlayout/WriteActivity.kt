package vn.trunghaudinh.learnanimation.motionlayout

import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.android.synthetic.main.activity_write.*
import vn.trunghaudinh.learnanimation.R

class WriteActivity : AppCompatActivity() {

    private val TAG = "TRUNGHAUDINH"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        setContentView(R.layout.activity_write)

        val transitionRightHand = motionMain.getTransition(R.id.transitionRightHand)
        val transitionLeftHand = motionMain.getTransition(R.id.transitionLeftHand)
        val transitionWriteText = motionMain.getTransition(R.id.transitionWriteText)

        motionMain.setTransition(R.id.start2,R.id.enddd)
        motionMain.transitionToEnd()

        Log.i(TAG, "state  " + motionMain.currentState)
//        nextState()

        motionMain.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
                Log.i(TAG, "onTransitionTrigger")
            }

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
                Log.i(TAG, "onTransitionStarted")
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
                Log.i(TAG, "onTransitionChange")
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                Log.i(TAG, "onTransitionCompleted")
                when (p1) {

                    R.id.start2 -> {
                        Log.i(TAG, "vao day")
                        motionMain.setTransition(p1, R.id.enddd)
                    }

                    R.id.enddd -> {
                        Log.i(TAG, "vao day")
                        motionMain.setTransition(p1, R.id.leftHand)
                    }

                    R.id.leftHand -> {
                        Log.i(TAG, "vao day")
                        motionMain.setTransition(p1, R.id.writeText)
                    }
                }
                motionMain.transitionToEnd()
            }

        })


    }

    fun nextState() {
        when (motionMain.currentState) {
            R.id.start1 -> motionMain.transitionToState(R.id.end1)
//            R.id.end -> motionMain.transitionToState(R.id.leftHand)
//            R.id.leftHand -> motionMain.transitionToState(R.id.writeText)
        }
    }
}
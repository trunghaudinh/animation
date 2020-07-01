package vn.trunghaudinh.learnanimation

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.animation.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_tween_animation.*

class TweenAnimation : AppCompatActivity() {

    var animationTranslate: Animation? = null
    var animationScale: Animation? = null
    var animationAlpha: Animation? = null
    var animationRotation: Animation? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tween_animation)

        animationTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate)
        animationScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale)
        animationRotation = AnimationUtils.loadAnimation(this, R.anim.anim_rotation)
        animationAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha)


        btnStartTranslate.setOnClickListener {
            val animationSet = AnimationSet(false)

            val rotationAnim = RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF,.5f, Animation.RELATIVE_TO_SELF,.5f)
            rotationAnim.duration = 10000

            val translateAnim = TranslateAnimation(0f, 0f, 0f, 600f)
            translateAnim.duration = 10000



            animationSet.addAnimation(rotationAnim)
            animationSet.addAnimation(translateAnim)

            view1.startAnimation(animationSet)




        }
        view1.setOnClickListener {
            Toast.makeText(this@TweenAnimation,"animation cliked",Toast.LENGTH_LONG).show()
        }

        btnStartScale.setOnClickListener {
            val obj = ObjectAnimator.ofFloat(view1,"translationY",0f,300f)
            obj.duration = 3000
            obj.start()

        }

        btnStartRotation.setOnClickListener {
            view1.startAnimation(animationRotation)
        }

        btnStartAlpha.setOnClickListener {
            view1.startAnimation(animationAlpha)

        }

    }
}

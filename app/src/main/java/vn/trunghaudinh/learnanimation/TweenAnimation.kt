package vn.trunghaudinh.learnanimation

import android.animation.AnimatorSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_tween_animation.*

class TweenAnimation : AppCompatActivity() {

    var animationTranslate : Animation? = null
    var animationScale : Animation? = null
    var animationAlpha : Animation? = null
    var animationRotation : Animation? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tween_animation)

        animationTranslate = AnimationUtils.loadAnimation(this,R.anim.anim_translate)
        animationScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale)
        animationRotation = AnimationUtils.loadAnimation(this,R.anim.anim_rotation)
        animationAlpha = AnimationUtils.loadAnimation(this,R.anim.anim_alpha)


        btnStartTranslate.setOnClickListener {
            val animationSet = AnimationSet(false)
            animationSet.addAnimation(animationTranslate)
//            animationSet.addAnimation(animationAlpha)
            animationSet.addAnimation(animationRotation)
            view1.startAnimation(animationSet)
        }

        btnStartScale.setOnClickListener {
            view1.startAnimation(animationScale)
        }

        btnStartRotation.setOnClickListener{
            view1.startAnimation(animationRotation)
        }

        btnStartAlpha.setOnClickListener{
            view1.startAnimation(animationAlpha)
        }

    }
}

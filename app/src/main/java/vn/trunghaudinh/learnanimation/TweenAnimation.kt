package vn.trunghaudinh.learnanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_tween_animation.*

class TweenAnimation : AppCompatActivity() {

    var animationTranslate : Animation? = null
    var animationScale : Animation? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tween_animation)

        animationTranslate = AnimationUtils.loadAnimation(this,R.anim.anim_translate);
        animationScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);


        btnStart.setOnClickListener {
            view1.startAnimation(animationTranslate)
        }

        btnStart2.setOnClickListener {
            view1.startAnimation(animationScale)
        }

    }
}

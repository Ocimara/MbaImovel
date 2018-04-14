package com.example.ocimarabarcellos.mbaimovel
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        animar()
    }

    private fun animar() {
        val anim = AnimationUtils.loadAnimation(this, R.anim.animacao_splash)

        anim.reset()

        val iv = findViewById(R.id.ivLogo) as ImageView
        if (iv != null) {
            iv.clearAnimation()
            iv.startAnimation(anim)
        }

        Handler().postDelayed({

            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
            startActivity(intent)
            this@SplashScreen.finish()
        },5000)


    }

}

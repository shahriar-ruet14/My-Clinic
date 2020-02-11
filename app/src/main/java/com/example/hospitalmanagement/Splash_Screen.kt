package com.example.hospitalmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class Splash_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.hide()


        setContentView(R.layout.activity_splash__screen)


        //Declare the animation

        val bounce = AnimationUtils.loadAnimation(this,R.anim.bounce)
        val bottom_anim = AnimationUtils.loadAnimation(this,R.anim.botton_anim)
        val fade_in_anim = AnimationUtils.loadAnimation(this, R.anim.fade_in)

        val splash_text = findViewById(R.id.Splash_text) as TextView
        val splash_image = findViewById(R.id.Splash_imageView) as ImageView
        val rotate_injection = findViewById(R.id.rotating_injection) as ImageView

        ///Set the animation
        splash_text.startAnimation(bounce)
        splash_image.startAnimation(bottom_anim)
        rotate_injection.startAnimation(fade_in_anim)

        Handler().postDelayed({
            //start main activity
            startActivity(Intent(this@Splash_Screen, MainActivity::class.java))
            //finish this activity
            finish()
        },1400)
    }
}

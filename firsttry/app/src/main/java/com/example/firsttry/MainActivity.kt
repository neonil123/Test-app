package com.example.firsttry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodlist = arrayListOf("Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FrontTxt.text="Salut petrica"
        DecideBTN.setOnClickListener {
            val random=Random();
            var randomfood = random.nextInt(foodlist.count());
            FrontTxt.text=foodlist[randomfood]
        }
      AddFood.setOnClickListener {
         foodlist.add(AddFoodTxt.text.toString())
          AddFoodTxt.text.clear()
      }

    }
}
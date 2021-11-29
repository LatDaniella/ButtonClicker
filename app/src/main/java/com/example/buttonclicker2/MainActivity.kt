package com.example.buttonclicker2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat.setBackground

class MainActivity : AppCompatActivity() {

    //private Button button;    in java
    //var or val : variable vs constant
    //var varName : DataType
    //lateinit is a promise to initialize the variable later
    //before using it
    lateinit var buttonClicker : Button
    var timesClicked = 0      // or var timesClicked : Int = 0
    lateinit var clickText : TextView
    lateinit var rotateImage : ImageView
    lateinit var layout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //wire widgets -- link the xml (data type of our layout file) widgets to our kotlin
        buttonClicker = findViewById(R.id.button_main_clicker)
        buttonClicker.text = "CLICK NOW!"
        clickText = findViewById(R.id.textview_main_clickcount)
        rotateImage = findViewById(R.id.imageView_main_cuteAndroid)


        // react to a click to increase the timeClicked variable
        buttonClicker.setOnClickListener {
            //in between the braces, put code that should happen after a click
            timesClicked++
            //buttonClicker.text = "Times Clicked: " + timesClicked (java way)
            clickText.text = "Times Clicked: $timesClicked"
            rotateImage.rotation += 5



            //toast the user when they have clicked 10 times
            if(timesClicked == 10){
                // context in android is the activity you are currently in
                //usually the keyword this
                //sometimes may need to specify this@ActivityName
                    Toast.makeText(this@MainActivity, "Congrats! You clicked 10 times!", Toast.LENGTH_SHORT).show()

            }
            if(timesClicked == 20){
                Toast.makeText(this@MainActivity, "Only 20... yikes", Toast.LENGTH_SHORT).show()
            }
            if(timesClicked == 30){
                Toast.makeText(this@MainActivity, "30 is... okay", Toast.LENGTH_SHORT).show()
            }
            if(timesClicked == 40){
                Toast.makeText(this@MainActivity, "40 is just not 50 :/", Toast.LENGTH_SHORT).show()
            }
            if(timesClicked == 50){
                Toast.makeText(this@MainActivity, "50 clicks let's gooooooo", Toast.LENGTH_SHORT).show()
            }
            if(timesClicked == 60){
                Toast.makeText(this@MainActivity, "oh so you're going to 100", Toast.LENGTH_SHORT).show()
            }
            if(timesClicked == 70){
                Toast.makeText(this@MainActivity, "not that you can make it", Toast.LENGTH_SHORT).show()
            }
            if(timesClicked == 80){
                Toast.makeText(this@MainActivity, "well I guess you are on 80 so", Toast.LENGTH_SHORT).show()
            }
            if(timesClicked == 90){
                Toast.makeText(this@MainActivity, "90????", Toast.LENGTH_SHORT).show()
            }
            if(timesClicked == 100){
                Toast.makeText(this@MainActivity, "okay stop and go do something useful", Toast.LENGTH_LONG).show()
            }
        }

    }
}
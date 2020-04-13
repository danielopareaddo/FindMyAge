package com.danielopareaddo.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Year
import java.util.*
import java.util.Calendar.YEAR

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun findAgeBtn (view: View){

        val enterYear = enterYear.text.toString().toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - enterYear

        if (enterYear > currentYear || enterYear == 0 ){

            resultText.text = " "
            Toast.makeText(this, "enter a valid year of birth", Toast.LENGTH_LONG).show()

        }else {

            try {

                resultText.text = "You are $age year(s) old"

            } catch (ex: Exception) {
                Toast.makeText(this, "enter your year of birth", Toast.LENGTH_LONG).show()
            }
        }


    }
}

package com.ebookfrenzy.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ebookfrenzy.tipcalculator.databinding.ActivityMainBinding
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun calculateTip(view: View){
        if (binding.dollarText.text.isNotEmpty()) {

            val df = DecimalFormat("#.00")

            val tenPercentValue = binding.dollarText.text.toString().toFloat() * 1.1
            val fifteenPercentValue = binding.dollarText.text.toString().toFloat() * 1.15
            val twentyPercentValue = binding.dollarText.text.toString().toFloat() * 1.2

            val results = "The Tips Are As Follows:" +
                    "\n\n        10% = $" + df.format(tenPercentValue) +
                    "\n        15% = $" + df.format(fifteenPercentValue)+
                    "\n        20% = $" + df.format(twentyPercentValue)

            binding.textView.text = results
        } else {
            binding.textView.text = "Please Enter a Bill Amount!"
        }

    }
}
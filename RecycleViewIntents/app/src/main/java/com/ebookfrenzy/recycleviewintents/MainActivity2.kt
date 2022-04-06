package com.ebookfrenzy.recycleviewintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ebookfrenzy.recycleviewintents.databinding.ActivitySecondBinding


class MainActivity2 : AppCompatActivity(){
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extras = intent.extras ?: return
        val title = extras.getInt("Title")
        val detail = extras.getInt("Detail")
        val image = extras.getInt("Image")
        binding.itemTitle2.text = Data.titles[title]
        binding.itemDetail2.text = Data.details[detail]
        binding.itemImage2.setImageResource(Data.images[image])


    }

}
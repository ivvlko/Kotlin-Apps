package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val btn : Button = findViewById(R.id.rollButton);
        val image: ImageView = findViewById(R.id.imageView);
        val text: TextView = findViewById(R.id.textView);
        val dice = Dice(6);

        var hashMap : HashMap<Int, Int> = HashMap<Int, Int> ();
        hashMap.put(1, R.drawable.dice_1);
        hashMap.put(2, R.drawable.dice_2);
        hashMap.put(3, R.drawable.dice_3);
        hashMap.put(4, R.drawable.dice_4);
        hashMap.put(5, R.drawable.dice_5);
        hashMap.put(6, R.drawable.dice_6);

      btn.setOnClickListener(){
          val drawedSide: Int = dice.roll();
          text.setText(drawedSide.toString());
          hashMap.get(drawedSide)?.let { it1 -> image.setImageResource(it1) };

        };
    }
}

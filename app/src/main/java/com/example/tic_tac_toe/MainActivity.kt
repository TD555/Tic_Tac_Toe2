package com.example.tic_tac_toe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
var count1=0;
var count2=0;
var x=true;
val list1= mutableListOf<Int>()
val list2= mutableListOf<Int>()

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val play = findViewById<Button>(R.id.button10)
        val player1 = findViewById<EditText>(R.id.editTextTextPersonName)
        val player2 = findViewById<EditText>(R.id.editTextTextPersonName2)
        val name1 = findViewById<TextView>(R.id.textView4)
        val name2 = findViewById<TextView>(R.id.textView8)
        player1.doAfterTextChanged {
            name1.text = player1.text;
            play.isEnabled = player1.text.isNotEmpty() && player2.text.isNotEmpty()
        }
        player2.doAfterTextChanged {
            name2.text = player2.text;
            play.isEnabled = player1.text.isNotEmpty() && player2.text.isNotEmpty()
        }
        play.setOnClickListener {
            x = true;
            player1.isEnabled = false;
            player2.isEnabled = false;
            val intent = Intent(this, GameActivity::class.java)
            startActivityForResult(intent, 1000)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val point1 = findViewById<TextView>(R.id.textView5)
        val point2 = findViewById<TextView>(R.id.textView7)
        val name1 = findViewById<TextView>(R.id.textView4)
        val name2 = findViewById<TextView>(R.id.textView8)
        point1.text = count1.toString()
        point2.text = count2.toString()
        if(resultCode==50)
            Toast.makeText(applicationContext, "Draw!", Toast.LENGTH_SHORT).show()
        if (resultCode == 100)
            Toast.makeText(
                applicationContext,
                "${name1.text} wins,+1 point!",
                Toast.LENGTH_SHORT
            ).show()
        if (resultCode == 200)
            Toast.makeText(
                applicationContext,
                "${name2.text} wins,+1 point!",
                Toast.LENGTH_SHORT
            ).show()
        list1.clear()
        list2.clear()
        if (count1 == 3) {
            Toast.makeText(applicationContext, "Winner is ${name1.text}!", Toast.LENGTH_LONG).show()
            count1 = 0;
            count2 = 0;
            recreate();
        }
        if (count2 == 3) {
            Toast.makeText(applicationContext, "Winner is ${name2.text}!", Toast.LENGTH_LONG).show()
            count1 = 0;
            count2 = 0;
            recreate()
        }
    }
}
package com.example.tic_tac_toe

import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class GameActivity:MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)
        val button1=findViewById<Button>(R.id.button1)
        val button2=findViewById<Button>(R.id.button2)
        val button3=findViewById<Button>(R.id.button3)
        val button4=findViewById<Button>(R.id.button4)
        val button5=findViewById<Button>(R.id.button5)
        val button6=findViewById<Button>(R.id.button6)
        val button7=findViewById<Button>(R.id.button7)
        val button8=findViewById<Button>(R.id.button8)
        val button9=findViewById<Button>(R.id.button9)
        x=true;
        button1.setOnClickListener {
            if(x)
            {
                button1.text="X"
                list1.add(1)
                if(iswin()) {
                    count1++
                    setResult(100)
                    finish()
                }
                else
                x=false;
            }
            else
            {
                button1.text="O"
                list2.add(1)
                if(iswin())
                {
                    count2++
                    setResult(200)
                    finish()
                }
                else
                x=true
            }
            button1.isEnabled=false;
        }
        button2.setOnClickListener {
            if(x)
            {
                button2.text="X"
                list1.add(2)
                if(iswin()) {
                    count1++
                    setResult(100)
                    finish()
                }
                else
                x=false
            }
            else
            {
                button2.text="O"
                list2.add(2)
                if(iswin())
                {
                    count2++
                    finish()
                    setResult(200)
                }
                else
                x=true
            }
            button2.isEnabled=false;
        }
        button3.setOnClickListener {
            if(x)
            {
                button3.text="X"
                list1.add(3)
                if(iswin()) {
                    count1++
                    finish()
                    setResult(100)
                }
                else
                x=false
            }
            else
            {
                button3.text="O"
                list2.add(3)
                if(iswin())
                {
                    count2++
                    setResult(200)
                    finish()
                }
                else
                x=true
            }
            button3.isEnabled=false;
        }
        button4.setOnClickListener {
            if(x)
            {
                button4.text="X"
                list1.add(4)
                if(iswin()) {
                    count1++
                    setResult(100)
                    finish()
                }
                else
                x=false
            }
            else
            {
                button4.text="O"
                list2.add(4)
                if(iswin())
                {
                    count2++
                    setResult(200)
                    finish()
                }
                else
                x=true
            }
            button4.isEnabled=false;
        }
        button5.setOnClickListener {
            if(x)
            {
                button5.text="X"
                list1.add(5)
                if(iswin()) {
                    count1++
                    setResult(100)
                    finish()
                }
                else
                x=false
            }
            else
            {
                button5.text="O"
                list2.add(5)
                if(iswin())
                {
                    count2++
                    setResult(200)
                    finish()
                }
                else
                x=true
            }
            button5.isEnabled=false;
        }
        button6.setOnClickListener {
            if(x)
            {
                button6.text="X"
                list1.add(6)
                if(iswin()) {
                    count1++
                    setResult(100)
                    finish()
                }
                else
                x=false
            }
            else
            {
                button6.text="O"
                list2.add(6)
                if(iswin())
                {
                    count2++
                    setResult(200)
                    finish()
                }
                else
                x=true
            }
            button6.isEnabled=false;
        }
        button7.setOnClickListener {
            if(x)
            {
                button7.text="X"
                list1.add(7)
                if(iswin()) {
                    count1++
                    setResult(100)
                    finish()
                }
                else
                x=false
            }
            else
            {
                button7.text="O"
                list2.add(7)
                if(iswin())
                {
                    count2++
                    setResult(200)
                    finish()
                }
                else
                x=true
            }
            button7.isEnabled=false;
        }
        button8.setOnClickListener {
            if(x)
            {
                button8.text="X"
                list1.add(8)
                if(iswin()) {
                    count1++
                    setResult(100)
                    finish()
                }
                else
                x=false
            }
            else
            {
                button8.text="O"
                list2.add(8)
                if(iswin())
                {
                    count2++
                    setResult(200)
                    finish()
                }
                else
                x=true
            }
            button8.isEnabled=false;
        }
        button9.setOnClickListener {
            if (x) {
                button9.text = "X"
                list1.add(9)
                if (iswin()) {
                    count1++
                    setResult(100)
                    finish()
                }
                else
                x = false
            } else {
                button9.text = "O"
                list2.add(9)
                if (iswin()) {
                    count2++
                    setResult(200)
                    finish()
                }
                else
                x = true
            }
            button9.isEnabled = false;
        }
    }
}
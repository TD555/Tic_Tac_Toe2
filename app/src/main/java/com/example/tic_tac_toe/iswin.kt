package com.example.tic_tac_toe

import android.widget.Toast

fun GameActivity.iswin():Boolean
{
    if(x)
    {
        if(list1.size<3)
            return false
        if(list1.contains(1)&&list1.contains(5)&&list1.contains(9))
            return true
        if(list1.contains(3)&&list1.contains(5)&&list1.contains(7))
            return true
        for(i in 1..3)
        if(list1.contains(i)&&list1.contains(i+3)&&list1.contains(i+6))
            return true
        for(i in 1..7 step 3)
            if(list1.contains(i)&&list1.contains(i+1)&&list1.contains(i+2))
                return true
        if(list1.size+list2.size==9)
        {
            setResult(50)
            finish()
        }
        return false
    }
    else
    {
        if(list2.size<3)
            return false
        if(list2.contains(1)&&list2.contains(5)&&list2.contains(9))
            return true
        if(list2.contains(3)&&list2.contains(5)&&list2.contains(7))
            return true
        for(i in 1..3)
            if(list2.contains(i)&&list2.contains(i+3)&&list2.contains(i+6))
                return true
        for(i in 1..7 step 3)
            if(list2.contains(i)&&list2.contains(i+1)&&list2.contains(i+2))
                return true
        if(list1.size+list2.size==9)
        {
            setResult(50)
            finish()
        }
        return false
    }
}
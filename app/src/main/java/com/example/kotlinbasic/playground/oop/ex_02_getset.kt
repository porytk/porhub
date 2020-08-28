package com.example.kotlinbasic.playground.oop

import java.util.*

fun main() {
        val obj1 = GetAndSet()
       println(obj1.name)
       println(obj1.age)
       obj1.age=-6969
       println(obj1.age)
    }
class GetAndSet {
    var name:String = "IBlurBlur"
        get() = field.toUpperCase(Locale.ROOT)
    var age: Int = 0
        get() {
            if(field>100){
                field=100
            }
           return field
        }

    set(value){
        field = if (value < 0) 0 else value
    }
    var isLogin:Boolean = false
}
package com.example.kotlinbasic.playground.oop

import java.util.*

fun main() {
    val obj1 = Cat()
    obj1.say()
    obj1.run(21421)
}
open class Animal {
    var name = "_"
    var age = 0
    open fun say() {
        ("$name say: foooooo")
    }
}
    class Cat: Animal(),Event {
        override fun say() {
            //super.say()
            name = "black"
            println("$name say: meowww")
        }

        override fun run(speed: Int) {
            //todo
        }
    }
        interface Event{
            fun run(speed:Int)
        }


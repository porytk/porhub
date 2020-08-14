package com.example.kotlinbasic.playground.basic

fun main() {
     val array1 = arrayOf(1234,"IBlur",true)
     val array2 = arrayOf<Any>(1234,"IBlur",true)
     val array3 = arrayOf<Int>(1234,456,789)

     val array4:IntArray = intArrayOf(123,456,789)
     val array5 = intArrayOf(123,456,789)

     array1[0]="cat"
     array1.set(2,1235)

     println(array1[0])
     println(array1.get(2))

     for(item in array1){
          println("[for] array1 $item" )
     }
     array1.forEach { item ->
          println("[for] array1 $item")
     }
     for(index in array1.indices){
          println("[for > index] array1: ${array1[index]}")
     }
     for(index in 0 until array1.size){
          println("[for > index] array1: ${array1[index]}")
     }
     for((index, item) in array1.withIndex()){
          println("[for > index] array1: $item [$index]")
     }
     array1.forEachIndexed(){index,item ->
          println("[for > index] array1: $item [$index]")
     }
 }

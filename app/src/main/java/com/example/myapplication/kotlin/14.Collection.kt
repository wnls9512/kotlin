package com.example.myapplication.kotlin

// Collection
// list, set ,map

fun main(args:Array<String>){

    // list
    // Immutable collection : 불변 , set 불가능
    val numberList = listOf<Int>(1,2,3,3)
    println(numberList)
    // Mutable collection
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3, 10)
    println(mNumberList)

    //set : 중복을 허용하지 않음, 순서가 없음
    val numberSet = setOf<Int>(1,2,3,3,3,3)
//    println(numberSet)
//    println(numberSet.get) : index가 없어서 출력 불가능
    numberSet.forEach{
        println(it)
    }
    val mNumberSet = mutableSetOf<Int>(1,2,3,4,5,5,5,5)
    mNumberSet.add(10)

    //map
    val numberMap = mapOf<String, Int>("number" to 0, "one" to 1)
    println(numberMap.get("number"))
    println(numberMap["one"])
    val mNumberMap = mutableMapOf<String, Int>("one" to 1, "two" to 2)
    mNumberMap.put("one", 111)
    println(mNumberMap)

}
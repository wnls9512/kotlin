package com.example.myapplication.kotlin

// 01. Variable

// 변수 선언
// var : 변할 수도 있는 값
// val (== const, final) : 변하지 않는 값

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args:Array<String>){

    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "goodbye"
    point = 1.2

    println(num)
    println(hello)
    println(point)

//    fix = 10
//    println(fix)



}
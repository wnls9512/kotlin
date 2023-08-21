package com.example.myapplication.kotlin

var a = 1+2+3+4+5 //연산의 결과값을 변수에 넣어줄 수 있다
var b = "1"
var c = b.toInt()
var d = b.toFloat()
var e = "John"
var f = "My name is $e Nice to meet you"

//자료형 뒤에 ?를 붙이면 null를 허용한다
//var abc : Int = null
var abc : Int? = null
var g = a+3

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
}
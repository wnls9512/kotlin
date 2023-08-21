package com.example.myapplication.kotlin

// 02. 자료형
// 정수형 : Long > Int > Short > Byte
// 실수형 : Double > Float
// 문자 : Char
// 문자열 : String
// 논리형 : Boolean

//1. var/val 변수명 = 값
//코틀린은 자료형을 정의해주지 않아도 값에 따라 자료형을 알아서 인식한다
//단, 값을 변경할 때 처음 선언한 자료형과 다를 경우 오류
var number = 10
fun main(arrat: Array<String>){
    number = 20
//    number = "hello"
}

//2. var/val 변수 : 자료형 = 값
var number1 : Int = 20
var hello1 : String = "hello"
var point1 : Double = 3.4

package com.example.myapplication.kotlin

//1. 사칙 연산 수행 클래스
class Calculator1(var number1: Int, var number2: Int) {
    fun add(): Int {
        return number1 + number2
    }

    fun sub(): Int {
        return number1 - number2
    }

    fun mult(): Int {
        return number1 * number2
    }

    fun div(): Int {
        return number1 / number2
    }
}

class Calculator2() {
    fun plus(vararg numbers: Int): Int{
        var result = 0;
        numbers.forEach { result += it }
        return result
    }

    fun minus(vararg numbers: Int) : Int{
        var result = 0;
        for(i in 0 until numbers.size){
            result = result - numbers[i]
        }
        return result
    }

    fun multiply(vararg numbers: Int) : Int {
        var result : Int = 0;
        numbers.forEach {
            if(it != 0)
                result = result * it
        }
        return result
    }

    fun divide(vararg  numbers: Int): Int {
        var result : Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            if(index != 0 && value != 0)
                result = result / value
        }
        return result
    }
}

//2. 은행 계좌 만들기
//  -계좌 생성 기능 (이름, 생년 월일)
//  -잔고 확인 기능
//  -출금 기능
//  -예금 기능
class test2(var name: String, var birth: String) {


}

//3. TV 클래스
//  -on/off 기능
//  -채널을 돌리는 기능
//  -초기 채널은 S, M, K
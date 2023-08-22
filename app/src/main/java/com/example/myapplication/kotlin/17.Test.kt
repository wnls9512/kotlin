package com.example.myapplication.kotlin

fun main(args: Array<String>) {
    test1()
    println(test2(80))
    println(test3(61))
    test4()
}


//1번 문제
//List를 두개 만든다
//첫번째 ArrayList에는 0부터 9까지의 값을 넣는다 (반복문 사용)
//두번째 ArrayList에는 첫번째 ArrayList의 값을 하나씩 확인한 후
//짝수면 True 홀수면 False를 넣어준다
fun test1() {
    var list1 = mutableListOf<Int>();
    var list2 = mutableListOf<Boolean>();

    for (i in 0..9) {
        list1.add(i, i)
//        if (list1[i] % 2 == 0) {
//            list2.add(i, true)
//        } else {
//            list2.add(i, false)
//        }
    }
    list1.forEachIndexed { index, value ->
        if (value % 2 == 0) {
            list2.add(index, true)
        } else {
            list2.add(index, false)
        }
    }
    println("list1 = " + list1)
    println("list2 = " + list2)
}

//2번 문제
//학점을 구하는 함수를 작성한다
//100 - 90 : A
//80 - 89 : B
//70 - 79 : C
//나머지 : F
fun test2(score: Int): String {
//    var result:String = "F"
//
//    if(score >= 90 && score <= 100) result = "A"
//    else if (score >= 80 && score < 90) result = "B"
//    else if (score >= 70 && score < 80) result = "C"
//    return result

    when (score) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "F"
    }
}


//3번 문제
//전달 받은 숫자의 각 자리 수의 합을 구하자
// 조건 : 숫자는 반드시 두자리이다
fun test3(number: Int): Int {
    val a: Int = number / 10
    val b: Int = number % 10
    return a + b
}

//4번 문제
//구구단을 출력하자
fun test4() {
    for (x in 1..9){
        for(y in 1 ..9){
            println("$x X $y = ${x*y}")
        }
    }
}
package com.example.myapplication.kotlin


fun main(args: Array<String>) {
    val bigCar: Car = Car("v8 engine", "big")
    val supercar: SuperCar = SuperCar("good engin", "big", "white")

    //클래스 내부의 함수 호출하기
    val runableCar: RunableCar = RunableCar("simple engin", "body")
    runableCar.ride()
    runableCar.drive()
    runableCar.navi("부산")

    //클래스의 멤버 변수에 접근하기
    var runableCar2 : Runable2 = Runable2("nice engin", "long body")
    println(runableCar2.body)
    println(runableCar2.engine)
}

//방법 1
class Car(var engine: String, var body: String) {
}

//방법 2
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

//방법 3
//engine, body가 필수 값인 경우
class Car1(engine: String, body: String) {
    //class Car1 constructor(engine: String, body: String){
    var door: String = ""

    //생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

//방법 4
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar(engine: String, body: String) {

    fun ride() {
        println("탑승했습니다")
    }

    fun drive() {
        println("달립니다")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

class Runable2{
    var engine: String
    var body:String
    constructor(engine: String, body: String){
        this.engine = engine
        this.body = body
    }

    //객체 생성 시 가장 먼저 호출되는 부분
    //초기값 세팅에 사용
    init {
        println("RunableCar2가 만들어졌습니다")

    }

    fun ride() {
        println("탑승했습니다")
    }

    fun drive() {
        println("달립니다")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }

}

//오버로딩
class TestClass(){
    fun Test(a: Int){

    }
    fun Test(a: Int, b: Int){

    }
}
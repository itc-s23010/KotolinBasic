package com.example.chap31

fun main(args: Array<String>) {
    val person = FlyingPerson("たけし", 5)
    val car = FlyingCar("赤")
    makeItFly(person)
    makeItFly(car)
}

fun makeItFly(a: Flayable) {
    a.fly()
}

interface Flayable {
    fun fly(){
        println("未確認飛行物体です！")
    }

}

open class Person(val name: String, val age: Int)
class FlyingPerson(name: String, age:Int) : Person(name, age), Flayable {
    override fun fly() {
        println("まさか！人間が飛んでいます。")
    }
}
abstract class Car(val color: String)
class FlyingCar(color: String) : Car(color),Flayable {
    override fun fly() {
        println("すごい！車が空を飛んでいます。")
    }
}
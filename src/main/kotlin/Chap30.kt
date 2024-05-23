package com.example.chap30

fun main(Args : Array<String>) {

}

open class Car() {      // 27.1
    var distance = 0.0
    open fun drive(d: Double) {
        distance = distance + d
        println("車が ${d}km 走りました。")
        println("マイレージは ${distance}キロになりました。")
    }
}
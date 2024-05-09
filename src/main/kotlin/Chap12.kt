package org.example

fun main(Args : Array<String>) {
    val x = "Hello"
    when (x) {
        "Good Morning" -> println("おはようございます")
        "Hello" -> println("こんにちは")
        "Good Evening" -> println("こんばんは")
        else -> println("どうも！")
    }
    println("----12.2----")
    val x2 = 2
    when (x2) {
        1,2 -> {
            println("スリー")
        }
    }
}
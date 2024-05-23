package org.example

import com.sun.tools.attach.AgentLoadException

fun main(Args : Array<String>) {
    val p1 = Person("たけし",7)
}
class Person(val name: String, var age: Int) {
    init {
        println("コンストラクタのイニシャライザが呼ばれました。")
        greet()
    }
    fun greet() {
        println("${name}です。${age}才です。")
    }
}

package com.example.chap36

import com.example.chap35.Person
import org.example.Person1
import org.example.Person2

fun main(args: Array<String>) {
    run  {
        println("-----36.1-----")
        val p = Person1()
        p.greet()
    }
    run {
        println("-----36.2-----")
        val p = Person2()
        p.greet()
        p.greet2()
    }
}

class  Person3{
    var name = ""
}
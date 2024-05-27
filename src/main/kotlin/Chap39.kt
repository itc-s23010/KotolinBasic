package com.example.chap39

fun main(args: Array<String>) {
    run {
        println("----39.1----")
        val plus1: (Double, Double) -> Double = fun(x: Double, y: Double): Double { return x + y }
        val plus2: (Double, Double) -> Double = fun(x: Double, y: Double) = x + y
        val plus3: (Double, Double) -> Double = { x, y -> x + y }
        val result1 = plus1(10.0, 2.0)
        val result2 = plus2(10.0, 2.0)
        val result3 = plus3(10.0, 2.0)

        println(result1)
        println(result2)
        println(result3)
    }

    run {
        println("----39.2----")
        printResult({ x, y -> x + y })
    }

    run {
        println("----39.3----")
        val function2: (String) -> String = fun(x) = x + "ちゃん"
        val function3: (String) -> String = { x -> x + "ちゃん" }
        val function4: (String) -> String = { it + "ちゃん" }

        println(function2("たけし"))
        println(function3("たけし"))
        println(function4("たけし"))
    }
    run {
        println("----39.4----")
        val list = listOf("あ","い","う","え","お")
        list.forEach { println(it) }

    }
}

fun printResult(calculator: (Double, Double) -> Double) {
    val result = calculator(10.0, 2.0)
    println("計算結果:　$result" )
}
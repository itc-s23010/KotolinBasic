package com.example.chap37

import kotlin.random.Random

fun main(args: Array<String>) {
    val p = ::calculatePlus
    val m = ::calculateMinus
    printRandomValuesCalclation(p)
    printRandomValuesCalclation(m)
}

fun calculatePlus(x: Double, y: Double) = x + y
fun calculateMinus(x: Double, y: Double) = x - y

fun printRandomValuesCalclation(calculator: (Double, Double) -> Double) {
    val x = Random.nextDouble()
    val y = Random.nextDouble()
    val result = calculator(x, y)
    println("$x　と $y　の計算結果は $result　です。")
}

fun getCalculator(type: String): (Double, Double) -> Double {
    val p = fun(x: Double, y: Double) = x + y
    val m = fun(x: Double, y: Double) = x - y
    return { x, y -> p(x + p, y + m) }
}
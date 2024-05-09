package org.example

fun main(Args : Array<String>) {
    val score = readln().toInt()

    //成績判定
    //0 ~ 59 D
    //60 ~ 69 C
    //70 ~ 79 B
    //80 ~ 89 A
    //90 ~ 100 S
    //それ以外　エラー

    if (score > 100 || score < 0) {
        println("エラー")
    } else if (score <= 59) {
        println("D")
    } else if (score <= 69) {
        println("C")
    } else if (score <= 79) {
        println("B")
    } else if (score <= 89) {
        println("A")
    } else {
        println("S")
    }
}
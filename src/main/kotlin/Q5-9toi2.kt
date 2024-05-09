package org.example

import kotlin.random.Random

fun main(Args : Array<String>) {

    print("1グー、2チョキ、3パーを選んでください:")

    val player = readln().toInt()-1

    val cpu = Random.nextInt(0,3)

    if (player == cpu){
        println("あいこ")
    } else if (player == 0 &&  cpu == 1) {
        println("かち")
    } else if (player == 1  && cpu == 2) {
        println("かち")
    } else if (player == 2  && cpu == 0) {
        println("かち")
    } else {
        println("まけ")
        }
    println("あなたは"+ (player+1) + "、相手は" + (cpu+1) +"を出しました")
    }


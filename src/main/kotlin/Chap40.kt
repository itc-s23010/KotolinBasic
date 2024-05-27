package com.example.Chap40

fun main(args: Array<String>) {
    run {
        println("----40.1----")
        val list = listOf(
            Person("たけし",5),
            Person("けんた",5),
            Person("ゆみ",8)
        )
        var pMax: Person? = null
        for (p in list) {
            if (pMax == null || pMax.age < p.age) {
                pMax = p
            }
        }
        println("最年長は誰？")
        pMax?.greet()
    }
}
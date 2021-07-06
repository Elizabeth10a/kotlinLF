package kT.OOP

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/2 0:09
* @Software : IntelliJ IDEA
*/
//枚举类
enum class Week {
    x1, x2, x3, x4, x5, x6, x7, x8, x9
}

fun main(args: Array<String>) {
    println(Week.x1.ordinal) // 0
    println(Week.x1) // x1
}

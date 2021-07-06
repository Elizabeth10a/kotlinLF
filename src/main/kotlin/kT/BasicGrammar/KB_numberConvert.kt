package kT.BasicGrammar

import kotlin.math.roundToInt

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/3 2:50
* @Software : IntelliJ IDEA
*/
fun main(args: Array<String>) {
    val num01: Int = "867".toInt()
//    val num02: Int = "86.7".toInt()报错
    val num02: Int? = "86.7".toIntOrNull()//返回null
    println(num02)
    """Double --->Int"""
    println(11.6.toInt())//砍头
    println(11.6.roundToInt())//四舍五入
    val format = "%.2f".format(2.4323)
    println(format)//2.43

}
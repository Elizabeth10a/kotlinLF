package kT.OOP.ClassTypes

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/6 14:57
* @Software : IntelliJ IDEA
*/

/**
 * 数据类,是专门设计用来存储数据的类
数据类提供了toString的个性化实现
==符号默认情况下，比较对象就是比较它们的引用值，数据类提供了equals和hash
Code的个性化实现
 */
data class DataClass(var x: Int, var y: Int) {
    var isInBounds = x > 0 && y > 0
}

fun main() {
//    DataClass自动重写了 toString hashCode 函数
    println(DataClass(12, 32))//@7cca494b-->DataClass(x=12, y=32)
    println(DataClass(12, 32) == DataClass(12, 32))//class false|true，比较内容equals
    println(DataClass(12, 32) === DataClass(12, 32))//class false|false，比较内引用
    println("---------------")
    val (x, y) = DataClass(12, 45)//数据类直接支持 （自带）解构语法
    println("$x,$y")
}
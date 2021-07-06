package kT.nullSafe

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/2 0:34
* @Software : IntelliJ IDEA
*/
// NULL检查机制
// Kotlin的空安全设计对于声明可为空的参数，在使用时要进行空判断处理，有两种处理方式，字段后加!! 像Java一样抛出空异常，
// 另一种字段后加?可不做处理返回值为 null或配合?:做空判断处理

// 类型后面加?表示可为空
var age: String? = "23"

// 抛出空指针异常
val ages = age!!.toInt()

// 不做处理返回 null
val ages1 = age?.toInt()

// age为空返回-1
val ages2 = age?.toInt() ?: -1
// 当一个引用可能为 null 值时, 对应的类型声明必须明确地标记为可为 null。
// 当 str 中的字符串内容不是一个整数时, 返回 null:

fun parseInt(str: String): Int? {
    // ...
    return str.toInt()
}
// 以下实例演示如何使用一个返回值可为 null 的函数:

fun main(args: Array<String>) {

    if (args.size < 2) {
        print("Two integers expected")
        return
    }
    val x = parseInt(args[0])
    val y = parseInt(args[1])
    // 直接使用 `x * y` 会导致错误, 因为它们可能为 null.
    if (x != null && y != null) {
        // 在进行过 null 值检查之后, x 和 y 的类型会被自动转换为非 null 变量
        print(x * y)
    }
}

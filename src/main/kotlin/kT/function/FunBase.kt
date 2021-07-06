package kT.function

/*
# -*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/6/21 2:30
* @Software : IntelliJ IDEA
*
*/

// 作用域的保护
// 函数嵌套

/*
定义常量与变量
    可变变量定义：var 关键字
    var <标识符> : <类型> = <初始化值>
    不可变变量定义：val 关键字，只能赋值一次的变量(类似Java中final修饰的变量)
    val <标识符> : <类型> = <初始化值>
    常量与变量都可以没有初始化值,但是在引用前必须初始化*/

/*
字符串模板
    $ 表示一个变量名或者变量值
    $varName 表示变量值
    ${varName.fun()} 表示变量的方法返回值:*/

/*    区间
    区间表达式由具有操作符形式 .. 的 rangeTo 函数辅以 in 和 !in 形成。
    区间是为任何可比较类型定义的，但对于整型原生类型，它有一个优化的实现*/
//    for (i in 1..4 step 2) print(i) // 输出“13”
//    for (i in 4..1) print(i) // 什么都不输出
//    for (i in 1 until 10) {   // i in [1, 10) 排除了 10,使用 until 函数排除结束元素

// 函数定义使用关键字 fun，参数格式为：参数 : 类型

fun sum0(a: Int, b: Int): Int { // Int 参数，返回值 Int
    return a + b
}
// 表达式作为函数体，返回类型自动推断：

fun sum1(a: Int, b: Int) = a + b
public fun sum2(a: Int, b: Int): Int = a + b // public 方法则必须明确写出返回类型

// 无返回值的函数(类似Java中的void)：
fun printSum0(a: Int, b: Int) {
    print(a + b)
}

// 如果是返回 Unit类型，则可以省略(对于public方法也是这样)：
public fun printSum1(a: Int, b: Int) {
    print(a + b)
}
// 可变长参数函数
// 函数的变长参数可以用 vararg 关键字进行标识：

fun vars0(vararg v: Int) {
    for (vt in v) {
        print(vt)
    }
}

// 测试
fun main(args: Array<String>) {
    vars0(1, 2, 3, 4, 5) // 输出12345
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y } // lambda(匿名函数)
    println(sumLambda(1, 2)) // 输出 3
}

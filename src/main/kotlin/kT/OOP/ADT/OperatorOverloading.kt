package kT.OOP.ADT

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/6 15:20
* @Software : IntelliJ IDEA
*/

/**
运算符重载
如果要将内置运算符应用在自定义类身上，你必须重写运算符函数，告诉编译器该如何操作自定义类.
 */

/**
+   plus    把一个对象添加到另一个对象里
+=  plusAssign  把一个对象添加到另一个对象里,然后将结果赋值给第一个对象
==  equals  如果两个对象相等,则返回true，否则返回false

>   compareTo   如果左边的对象大于右边的对象,则返回true，否则返回false
[ ] get  返回集合中指定位置的元素
..  rangeTo 创建一个range对象
in  contains    如果对象包含在集合里,则返回true
 */
data class OperatorOverload(var x: Int, var y: Int) {
    var isInBounds = x > 0 && y > 0

    //    重载运算符
    operator fun plus(other: OperatorOverload) = OperatorOverload(x + other.x, y + other.y)
}


fun main() {
    val c1 = OperatorOverload(12, 34)
    val c2 = OperatorOverload(12, 34)
    println(c1 + c2)//OperatorOverload(x=24, y=68)

}
package kT.OOP

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/2 2:25
* @Software : IntelliJ IDEA
*/

// 抽象类
// 抽象是面向对象编程的特征之一，类本身，或类中的部分成员，都可以声明为abstract的。抽象成员在类中不存在具体的实现。
// 注意：无需对抽象类或抽象成员标注open注解。

open class Base {
    open fun f() {}
}

abstract class Derived : Base() {
    abstract override fun f()
}

class Outer { // 外部类
    private val bar: Int = 1

    class Nested { // 嵌套类
        fun foo() = 2
    }
}

fun main(args: Array<String>) {
    val demo = Outer.Nested().foo() // 调用格式：外部类.嵌套类.嵌套类方法/属性
    println(demo) // == 2
}

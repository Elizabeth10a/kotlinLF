package kT.OOP.anonymousInnerClass

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/2 2:17
* @Software : IntelliJ IDEA
*/
class CO_AI_base

// 内部类
// 内部类使用 inner 关键字来表示。
// 内部类会带有一个对外部类的对象的引用，所以内部类可以访问外部类成员属性和成员函数。

class Outer {
    private val bar: Int = 1
    var v = "成员属性"

    /**嵌套内部类**/
    inner class Inner {
        fun foo() = bar // 访问外部类成员
        fun innerTest() {
            var o = this@Outer // 获取外部类的成员变量
            println("内部类可以引用外部类的成员，例如：" + o.v)
        }
    }
}

// 为了消除歧义，要访问来自外部作用域的 this，我们使用this@label，其中 @label 是一个 代指 this 来源的标签。
// 使用对象表达式来创建匿名内部类：

class Test {
    var v = "成员属性"

    fun setInterFace(test: TestInterFace) {
        test.test()
    }
}

/**
 * 定义接口
 */
interface TestInterFace {
    fun test()
}

fun main(args: Array<String>) {
//    内部类
    val demo = Outer().Inner().foo()
    println(demo) //   1
    val demo2 = Outer().Inner().innerTest()
    println(demo2) // 内部类可以引用外部类的成员，例如：成员属性

//    匿名内部类
    var test = Test()

    /**
     * 采用对象表达式来创建接口对象，即匿名内部类的实例。
     */
    test.setInterFace(object : TestInterFace {
        override fun test() {
            println("对象表达式创建匿名内部类的实例")
        }
    })
}

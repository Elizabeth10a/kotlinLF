package kT.OOP.OC


/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/2 2:28
* @Software : IntelliJ IDEA
*/
/** Kotlin 中所有类都继承该 Any 类，它是所有类的超类，对于没有超类型声明的类是默认超类：
 */

// 注意：Any 不是 java.lang.Object。
class succceedClass//空类

class Example // 从 Any 隐式继承
/*
Any 默认提供了三个函数：
    equals()
    hashCode()
    toString()
//    不同的平台有不同的实现
*/

// 如果一个类要被继承，可以使用 open 关键字进行修饰。
open class Base(p: Int) // 定义基类
class Derived(p: Int) : Base(p)

// 构造函数
/**如果子类有主构造函数， 则基类必须在主构造函数中立即初始化。
 */
open class Person(var name: String, var age: Int) { // 基类
}

class Student(name: String, age: Int, var no: String, var score: Int) : Person(name, age) // 直接初始化基类


// 如果子类没有主构造函数，则必须在每一个二级构造函数中用 super 关键字初始化基类，或者在代理另一个构造函数。
// 初始化基类时，可以调用基类的不同构造方法。
/**如果有多个相同的方法（继承或者实现自其他类，如A、B类），则必须要重写该方法，使用super范型去选择性地调用父类的实现。
 */

/**属性重写使用 override 关键字，属性必须具有兼容类型，每一个声明的属性都可以通过初始化程序或者getter方法被重写：*/
open class Foo1 {
    open val x: Int
        get() = x + 1
}

class Bar1 : Foo1() {
    override val x: Int = 1
}

/**你可以用一个var属性重写一个val属性，但是反过来不行。因为val属性本身定义了getter方法，重写为var属性会在衍生类中额外声明一个setter方法
 */ // 你可以在主构造函数中使用 override 关键字作为属性声明的一部分:

interface Foo0 {
    val count: Int
}

class Bar0(override val count: Int) : Foo0

class Ba01 : Foo0 {
    override var count: Int = 0
}

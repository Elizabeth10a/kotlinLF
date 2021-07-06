package kT.OOP.OC

import java.io.File

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/6 14:23
* @Software : IntelliJ IDEA
*/

/**
 * 对象声明有利于组织代码和管理状态，尤其是管理整个应用运行生命周期内的某些一致性
 * 状态。
 */
//单例对象
object ObjectDeclaration {
    init {
        println("init...........")
    }


    fun doSomething() {
        println("do something...........")

    }
}

open class Anonymous {
    /**如果你想将某个对象的初始化和一个类实例捆绑在一起，可以考虑使用伴生对象，使用companion修饰符，
     * 你可以在一个类定义里声明一个伴生对象，一个类里只能有一个伴生对象。static静态的实现
     */
    companion object {
        private const val PATH =
            "E:\\Code\\JAVA\\kotlinL\\kotlinLF\\src\\main\\kotlin\\kT\\OOP\\succeedAndPolymorphism\\text.txt"

        fun lodeFiles() {
            File(PATH).readBytes()
            println("lodeFiles----")

        }
    }


    open fun lodings() = "lodings -----"
}


fun main() {
    ObjectDeclaration.doSomething()
    //同意个对象
    println(ObjectDeclaration)//@7cca494b
    println(ObjectDeclaration)//@7cca494b
    println("---------")
    /**有时候你不一定非要定义一个新的命名类不可，也许你需要某个现有类的一种变体实例，但只需用一次就行了，
     * 事实上，对于这种用完就丢的类实例，连命名都可以省了。
     * 这个对象表达式是XX的子类，这个匿名类依然遵循object关键字的一个规则，即一旦实例化，该匿名类只能有唯一一个实例
    存在。
     */
    val an = object : Anonymous() {
        override fun lodings() = "object loading--"
    }
    println(an.lodings())
    println("----伴生对象-------")
    //不调用就不会 实例化
    Anonymous.lodeFiles()//lodeFiles----
    println(Anonymous.lodeFiles())//lodeFiles---- kotlin.Unit
    //多次调用也只实例化一次，单例调用
}

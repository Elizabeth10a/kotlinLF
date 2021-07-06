package kT.OOP.ClassTypes

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/6 14:51
* @Software : IntelliJ IDEA
*/
class NestedClass {
    /**如果一个类只对另一个类有用，那么将其嵌入到该类中并使这两个类保持在一起是合
    乎逻辑的，可以使用嵌套类。
     */
    class Player {
        class Equipment(var name: String) {
            fun show() = println("Equipment:$name")

        }

        class Battle {}


    }
}

fun main() {
    NestedClass.Player.Battle()
    //java中之后static 类型的才可以直接 类名.类名.调用
    NestedClass.Player.Equipment("流星蝴蝶剑").show()
}
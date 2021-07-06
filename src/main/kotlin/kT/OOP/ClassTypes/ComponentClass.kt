package kT.OOP.OC

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/6 15:13
* @Software : IntelliJ IDEA
*/

/**解构声明的后台实现就是声明component1、component2等若干个组件函数，
 * 让每个函数负责管理你想返回的一个属性数据，如果你定义一个数据类，它会自动为所有定义在主构造函数的属性添加对应的组件函数。
 */
class ComponentClass {
}

class PlayScore(val experience: Int, val level: Int) {
    //    组件函数
    operator fun component1() = experience
    operator fun component2() = level

}

fun main() {
//    val (x, y)=PlayScore(10, 23)//不支持
    val (x, y) = PlayScore(10, 23)//使用组件函数便支持
    println("$x,$y")

}
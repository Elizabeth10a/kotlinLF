package kT.OOP.trustAndAgent

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/6/29 21:50
* @Software : IntelliJ IDEA
*/

/*
委托是把事情托付给别人或别的机构办理
    代理是指以他人的名义，在授权范围内进行对被代理人直接发生法律效力的法律行为。
    代理的产生，可以是受他人委托
*/
interface IWashBowling {
    fun washings()
}
class Child : IWashBowling {
    override fun washings() {
        println("儿子洗碗很痛苦")
    }
}

class Father : IWashBowling {
    override fun washings() {
        println("父亲洗碗很痛苦")
    }
}

class Mother : IWashBowling by Father() {

    // 代理
    // 什么都不写-->父亲洗碗很痛苦
    override fun washings() {
        println("驱使父亲,是boss")
        Father().washings() // 让父亲来做
        println("看着Father洗完了")
    }
}

fun main(args: Array<String>) {
    var child = Child()
    var mother = Mother()
    mother.washings()
    println("-----------------")
    child.washings()
}

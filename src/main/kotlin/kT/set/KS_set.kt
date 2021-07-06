package kT.set

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/4 4:03
* @Software : IntelliJ IDEA
*/


class KS_set {
    fun set0() {
        val set = setOf(12, 12, 32, 35)//不允许重复
        val toMutableSet = set.toMutableSet()
        println(set)//[12, 32, 35]
        println(set.elementAt(2))
        println(set.elementAtOrNull(3))//不存在报null
        println(set.elementAtOrNull(3) ?: "不存在")//不存在报null
        println(set.elementAtOrElse(3) { "越界了" })

    }

    fun mutableSet() {
        var mutableSet = mutableSetOf(12, 12, 32, 3)
        mutableSet += 23
        val list = listOf(12, 12, 32, 35)//不允许重复
        val toSet = list.toSet()//list-->set去重复
        println(list)
        println(toSet)
//函数队列
        val toList0 = listOf(12, 12, 32, 3).toSet().toList()
        val toList1 = listOf(12, 12, 32, 3).distinct()//去重

    }
}

fun main() {
    KS_set().set0()
    KS_set().mutableSet()
}
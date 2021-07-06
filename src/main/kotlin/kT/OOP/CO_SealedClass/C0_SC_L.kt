package kT.OOP.CO_SealedClass

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/2 0:14
* @Software : IntelliJ IDEA
*/

// 驴+驴=驴
// 驴+马=骡子
//
// 印章类、密封类,子类类型有限的class
sealed class Son {
    fun show() {
        println("okkk")
    }

    class luozi() : Son()

    class xiaolv() : Son()
}

fun main(args: Array<String>) {
//    val s: Son = Son()/不能直接使用Son -->密封类
    val s: Son = Son.luozi()
    val s1: Son = Son.luozi()

    val z: Son = Son.xiaolv()
    var list = listOf<Son>(s, s1, z)
    for (v in list) {
        if (v is Son.luozi) {
            v.show()
        }
    }
}

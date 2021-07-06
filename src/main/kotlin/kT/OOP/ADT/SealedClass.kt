package kT.OOP.ADT

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/2 0:14
* @Software : IntelliJ IDEA
*/

// 驴+驴=驴
// 驴+马=骡子
//
// 印章类、密封类,子类类型有限的class
/**对于更复杂的ADT，你可以使用Kotlin的密封类(sealed class）来实现更复杂的定义，
密封类可以用来定义一个类似于枚举类的ADT，但你可以更灵活地控制某个子类型。
密封类可以有若干个子类，要继承密封类，这些子类必须和它定义在同一个文件里。
 */
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

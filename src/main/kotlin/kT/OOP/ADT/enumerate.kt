package kT.OOP

import kT.OOP.ADT.OperatorOverload


/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/2 0:09
* @Software : IntelliJ IDEA
*/
//枚举类
enum class Week {
    x1, x2, x3, x4, x5, x6, x7, x8, x9
}


enum class Directions(private val opp: OperatorOverload) {
    //初始化，//可以用来表示一组子类型的闭集，枚举类就是一种简单的ADT（代数数据类型）。
    EAST(OperatorOverload(1, 0)),
    WEST(OperatorOverload(-1, 0)),
    SOUTH(OperatorOverload(0, -1)),
    NORTH(OperatorOverload(0, 1));

    //函数
    fun updateOperator(op: OperatorOverload) = OperatorOverload(op.x + opp.x, op.y + opp.y)
}

enum class LicenseStatus {
    //枚举--->添加属性-->密封
    UNQUALIFIED,//不合格，
    LEARING,
    QUALIFIED;
}
class Driver(var status: LicenseStatus) {
    fun checkLicense(): String {
        return when (status) {//需要添加其他分支
            LicenseStatus.UNQUALIFIED -> "没资格"
            LicenseStatus.LEARING -> "在学"
            LicenseStatus.QUALIFIED -> "有资格"
        }
    }
}

fun main(args: Array<String>) {
    println(Week.x1.ordinal) // 0
    println(Week.x1) // x1
    println(Week.x1 is Week)
    println("------------")
    println(Directions.EAST.updateOperator(OperatorOverload(2, 2)))
    println("------------")
    val checkLicense = Driver(LicenseStatus.QUALIFIED).checkLicense()
    println(checkLicense)

}

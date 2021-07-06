package kT.nullSafe

import java.util.*

/*
# -*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/6/19 16:39
* @Software : IntelliJ IDEA
*/
/*
    在Java中我们司空见惯的空指针异常NullPointerException，带给了我们很多麻烦。Kotlin作为更强大的语言，势必会基于以往的语言设计经验对其进行改良。
        Kotlin更多地把运行时可能会出现的null问题，以编译时错误的方式，提前在编译期强迫我们
        重视起来，而不是等到运行时报错，防范于未然，提高了我们程序的健壮性。

  对于null值问题，Kotlin反其道而行之，除非另有规定，变量不可为null值，这样一来，运行时崩溃从根源上得到解决。      */

@ExperimentalStdlibApi
fun main() {
    var str = ""
    var strNull: String? = "" // 加个？ 表示可空类型
//    str = null//不能给一个变量赋值为空
    strNull = null

/*  Kotlin区分可空类型和非可空类型，所以，你要一个可空类型变量运行，而它又可能不存在，对于这种潜在危险，编译器时刻警惕着。
    为了应对这种风险,Kotlin不允许你在可空类型值上调用函数，除非你主动接手安全管理。*/
// 选项一:安全调用操作符

/*这次Kotlin不报错了，编译器看到有安全调用操作符，所以它知道如何检查null值。
        如果遇到null值，它就跳过函数调用,而不是返回null。*/
//    str.capitalize()
//    仅仅调用一次
    // 首字母大写
//    This declaration is experimental and its usage must be marked with '@kotlin.ExperimentalStdlibApi' or '@OptIn(kotlin.ExperimentalStdlibApi::class)'
    println(str.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
    println(strNull?.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }) // 不报错且nullN
// 选项二:使用带let的安全调用
/*  安全调用允许在可空类型上调用函数，但是如果还想做点额外的事，
    比如创建新值，或判断不为null就调用其他函数，怎么办?可以使用带let函数的安全调用操作符。
    你可以在任何类型上调用let函数，它的主要作用是让你在指足的作用域内足乂一个或多个变量。*/
    str = str?.let {
        if (it.isNotBlank()) { // 如果非空白字符串
            it.capitalize()
        } else { // 给个默认值
            "butterfly" // 最后一行作为返回值
        }
    }
    println(str) // butterfly
}

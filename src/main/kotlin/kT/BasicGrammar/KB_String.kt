package kT.BasicGrammar

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/1 15:00
* @Software : IntelliJ IDEA
*/

fun main(args: Array<String>) {
    string01().Substing01()
    string01().split01()
    string01().replace01()
    string01().equals01()
    string01().foreach01()

}

class string01 {

    fun Substing01() {
        println("--------字符串截取--------")

        val NAME = "JACK`BJK,as"
        println(NAME.indexOf(char = 'J')) // 0
        println(NAME.indexOf(char = '`')) // 4
        println(NAME.substring(0)) //
        println(NAME.substring(0, 4)) // JACK
        println(NAME.substring(0 until 4)) // JACK
    }

    fun split01() {
        println("--------字符串拆分--------")

//        split函数返回的是List集合数据，Lst集合又支持解构语法特性，它允许你在一个表达式里给多个变量赋值，解构常用来简化变量的赋值。
        val NAME = "JACK`BJK,as,MNBS"

        val split = NAME.split("`") // 根据 ` 拆分成数组
        val split0 = NAME.split(",")
        val split1 = NAME.split("J")
        println(split + ":" + split0 + ":" + split1) // [JACK, BJK,as, :, JACK`BJK, as, :, , ACK`B, K,as]
        val (A, B, C) = NAME.split(",") // 直接将数组数据赋值,左少右多的话报错，左多右少前值
        println("$A,$B,$C") // JACK`BJK,as,MNBS
    }

    fun replace01() {
        println("-------字符串提替换--------")

        val NAME = "JACK`BJK,as,MNBS,agk+JKH"
        val replace = NAME.replace(Regex("[aJBKS]")) {
            when (it.value) {
                "a" -> "88"
                "J" -> "JJ"
                "B" -> "BB"
                "K" -> "KK"
                "S" -> "SS"
                else -> it.value
            }
        }
        println(replace)
    }

    fun equals01() {
        println("--------字符串比较--------")
        var str1 = "Jason"
        var str2 = "Jason"
        var str3 = "jason".capitalize()
        println(str1 == str2) // true
        println(str1 === str2) // true
        println(str1 == str3) // true/内容一样
        println(str1 === str3) // false
//        字符串-- > 常量池-- > 不可变-- > 相同内容直接引用
    }

    fun foreach01() {
        println("""字符串遍历""")
        var str1 = "Jason"
        str1.forEach {
            print("$it *")//J *a *s *o *n *
        }

    }
}

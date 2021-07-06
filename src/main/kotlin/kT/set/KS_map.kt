package kT.set

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/4 4:21
* @Software : IntelliJ IDEA
*/

class KS_map {
    fun createMap() {
        /**to看上去像关键字，但事实上，它是个省略了点号和参数的特殊函数，to函数将它左边和右边的值转化成一对 Pair。
         */

        val map = mapOf("ks" to 12, "as" to 12, "sas" to 34)
        val mapOf = mapOf(Pair("as", 78))
        /**[]取值运算符，读取键对应的值，如果键不存在就返回nullI
        getValue，读取键对应的值，如果键不存在就抛出异常
        getOrElse，读取键对应的值，或者使用匿名函数返回默认值
        getOrDefault，读取键对应的值，或者返回默认值
         */
        println(map["k"])
        println(map.getValue("ks"))
        println(map.getOrElse("as") { "不存在" })
        println(map.getOrDefault("sas", "12"))//没有返回默认值,0
    }

    fun showElement() {
        val map = mapOf("ks" to 12, "as" to 12, "sas" to 34)
        map.forEach {
            println("${it.key},${it.value}")
        }
        map.forEach { (key: String, value: Int) ->
            println("$key,$value")

        }
    }

    fun mutableMap() {
//        可变map
        val map = mutableMapOf("ks" to 12, "as" to 12, "sas" to 34)
        map += "as" to 132//直接把原来的值给覆盖
        map.put("ks", 435)
        println(map)

        map["sa"] = 23
        println(map)
        map.getOrDefault("dsa") {
            "不存在"
        }

        println(map)

        map.getOrPut("s") { 23 }//没有就添加
        println(map)

    }
}

fun main() {
    KS_map().createMap()
    println("----------")
    KS_map().showElement()
    println("----------")
    KS_map().mutableMap()
}
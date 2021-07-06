package kT.StandardLibraryFunctions

import java.io.File

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/3 3:25
* @Software : IntelliJ IDEA
*/
class SLF_run {
    fun run01() {
        var files =
            File("E:\\Code\\JAVA\\kotlinL\\kotlinLF\\src\\main\\kotlin\\kT\\StandardLibraryFunctions\\SLF_apply.txt")
        val boolean = files.run {
            readText().contains("great")//文件中是否存在“great”  ，run语句返回值
        }
        println(boolean)

    }

    fun runQuote() {
        val run = "AKASg D".run(::isLong)
            .run(::showMessage)
            .run(::println)
        println(run)//true
    }

    fun isLong(name: String) = name.length >= 10
}

fun showMessage(isLong: Boolean): String {
    return isLong?.let {
        "name is too long" ?: "please rename"
    }

}

fun main(args: Array<String>) {
    SLF_run().run01()
    SLF_run().runQuote()

}



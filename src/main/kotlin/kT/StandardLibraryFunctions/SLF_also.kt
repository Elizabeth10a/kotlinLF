package kT.StandardLibraryFunctions

import java.io.File

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/3 3:47
* @Software : IntelliJ IDEA
*/
class SLF_also {
    /**also函数和let函数功能相似，和let一样，also也是把接收者作为值参传给lambda,
    但有一点不同:also返回接收者对象，而let返回lambda结果。
    因为这个差异，also尤其适合针对同一原始对象，利用副作用做事，既然also返回的是接收者对象，你就
    可以基于原始接收者对象执行额外的链式调用。
     */
    fun also01() {//作用与返回是同一个对象--额外的链式调用
        var fileContents: List<String>
        File("E:\\Code\\JAVA\\kotlinL\\kotlinLF\\src\\main\\kotlin\\kT\\StandardLibraryFunctions\\SLF_apply.txt")
            .also {
                println(it.name)
            }
            .also {
                fileContents = it.readLines()
            }//一行为集合中的一个元素
        println(fileContents)
    }

}

fun main() {
    SLF_also().also01()
}
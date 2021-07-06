package kT.StandardLibraryFunctions

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/3 3:12
* @Software : IntelliJ IDEA
*/
class SLF_let {
    fun let01(guestName: String?): String {
        return guestName?.let {
            "Welcome,$it"
        } ?: "what 's your name?   "
        /**"""let函数能使某个变量作用于其lambda表达式里，让it关键字能引用它。
        let与apply比较，let会把接收者传给lambda，而apply什么都不传，匿名函数执行完，apply会返回当前接收者，而let会返回lambda的最后一行。
        """*/

    }

    fun withoutLet() {
        val result: Int = listOf(2, 1, 3).first().let {
            it * it//it即为first（）
        }
        println(result)
        val finalElements = listOf(2, 1, 3).first()
        val result2 = finalElements * finalElements
        //中间变量
        println(result2)
    }

}

fun main(args: Array<String>) {
    println(SLF_let().let01("as"))
    println(SLF_let().let01(null))
    SLF_let().withoutLet()
}
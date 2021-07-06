package kT.StandardLibraryFunctions

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/3 3:43
* @Software : IntelliJ IDEA
*/
class SLF_with {
    /**>with函数是run的变体,他们的功能行为是一桂的，但with的调用方式不同，调用wit
    h时需要值参作为其第一个参数传入。
     */
    fun with01() {
//        with类型
        val isTooLong= with("The people's Republic of China. ") {
            length >= 10

        }
//        run类型
        val run = "assayed".run {
            length >= 10
        }
    }
}
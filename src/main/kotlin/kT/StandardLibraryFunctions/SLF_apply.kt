package kT.StandardLibraryFunctions

import java.io.File

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/3 3:06
* @Software : IntelliJ IDEA
*/
class SLF_apply {
    fun file0() {
        val file01 =
            File("E:\\Code\\JAVA\\kotlinL\\kotlinLF\\src\\main\\kotlin\\kT\\StandardLibraryFunctions\\SLF_apply.txt")

/**      apply函数可看作一个配置函数，你可以传入一个接收者,然后调用\n" +
        "系列函数来配\n" +
        "置它以便使用，如果提供lambda给apply函数执行，它会返回配置好的接收者。\n*/
        file01.setReadable(true)
        file01.setWritable(true)
        file01.setExecutable(false)
        //隐式调用
        val file02 =
            File("E:\\Code\\JAVA\\kotlinL\\kotlinLF\\src\\main\\kotlin\\kT\\StandardLibraryFunctions\\SLF_apply.txt").apply {
                /**
                可以看到，调用一个个函数类配置接收者时，变量名就省掉了，
                这是因为，在lambda表达式里，apply能让每个配置函数都作用于接收者，这种行为有时又叫做相关作用
                域，因为lambda表达式里的所有函数调用都是针对接收者的，或者说，它们是针对接收者的隐式调用。
                 */

                setReadable(true)//省略了变量名
                setWritable(true)
                setExecutable(false)
            }


    }
}
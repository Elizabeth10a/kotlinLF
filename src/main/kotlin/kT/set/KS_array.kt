package kT.set

import java.io.File

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/4 4:18
* @Software : IntelliJ IDEA
*/
/**Kotlin提供各种Array，虽然是引用类型，也可以编译成Java基本数据类型)
intArrayOf
doubleArrayOf
longArrayOf
shortArrayOf
byteArrayOf
floatArrayOf
booleanArrayOf
arrayOf
 */
class KS_array {
    fun array() {
        val intArrayOf = intArrayOf(12, 23, 56, 7)
        listOf(12, 23, 56, 7).toIntArray()
        val arrayOf = arrayOf(File("xxx"), File("yy"))

    }
}
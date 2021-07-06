package kT.OOP.OC

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/6 15:05
* @Software : IntelliJ IDEA
*/
/**除了重写Any类的部分函数，提供更好用的默认实现外，数据类还提供了一个函数，它可以用来方便地复制一个对象。假设你想创建一个Student实例，
 * 除了name属性，它拥有和另一个现有Student实例完全一样的属性值，
 * 如果Student是个数据类，那么复制现有Student实例就很简单了，只要调用copy函数，给想修改的属性传入值参就可以了。
 */
class CopyClass {
}

data class StudentCopy(var name: String, val age: Int) {
    private val hobby = "music"
    val subject: String

    init {

        println("initializing student")
        subject = "math"
    }

    constructor (_name: String) : this(_name, 10)

    override fun toString(): String {
        return "StudentCopy(name='$name', age=$age, hobby='$hobby', subject='$subject')"
    }

}
fun main() {
    val sc = StudentCopy("jack")
    val copy = sc.copy("Rose")//只有name属性变化
//    copy没有使用次构造,会导致与 普通创建对象 结果不同,.需要再次赋值
    println(sc)
    println(copy)
//    StudentCopy(name='jack', age=10, hobby='music', subject='math')
//    StudentCopy(name='Rose', age=10, hobby='music', subject='math')
}

package kT.OOP.InitClass

/**
主构造函数里声明的属性
类级别的属性赋值
init初始化块里的属性赋值和函数调用
次构造函数里的属性赋值和函数调用
 */
class InitClass(
//    主构造
    var name: String = "MR",//给予默认值

    /**Kotlin允许你不使用临时变量赋值，而是直接用一个定义同时指定参数和类属性，通
    常，我们更喜欢用这种方式定义类属性，因为他会减少重复代码。
     */
    private var _age: Int,
    var isVip: Boolean
) {

    var age = _age//仅仅使用一次的变量，_开头

    /**lateinit关键字相当于做了一个约定:在用它之前负责初始化
    只要无法确认lateinit变量是否完成初始化，可以执行isInitialized检查
     */
    lateinit var subject: String//延迟初始化,必须调用赋值，才可以后续使用，否则报错
    fun useLateInit() {
        subject = "useLateInit"
        if (::subject.isInitialized) {
            println(subject)
        }
    }

    /**延迟初始化并不是推后初始化的唯一方式，你也可以暂时不初始化某个变量，直到首
    次使用它,这个叫作惰性初始化。
     */
    val lazy by lazy { loadConfig()/*后续执行*/ }// val,懒汉式,最后才加载

    /*   just loading lazy.........
         xxx*/

    //    val lazy = loadConfig()//饿汉式,每创建一个对象,便会执行一次该操作
    /*    just loading lazy.........
          xxx
          just loading lazy.........
          xxx*/
    fun loadConfig(): String {
        println("just loading lazy.........")
        return "xxx"
    }

    /**有主就有次，对应主构造函数的是次构造函数，我们可以定义多个次构造函数来配置
    不同的参数组合。
     */
//    调用次构造函数

    constructor(name: String) : this(name, _age = 11, isVip = false) {
//        重载主构造里的属性
        this.name = name.toUpperCase()
    }

    constructor(name: String, age: Int) : this(name, age, isVip = false) {
        this.name = name.toUpperCase()
    }
//    constructor(name: String, age: Int,isVip:Boolean) : this(name, age, isVip = false) {}报错，与主构造冲突
    /**初始化块可以设置变量或值，以及执行有效性检查，如检查传给某构造函数的值是否
    有效，初始化块代码会在构造类实例时执行。
     */
    init { // 主--类--块--次
        //kotlin 编译具有顺序,不能写反
        require(age > 0) { "age must be positive" }
        require(name.isNotBlank()) { "player must be a name" }
    }
}

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/5 23:42
* @Software : IntelliJ IDEA
*/


fun main() {
    var ic = InitClass("HH", 12, true)
    //初始化块：提示 age must be positive
//    println("${ic.name},${ic.age},${ic.isVip}")
    println(ic.name + ic.age + ic.isVip)//HH

    var ic2 = InitClass("AA")
    println("${ic2.name},${ic2.age}")//AA,11-->给予的默认值

    var ic3 = InitClass("CC", 12)
    println("${ic3.name},${ic3.age}")
    ic3.useLateInit()

    println(ic3.lazy)

}
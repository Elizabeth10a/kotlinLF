package kT // 作用域保护

/*
# -*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/6/21 0:53
* @Software : IntelliJ IDEA
*
*/

// 函数名,参数,参数类型--参数,函数作为参数(具有函数体的变量-->JS)
fun showInfo(goodsName: String, getWord: (String, Int) -> String) { // 仅考虑参数和返回值
    // 内联：替换成java-->复制函数定义的代码进行替换传参
    val hour = (1..24).shuffled().last() // 1..24随便取一个
    println(getWord(goodsName, hour))

/*
    lambda可以让你更灵活地编写应用，但是，灵活也是要付出代价的。
        在JVM上(你定义的lambda会以对象实例的形式存在NJVM会为所有同lambda打交道的变量分配内存，这就产生了内存开销。
        更糟的是，lambda的内存开销你带来性能问题。
    幸运的是，kotlin有一种优化机制叫内联，JVM就不需要使用lambda对象实例了，因而避免了变量内存分配。哪里需要使用lambda，编译器就会将函数体复制粘贴到哪里。
    使用lambda的递归函数无法内联，因为会导致复制粘贴无限循环，编译会发出警告。
*/
// C语言  预编译 宏定义,宏替换  #define MAX
}

// 匿名函数（js）
val getWord = { goodsName: String, hour: Int ->
    val year = 12
    println("fun")
    "$year 年，618$goodsName 促销倒计时：$hour"
}
val getWord01 = { goodsName: String, hour: Int ->
    val year = 12
    println("fun01")
    "$year 年，618$goodsName 促销倒计时：$hour"
}
val getWord02 = { goodsName: String, hour: Int, hour1: Int ->
    val year = 12
    println("fun02")
    "$year 年，618$goodsName 促销倒计时：$hour+$hour1"
}

// 具名函数
fun getWord03(goodsName: String, hour: Int): String { // 函数不可用作函数参数，函数返回值可以
    println("fun03")

    return "$goodsName +  $hour"
}

val la: () -> Unit = { "s" }

/*如果一个函数的lambda参数排在最后，戏者是唯一的参数，那么括住lambda值参的
一对圆括号就可以省略。
No value passed for parameter 'goodsName'
*/

/*
闭包
    在Kotlin中，匿名函数能修改并引用定义在自己的  作用域  之外的 变量，
        匿名函数引用  定义自身的函数里的  变量 ，Kotlin中的lambda就是闭包。
    能接收函数或者返回函数的函数 又叫做高级函数，高级函数广泛应用于函数式编程当中*/

// 具有返回值return,不能用val
// 函数无参数，返回值是一个 传参String 返String  的函数
private fun returnFun(): ((String) -> String) {
    val s = "as" // val s: String，会进行类型推断，若语言(JS)

    return { name: String ->
        "$name:${name.length} +$s " // 匿名函数能修改并引用定义在自己的  作用域  之外的 变量，
    } // 返回值为一个（匿名）函数//(kotlin.String) -> kotlin.String
}

val reREFun = returnFun() // (kotlin.String) -> kotlin.String的函数，使用变量reREFun接受-->即匿名函数
// 且该匿名函数：(String) -> String,传参数为 String 返回String:参数和参数的length 和 s (局部变量)

fun main() {
// 函数关系： main-->showInfo{getWord} -->

    showInfo("手巾", getWord01)
// 省略了函数名，直接将函数体传参(匿名函数)
    showInfo("手巾") { goodsName: String, hour: Int ->
        val year = 12
        println("fun")
        "$year 年，618$goodsName 促销倒计时：$hour"
    }

    //    showInfo("手巾", getWord03("getWord03", 03))//需要传入一个函数，此处为传入一个String返回值

    showInfo("getWord03", ::getWord03) // getWord03 +4 ,通过：：进行函数引用，一个具名函数转换成一个值参
    /*
    要把函数作为参数传给其他函数使用，除了传lambda表达式，kotlin还提供了其他方法，
        传递函数引用，函数引用可以把一个具名函数转换成一个值参(用于具名函数做参数)
            使用lambda表达式的地方，都可以使用函数引用。即-->：：
*/
    println(returnFun()) // (kotlin.String) -> kotlin.String的函数
    println(reREFun("reReFun")) // reReFun:7 +as
}

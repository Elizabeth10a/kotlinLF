
import kotlin.math.sqrt

// fun  函数名--参数--参数类型--返回值
fun main(args: Array<String>) {

    `hello world`()
    println(sqrt(9.0))
    println(add(3))

    stringMode("KT.AA", null)

    ifElse(3, "Abc")
    forX(10, "10")
}

fun add(x: Int): Int {
    var a: Int = -1
    return a + x
}

/*Kotlin可以使用空格和特殊字符对函数命名，不过函数名要用一对反引号括起染为了支持Kotlin和Java互操作，
而Kotlin和Java各自却有着不同的保留关键字，不能作为函数名，使用反引号括住函数名就能避免任何冲突。*/
fun `hello world`() {
    println("hello world")
}

// 字符串
fun stringMode(GG: String, CC: String?) { // 加上 ? 表示可以为空
    println("GG:$GG，GG长度：${GG.length}" + "--CC:$CC，${CC?.length}--END!!")
    println("${GG}与$CC：==:" + GG == CC)
    println("${GG}与$CC：equals:" + GG.equals(CC)) // equals 有true为true
}

// 条件语句
// if else
fun ifElse(x: Int, y: String) {
    if (x > y.length) {
        println("${x}最长，y长为：${y.length}")
    } else if (x < y.length) {
        println("${y}最长，y长为：${y.length}")
    } else {
        print("你们一样短")
    }
    var x = x

    while (x > 0) {
        x--
        println("$x")
    }
    when (x) {
        0 -> println("$x:0")
        1 -> println("$x:1")
        2 -> println("$x:2")
    }
    when (y) {
        "10" -> println("$y:${y.length}")
        "9" -> println("$y:${y.length}")
        else -> println("阿哲")
    }
}

// 循环
fun forX(x: Int, y: String) {
//    var nums = 1..100//1~100,闭区间
    var nums = 1 until 100 // 左闭右开

    var result = 0
    for (num in nums) {
        result += num
    }
    println(result)
}

/*//具名函数
fun res(name: String, age: Int = 2) {//定义时赋值
    res(name = "al", age)//命名值传参
}*/

// TODO函数的任务就是抛出异常，就是永远别指望它运行成功，返回Nothing类型。
// public inline fun TOD0(reason: String): Nothing = throw NotImplementedError

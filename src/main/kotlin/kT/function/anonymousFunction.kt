/*
# -*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/6/20 15:04
* @Software : IntelliJ IDEA
*
*/
/*
定义时不取名字的函数，我们称之为匿名函数，匿名函数通常整体传递给其他函数，
或者从其他函数返回。

匿名函数对Kotlin来说很重要，有了它，我们能够根据需要制定特殊规则，轻松定制
标准库里的内置函数。
*/
fun main() {
    val total = "mississippi".count()
    val totalS = "mississippi".count { letter -> // 匿名函数
        letter == 's'
    }
    println(total)
    println(totalS)
/*
    匿名函数也有类型，匿名函数可以当作变量赋值给函数类型变量，就像其他变量一样，
    匿名函数就可以在代码里传递了。变量有类型，变量可以等于函数，函数也会有类型。
        函数的类型，由传入的参数和返回值类型决定。

*/
    // 变量的类型是一个匿名函数,无参,返回字符串
    val bless: () -> String = { // 变量类型对的函数
        // 函数体
        val holiday = "ssad"
        "awa$holiday"
/*
        和具名函数不一样，除了极少数情况外，匿名函数不需要return关键字来返回数据，
        匿名函数会隐式或自动饭回函数体最后一行语句的结果。
        lambda:
        函数作为一个整体--》匿名函数
        关键字删掉-参数列表和方法体之间加入-->-*/
    }
/*    和具名函数一样，匿名函数可以不带参数，‘也可以带一个或多个任何类型的参数）需
    要带参数时，参数的类型放在匿名函数的类型定义中，参数名则放在函数定义中。*/

//    函数名, 参数类型, 返回值类型。        参数名字
    val bless01: (String) -> String = { name -> // 不可以用private等权限修饰符
        val holiday = "New Year"
        "$name,appy $holiday" // 最后一行作为返回值返回
    }
    val stringLenth: (String) -> Int = { string ->
        string.length
    }
    println(stringLenth("as"))
/*---------------it关键字-----------------*/
/*---------------类型推断-----------------*/
//    定义只有一个参数的匿名函数时，可以使用it关键字来表示参数名。当你需要传入两个值参，it关键字就不能用了。
    val stringLenth01: (String) -> Int = { it ->
        it.length
    }
// 类型推断：定义一个变量时，如果已把匿名函数作为变量赋值给它，就不需要显示指明变量类型
    val funSy: () -> String = { // 返回值类型进行推断
        "as"
    }
    val funSy01: (String, Int) -> String = { name, age ->
        // 非类型推断
        "$name:$age"
    }

    val funSy02 = { name: String, age: Int ->
        // 类型推断类型推断也支持带参数的匿名函数，但为了帮助编译器更准确地推断变量类型，匿名
        // 函数的参数名和参数类型必须有.
        "$name:$age"
    }
    val funSy03 = { NAME: String ->
        "aSD"
    }
    println(funSy01("funSy01", 1))
    println(funSy02("funSy02", 12))
}

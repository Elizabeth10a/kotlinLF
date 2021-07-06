package kT.set

/*-*- coding:utf-8 -*-
* @Author  : ygree
* @Time    : 2021/7/4 3:20
* @Software : IntelliJ IDEA
*/
class KS_list {
    fun list01() {
        val list = listOf(12, 32, 35)
        /**getOrElse是一个安全索引取值 函数，它需要两个参数，第- -个是索引值， 第二个是能提
        供默认值的lambda表达式，如果索引值不存在的话，可用来代替异常。
        getOrNull是Kotlin提供的另- -个安全索引取值函数，它返回null结果， 而不是抛出异常。
         */

//        不可变集合
//        list[2] = 12
//        println(list[3])//索引越界

        println(list.getOrElse(3) { "越界了" })//索引越界
        println(list.getOrNull(3))//null
        println(list.getOrNull(3) ?: "越界了")//null
        val toList = list.toMutableList()//转换为可变列表
        toList[2] = 12
        println(list)


    }

    fun list02() {
        /**在Kotlin中，支持内容修改的列表叫可变列表,要创建可变列表，可以使用mutableListOf函数。
         * List还支持使用toList和toMutableList函数动态实现只读列表和可变列表的相互转换。
         */
//        liveData
        val list = mutableListOf(12, 32, 35)
        list.add(23)
        list.remove(12)//[32, 35, 23]
        println(list)
        list[2] = 12
        val toList = list.toList()//转行为不可变列表
//        toList[2] = 12

    }

    fun mutableList() {
        /**能修改可变列表的函数有个统一的名字:mutator函数
        添加元素运算符与删除元素运算符（还记得C++中的运算符重载吗?)
        基于lambda表达式指定的条件删除元素
         */

        val list = mutableListOf(12, 32, 35)
        val lists = mutableListOf("1235", "as", "d", "1234")
        list += 23//==list.add(23)
        list -= 35
        println("list:$list")

//        list.removeIf { it.contains("12") }//int 不能使用
        lists.removeIf { it.contains("12") }//如果包含的话即移除->String型，it：即集合中的每个元素
//        包含字符“12”的 元素全部移除
        println("lists:$lists")


    }

    //遍历元素
    fun forElement() {
        val lists = mutableListOf("1235", "as", "d", "1234")
        for (s in lists) {
            print("$s,")
        }
        lists.forEach {
            print("$it,")
        }
        lists.forEachIndexed { index, item ->
            print("$index,$item")
        }

    }

    fun jiegou() {
        val lists = mutableListOf("1235", "as", "d", "1234")
        var (a, b, c, d) = lists
        var (aa, _, _, dd) = lists//_跳过该元素

        println("$a,$b,$c,$d")
        println("$aa,$dd")
    }
}

fun main() {
    KS_list().list01()
    println("-----------------")
    KS_list().list02()
    println("-----------------")
    KS_list().mutableList()
    println("-----------------")
    KS_list().jiegou()

}
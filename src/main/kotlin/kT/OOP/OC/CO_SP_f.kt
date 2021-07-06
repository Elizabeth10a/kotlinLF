package kT.OOP.OC

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/6/29 21:01
* @Software : IntelliJ IDEA
*/

// 接口是事物的能力
// 抽象类是事物的本质
// 接口
interface IBiological {
    abstract fun sleep()
    fun eat() {
        println("生物需要获取能量")
    }

    fun genitals() {
        print("生物的繁殖")
    }
}

// 抽象类
abstract class APeople : IBiological {
    abstract override fun sleep()
    override fun eat() {
        println("人必须要吃东西")
    }

    override fun genitals() {
        println("人要繁殖后代")
    }
}

open class Father(name: String) : APeople(), IBiological {
    // open 允许继承或重写
    var name: String = name
    var time: Int = 1
    override fun sleep() {
        println("$name 睡觉到 $time 点")
    }

    override fun genitals() {
        println("有$name 才有儿子")
    }
}

// 继承,
class Children(name: String) : Father(name) {
    // 具有少数主构造函数参数的类可以写成一行：
    override fun sleep() {
        println("$name 起来学习")
    }
}
fun main(args: Array<String>) {
    var father = Father(name = "大明")
    father.time = 1
    father.sleep()
    println("-------children------")
    var children01 = Children(name = "小明") // 继承父类，具有父类的属性和方法
    children01.sleep() // 没有进行赋值，结果为默认值
    children01.sleep() // 子类重写之后，调用默认为 重写之后的方法
    father.sleep()
}

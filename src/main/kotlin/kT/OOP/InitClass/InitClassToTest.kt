package kT.OOP

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/6/29 20:39
* @Software : IntelliJ IDEA
*/
// 类的修饰符
// 类的修饰符包括 classModifier 和_accessModifier_:

// classModifier: 类属性修饰符，标示类本身特性。
/*
    abstract    // 抽象类  
    final       // 类不可继承，默认属性
    enum        // 枚举类
    open        // 类可继承，类默认是final的
    annotation  // 注解类
    accessModifier : 访问权限修饰符*/
/*
    private    // 仅在同一个文件中可见
    protected  // 同一个文件中或子类可见
    public     // 所有调用的地方都可见
    internal   // 同一个模块中可见

*/
// 文件名：example.kt

// package foo
private fun foo() {} // 在 example.kt 内可见
public var bar: Int = 5 // 该属性随处可见
internal val baz = 6 // 相同模块内可见

class text(
    var name: String,
    var age: Int = 0,
    var isVip: Boolean,
    var isType: Boolean = false

) {
//    constructor(name: String, age: Int){}不存在主构造
    /**
     * 如果类存在主构造方法，就必须在次构造方法后调用this方法，将方法委托给主构造方法，即如果从次构造方法中进来后，还需要再次进入主构造方法：
     *调用顺序： 1-->2-->```n
    两个次构造方法相互委托，会出现错误提示：There is a cycle in the delegation calls chain----委托调用链中有一个循环。*/
//n this(n,n+1)，打破循环,参数顺序依赖于主构造
//    在调用超类构造函数之前无法访问“年龄”

//    constructor(name: String) : this(name, age = 1)//需要初始化赋值，没初始化的需要手动初始化
//    constructor(此次构造) : this(其余次构造)
    constructor(name: String) : this(name, age2 = 1)

//        constructor(name2: String, age2: Int) : this(name2, age2, isVip = false)
    constructor(name2: String, age2: Int) : this(name2, age2, isVip3 = false)

    //    constructor(name3: String, age3: Int, isVip3: Boolean) : this(name3, age3, isVip3, isType = false)
    constructor(name3: String, age3: Int, isVip3: Boolean) : this(name3, age3, isVip3, isType = false)
}

class text2 {
    var name: String? = ""
    var age: Int = 0
    var isVip: Boolean = false
    var isType: Boolean = false


    /**
     * 如果类存在主构造方法，就必须在次构造方法后调用this方法，将方法委托给主构造方法，即如果从次构造方法中进来后，还需要再次进入主构造方法：
     *调用顺序： 1-->2-->```n
    两个次构造方法相互委托，会出现错误提示：There is a cycle in the delegation calls chain----委托调用链中有一个循环。*/
//n this(n,n+1)，打破循环,参数顺序依赖于主构造
//    在调用超类构造函数之前无法访问“年龄”

//    constructor(name: String) : this(name, age = 1)//需要初始化赋值，没初始化的需要手动初始化
//    constructor(name: String, age: Int){}不存在主构造
//    constructor(name3: String, age3: Int, isVip3: Boolean) : this(name3, age3, isVip3, isType = false)
//    创建对象的调用顺序先调用的主构造函数->直接代理主函数的构造函数->间接代理主函数的构造函数->我们调用的构造函数。

    /**可以看到，我们可以使用this关键字来调用自己的其他构造器，并且需要注意它的语法形式，次级构造器: this(参数列表)
    可以使用super关键字来调用父类构造器，当然这块内容我们放到继承那块再来介绍。*/
    // (n):(n-1){}
    // (1){}
    constructor(name: String) {//此为尽头
        this.name = name
    }

    constructor(name: String, age: Int) : this(name) {
        this.name = name
        this.age = age


    }


    constructor(name: String, age: Int, isVip: Boolean) : this(name, age) {
        this.name = name
        this.age = age
        this.isVip = isVip

    }

    //没有主构造，此为封顶
    constructor(name: String, age: Int, isVip: Boolean, isType: Boolean) : this(name, age, isVip) {
        this.name = name
        this.age = age
        this.isVip = isVip
        this.isType = isType
    }


}

class text3 {
    var name: String? = ""
    var age: Int = 0
    var isVip: Boolean = false
    var isType: Boolean = false


    /**
     * 如果类存在主构造方法，就必须在次构造方法后调用this方法，将方法委托给主构造方法，即如果从次构造方法中进来后，还需要再次进入主构造方法：
     *调用顺序： 1-->2-->```n
    两个次构造方法相互委托，会出现错误提示：There is a cycle in the delegation calls chain----委托调用链中有一个循环。*/
//n this(n,n+1)，打破循环,参数顺序依赖于主构造
//    在调用超类构造函数之前无法访问“年龄”

//    constructor(name: String) : this(name, age = 1)//需要初始化赋值，没初始化的需要手动初始化
//    constructor(name: String, age: Int){}不存在主构造
//    constructor(name3: String, age3: Int, isVip3: Boolean) : this(name3, age3, isVip3, isType = false)
//    创建对象的调用顺序先调用的主构造函数->直接代理主函数的构造函数->间接代理主函数的构造函数->我们调用的构造函数。

    /**可以看到，我们可以使用this关键字来调用自己的其他构造器，并且需要注意它的语法形式，次级构造器: this(参数列表)
    可以使用super关键字来调用父类构造器，当然这块内容我们放到继承那块再来介绍。*/
    // (n):(n-1){}
    // (1){}
    constructor(name: String) {//此为尽头
        this.name = name
    }


    //没有主构造，此为封顶
    constructor(name: String, age: Int, isVip: Boolean, isType: Boolean) : this(name) {
        this.name = name
        this.age = age
        this.isVip = isVip
        this.isType = isType
    }


}

fun main() {
    var text11 = text("text11")
    var text12 = text("text12", 12)
    var text13 = text("text13", 13, true)
    var text14 = text("text14", 14, true, true)
    println("${text11.name},${text11.age},${text11.isVip},${text11.isType}")
    println("${text12.name},${text12.age},${text12.isVip},${text12.isType}")
    println("${text13.name},${text13.age},${text13.isVip},${text13.isType}")
    println("${text14.name},${text14.age},${text14.isVip},${text14.isType}")
    println("------")
    var text21 = text2("text21")
    var text22 = text2("text21", 21)
    var text23 = text2("text22", 22, true)
    var text24 = text2("text23", 23, true, true)
    println("${text21.name},${text21.age},${text21.isVip},${text21.isType}")
    println("${text22.name},${text22.age},${text22.isVip},${text22.isType}")
    println("${text23.name},${text23.age},${text23.isVip},${text23.isType}")
    println("${text24.name},${text24.age},${text24.isVip},${text24.isType}")

    println("------")

    var text31 = text2("text31")
    var text32 = text2("text32", 32)
    var text33 = text2("text33", 33, true)
    var text34 = text2("text34", 34, true, true)
    println("${text31.name},${text31.age},${text31.isVip},${text31.isType}")
    println("${text32.name},${text32.age},${text32.isVip},${text32.isType}")
    println("${text33.name},${text33.age},${text33.isVip},${text33.isType}")
    println("${text34.name},${text34.age},${text34.isVip},${text34.isType}")

}
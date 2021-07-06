package kT.OOP

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/6/29 18:58
* @Software : IntelliJ IDEA
*/

/**
var是一个可变变量，这是一个可以通过重新分配来更改为另一个值的变量。这种声明变量的方式和Java中声明变量的方式一样。
具体使用:
var a: Int? = null//定义可为null
var b: Any = Any()//定义类型为Any(就是Object).不可为null
var c: String? = null//定义可为null
lateinit var d: String//定义类型为String,延迟初始化,不能为基本类型数据
val是一个只读变量，这种声明变量的方式相当于java中的final变量。一个val创建的时候必须初始化，因为以后不能被改变。
val e:String ="val"
 */

class Empty // 空类

// 使用普通函数那样使用构造函数创建类实例：
val site = Empty() // Kotlin 中没有 new 关键字

// 类的属性可以在其声明或主体中列出。
// 用基本的数据类型描述复杂的事物描述矩形
// 描述妹子

/**Koltin中的类可以有一个 主构造器，以及一个或多个次构造器，主构造器是类头部的一部分，位于类名称之后:*/
// 如果主构造器没有任何注解，也没有任何可见度修饰符，那么constructor关键字可以省略。
class Rectangle( // 主构造器
    // 类的属性可以用关键字 var 声明为可变的，否则使用只读关键字 val 声明为不可变。
    private var height: Double,
    var length: Double
//    构造函数参数从不用作属性
//    Constructor parameter is never used as a property
) {

    /* 
    属性声明的完整语法：
        var <propertyName>[: <PropertyType>] [ = <property_initializer>]
        [<getter>]
        [<setter>] 
            getter 和 setter 都是可选
            如果属性类型可以从初始化语句或者类的成员函数中推断出来，那就可以省去类型，val不允许设置setter函数，因为它是只读的。*/

    //    var allByDefault: Int? // 错误: 需要一个初始化语句, 默认实现了 getter 和 setter 方法
    var initialized = 1 // 类型为 Int, 默认实现了 getter 和 setter

    //    val simple: Int? // 错误 类型为 Int ，默认实现 getter ，但必须在构造函数中初始化
    val inferredType = 1 // 类型为 Int 类型,默认实现 getter
    var perimeter = (height + length) * 2
}

class Girl {
    // 包含两个可变变量 lastName 和 no，lastName 修改了 getter 方法，no 修改了 setter 方法。
// Kotlin 中类不能有字段。提供了 Backing Fields(后端变量) 机制,备用字段使用field关键字声明,field 关键词只能用于属性的访问器
    var lastName: String = "zhang"
        get() = field.toUpperCase() // 将变量赋值后转换为大写
        set // Redundant setter 冗余

    var no: Int = 100
        get() = field // 后端变量
        set(value) {
            if (value < 10) { // 如果传入的值小于 10 返回该值
                field = value
            } else {
                field = -1 // 如果传入的值大于等于 10 返回 -1
            }
        }

    var height: Float = 145.4f
        private set
}

// 设置默认值-构造->创建对象可以仅输入前面的部分参数

//    Property is explicitly assigned to parameter module, can be declared directly in constructor
//    属性显式分配给参数模块，可以直接在构造函数中声明
class Boy constructor(firstName: String) {
    /**主构造器中不能包含任何代码，初始化代码可以放在初始化代码段中，初始化代码段使用 init 关键字作为前缀。*/
    init {
        println("FirstName is $firstName")
    }

    //    非空属性必须在定义的时候初始化,kotlin提供了一种可以延迟初始化的方案,使用 lateinit 关键字描述属性：
    lateinit var subject: Any

    fun setup() {
        subject = String()
    }

    fun test() {
        subject.toString() // dereference directly,直接取消引用
    }
}


/**注意：主构造器的参数可以在初始化代码段中使用，也可以在类主体n定义的属性初始化代码中使用。
//    一种简洁语法，可以通过主构造器来定义属性并初始化属性值（可以是var或val）：*/

class Runoob constructor(
    //    如果构造器有注解，或者有可见度修饰符，这时constructor关键字是必须的，注解和修饰符要放在它之前。

    name: String
) { // 类名为 Runoob
    // 大括号内是类体构成
    var url: String = "http://www.runoob.com"
    var country: String = "CN"
    var siteName = name

    init {
        println("初始化网站名: $name")
    }

    /** 次构造函数.类也可以有二级构造函数，需要加前缀 constructor:
    //    如果类有主构造函数，每个次构造函数都要，或 直接 或 间接 通过另一个 次构造函数 代理 主构造函数。
    //    在同一个类中代理另一个构造函数使用 this*/

    // 次构造函数
    constructor (name: String, alexa: Int) : this(name) {
        println("Alexa 排名 $alexa")
    }

    fun printTest() {
        println("我是类的函数")
    }
}

/**注意：在 JVM 虚拟机中，如果主构造函数的所有参数都有默认值，编译器会生成一个附加的无参的构造函数，这个构造函数会直接使用默认值。
// 这使得 Kotlin 可以更简单的使用像 Jackson 或者 JPA 这样使用无参构造函数来创建类实例的库。*/
class Customer(val customerName: String = "")

// 如果一个非抽象类没有声明构造函数(主构造函数或次构造函数)，它会产生一个没有参数的构造函数。
// 构造函数是 public 。如果你不想你的类有公共的构造函数，你就得声明一个空的主构造函数：
class DontCreateMe private constructor()

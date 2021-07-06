package kT.OOP.InitClass

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/6 0:28
* @Software : IntelliJ IDEA
*/
/**
主构造函数里声明的属性
类级别的属性赋值
init初始化块里的属性赋值和函数调用
次构造函数里的属性赋值和函数调用
 */

class InitClassSequence(
    //主构造
    _name: String,
    var age: Int
) {
    //属性赋值
    var name = _name
    var score = 10
    var subject: String
    private val hobby = "music"

    //初始化块
    init {
        println("initializing ----")
        subject = "math"
    }

    //次构造
    constructor(_name: String) : this(_name, 10) {
        score = 20
    }
/*-->java
* public InitClassSequence(@NotNull String _name, int age) {
      Intrinsics.checkNotNullParameter(_name, "_name");
      super();
      this.age = age;
      this.name = _name;
      * -------------------------
      this.score = 10;
      this.hobby = "music";
      * ---------------
      String var3 = "initializing ----";
      boolean var4 = false;
      System.out.println(var3);
      this.subject = "math";
   }

   public InitClassSequence(@NotNull String _name) {
      Intrinsics.checkNotNullParameter(_name, "_name");
      this(_name, 10);
      this.score = 20;
   } */
}

fun main() {
    var ics = InitClassSequence("jack")
    println("${ics.name},${ics.age},${ics.score},${ics.subject}")
//    jack,10,20,math
    var ics1 = InitClassSequence("jack", 12)

}
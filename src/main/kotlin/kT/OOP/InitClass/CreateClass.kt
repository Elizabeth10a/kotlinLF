package kT.OOP.InitClass

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/7/5 23:21
* @Software : IntelliJ IDEA
*/
class CreateClass {
    //    属性的get set 方法
    var name: String? = ""
        get() = field?.capitalize()
        set(value) {
            field = value?.trim()
        }

    /**针对你定义的每一个属性，Ktlin都会产生一个field、一个getter、以及-个setter，field用来存储属性数据，
    你不能直接定义field，Kotlin会封装field，保护它里面的数据，只暴露给getter和setter使用。
    属性的getter方法决定你如何读取属性值，每个属性都有getter方法，
    setter方法决定你如何给属性赋值，所以只有可变属性才会有setter方法，尽管
    Kotlin会自动提供默认的getter和setter方法，但在需要控制如何读写属性数据时，你也可以自定义他们。
     */
    /*
    @NotNull
   private String name = "";

   @NotNull
   public final String getName() {
      return StringsKt.capitalize(this.name);
   }

   public final void setName(@NotNull String value) {
      Intrinsics.checkNotNullParameter(value, "value");
      boolean var3 = false;
      this.name = StringsKt.trim((CharSequence)value).toString();
   }*/
    var words: String? = "hello"
    fun showwords() {
        words?.also {
            println("hello ${it.toUpperCase()}")
        }
    }
}

/**如果一个类属性既可空又可变，那么引用它之前你必须保证它非空
一个办法是用also标准函数
also函数和let函数功能相似，和let一样，also也是把接收者作为值参传给lambda,
但有一点不同:also返回接收者对象，而let返回lambda结果。
因为这个差异，also尤其适合针对同一原始对象，利用副作用做事，既然also返回的是接收者对象，你就
可以基于原始接收者对象执行额外的链式调用。
 */


fun main() {
    var cc = CreateClass()
    cc.name = "sdd"//实际上调用的是 set方法,      cc.setName("sdd");


}
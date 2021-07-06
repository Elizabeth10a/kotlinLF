package kT.OOP


/*-*- coding:utf-8 -*-
* @Author  : ygree
* @Time    : 2021/7/2 0:09
* @Software : IntelliJ IDEA
*/


//密封类，    //枚举--->添加属性-->密封
sealed class LicenseStatus2 {
    //一组类型，继承于密封类
    object UnQualified : LicenseStatus2()//单例,没有属性
    object Learning : LicenseStatus2()
    class Qualified(val licenseId: String) : LicenseStatus2()//有资格才会有·id

}

class Driver2(var status: LicenseStatus2) {
    fun checkLicense(): String {
        return when (status) {//需要添加其他分支
            is LicenseStatus2.UnQualified -> "没资格"
            is LicenseStatus2.Learning -> "在学"
            is LicenseStatus2.Qualified -> "有资格，编号：${(this.status as LicenseStatus2.Qualified).licenseId}"


            else -> ""
        }
    }
}

fun main(args: Array<String>) {
    val learning = LicenseStatus2.Learning
    val driver2 = Driver2(learning)
    println(driver2.checkLicense())
    println("----------------")
    val qualified = LicenseStatus2.Qualified("23442")
    println(qualified.licenseId)
    println(Driver2(qualified).checkLicense())


}

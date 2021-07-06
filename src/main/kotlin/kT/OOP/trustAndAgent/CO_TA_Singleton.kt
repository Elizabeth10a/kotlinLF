package kT.OOP.trustAndAgent

/*-*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/6/29 22:39
* @Software : IntelliJ IDEA
*/

/*-*- coding:utf-8 -*-
* @Author  : ygree
* @Time    : 2021/6/29 21:50
* @Software : IntelliJ IDEA
*/

/*
委托是把事情托付给别人或别的机构办理
    代理是指以他人的名义，在授权范围内进行对被代理人直接发生法律效力的法律行为。
    代理的产生，可以是受他人委托
*/
interface ISWashBowling {
    fun washings()
}

class SChild : ISWashBowling {

    override fun washings() {
        println("儿子洗碗很痛苦")
    }
}

object SFather : ISWashBowling {
    // class-->object代理为同一个,直接在内存创建,有且仅有一个
    override fun washings() {
        println("$this 父亲洗碗很痛苦")
    }
}

class SMother : ISWashBowling by SFather { // SFather()-->SFather.表示有且仅有一个

    // 代理
    // 什么都不写-->父亲洗碗很痛苦
    override fun washings() {
        println("驱使父亲,是boss")
        SFather.washings() // 让父亲来做，SFather()-->SFather.表示有且仅有一个
        println("看着Father洗完了")
    }
}

fun main(args: Array<String>) {
    var father01 = SFather
//    var father02 = SFather() 有且仅有一个

    var schild01 = SChild()
    var smother01 = SMother()
    var smother02 = SMother()
    smother01.washings()
    smother02.washings()
    println(schild01.equals(smother02)) // false
    println(smother01 == smother02) // false
// 每当mother调用一次 washings()方法，就会创建一个临时对象
    // 想使每次代理是 同一个对象
}

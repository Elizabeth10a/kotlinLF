package kT.function

import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement

/*
# -*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/6/21 11:09
* @Software : IntelliJ IDEA
*
*/
class mysqlKotlinLink {
    var statement: Statement = TODO()
    var cn: Connection

    public fun add(x: String, y: Int): String {
        println("as")
        return y.toString()
    }

    // 链接数据库并返回链接对象->Connection cn
    public fun connectMysql(mysql: String, user: String, psw: String) {
        try {
            Class.forName("com.mysql.jdbc.Driver")
            val sqlUrl = "jdbc:mysql://localhost:3306/$mysql"
            this.cn = DriverManager.getConnection(sqlUrl, user, psw)
            this.statement = cn.createStatement()
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
    }
}

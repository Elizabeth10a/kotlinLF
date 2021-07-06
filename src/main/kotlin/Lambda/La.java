package Lambda;/*
# -*- coding:utf-8 -*-
* @Author  : ygree 
* @Time    : 2021/6/20 23:47
* @Software : IntelliJ IDEA
*
*/

//()-->{}


public class La {

    interface Parent {
        public abstract void AS(String a);
    }

    public void printSome(String something, Parent parent) {
        parent.AS(something);

    }

    public static void main(String[] args) {
        La la = new La();
        Parent parent = new Parent() {
            //重写接口方法
            @Override
            public void AS(String a) {
                System.out.println(a);

            }
        };

        la.printSome("KT.AA", parent);
        //lambda           （参数）->{函数体}
        //
        Parent parent1 = (String val) -> {
            System.out.println(val);

        };
        la.printSome("BB", parent1);

        Parent parent2 = (val) -> {//去掉参数类型
            System.out.println(val);

        };
        Parent parent3 = val -> {//去掉括号(仅仅只有一个参数,一行函数体时)
            System.out.println(val);

        };
        Parent parent4 = val -> System.out.println(val);
        //lambda 化简
//        接口没有参数：() ->
        la.printSome("CC", val -> System.out.println(val));
        la.printSome("CC", System.out::println);

    }


}




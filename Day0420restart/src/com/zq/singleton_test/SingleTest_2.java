package com.zq.singleton_test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-30 20:27
 **/
/*
    单例设计模式的懒汉式
 */


public class SingleTest_2 {
    public static void main(String[] args) {

        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2); //true

    }
}


class Order {

    //1.私有化类的构造器
    private Order() {

    }

    //2.声明当前类对象，没有初始化
    //4.此对象必须声明为static的
    private static Order instance = null;

    //3.声明public的static的声明当前类对象的方法
    public static Order getInstance(){

        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }

}



















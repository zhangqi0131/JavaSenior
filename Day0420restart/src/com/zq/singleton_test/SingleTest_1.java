package com.zq.singleton_test;

/**
 * @program: JavaSenior
 * @description: 单例设计模式
 * @author: Zhang.Qi
 * @create: 2021-04-30 20:18
 **/

public class SingleTest_1 {

    public static void main(String[] args) {

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();  //bank1和bank2是同一个对象

    }
}

//饿汉式
class Bank {

    //1.私有化类的构造器,避免在类的外面调用构造器
    private Bank() {

    }

    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static Bank instance = new Bank();

    //3.提供公共的静态的方法，返回类的对象
    public static Bank getInstance() {
        return instance;
    }


}
































package com.zq.jichu.java1;

/**
 * 使用同步机制将单例模式中的懒汉模式改写为线程安全的
 */
public class BankTest {

}

//单例模式
class Bank {
    private Bank() {
    }//构造器私有化

    private static Bank instance = null;//私有的静态属性


    public static Bank getInstance() {   //共有的静态获取对象方法
        //方式一：效率稍差
//        synchronized (Bank.class) {
//            if (instance == null) {
//
//                instance = new Bank();//实例化
//            }
//            return instance;
//        }

        //方式二：效率更高s
        if (instance == null) {

            synchronized (Bank.class) {
                if (instance == null) {

                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
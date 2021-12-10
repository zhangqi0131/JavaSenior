package com.zq.jichu.java1;

/**
 * 使用同步机制将单例模式中的懒汉模式改写为线程安全的
 */

public class BankTEest01 {
}


//单例模式
class Bank01 {
    private Bank01() {
    }//构造器私有化

    private static Bank01 instance = null;//私有的静态属性

    //方式三：单例模式
    public static synchronized Bank01 getInstance() {   //共有的静态获取对象方法
        if (instance == null){

            instance = new Bank01();
        }

        return instance;

        //方式一：效率稍差
//        synchronized (Bank.class) {
//            if (instance == null) {
//
//                instance = new Bank();//实例化
//            }
//            return instance;
//        }

//        //方式二：效率更高
//        if (instance == null) {
//
//            synchronized (Bank.class) {
//                if (instance == null) {
//
//                    instance = new Bank01();
//                }
//            }
//        }
//        return instance;

    }
}
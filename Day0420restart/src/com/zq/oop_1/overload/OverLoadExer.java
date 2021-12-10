package com.zq.oop_1.overload;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-25 15:13
 **/

public class OverLoadExer {

    //如下三个方法构成重载
    public void mOL(int i) {
        System.out.println(i * i);
    }

    public void mOL(int i, int j) {
        System.out.println(i * j);
    }

    public void mOL(String s) {
        System.out.println(s);
    }


    //如下三个方法构成重载
    public int max(int i, int j) {
        return (i > j)? i : j;
    }

    public double max(double i, double j) {
        return (i > j)? i : j;
    }

    public double max(double i, double j, double k) {
        double max = (i > j)? i : j;
        return (max > k)? max : k;
    }
}























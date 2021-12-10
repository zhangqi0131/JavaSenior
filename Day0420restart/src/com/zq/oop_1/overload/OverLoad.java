package com.zq.oop_1.overload;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-25 14:27
 **/

/**
 * 重载：在同一个类中，允许存在一个以上的同名方法，只要
 *      它们的参数个数或者参数类型不同即可
 *
 * Arrays类中重载的 sort()  / binarySearch()
 */
public class OverLoad {

    public static void main(String[] args) {

        OverLoad test = new OverLoad();
        test.getSum(1, 2);
    }




    //如下的方法构成重载
    public void getSum(int i, int j) {
        System.out.println("1");
    }

    public void getSum(double d1, double d2) {
        System.out.println("2");
    }

    public void getSum(String s, int i) {
        System.out.println("3");
    }

    public void getSum(int i, String s) {
        System.out.println("4");
    }
}

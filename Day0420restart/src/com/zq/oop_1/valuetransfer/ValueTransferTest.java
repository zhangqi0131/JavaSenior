package com.zq.oop_1.valuetransfer;

/**
 * @program: JavaSenior
 * @description: 方法的形参的传递机制
 * @author: Zhang.Qi
 * @create: 2021-04-25 22:56
 **/

/**
 * 方法的形参的传递机制
 * 1.形参：方法定义时，声明的小括号内的参数
 * 2.实参：方法调用时，实际传递给形参的值
 *
 * 3.值传递机制：如果参数是基本数据类型，此时实参赋给形参的是实参真是存储的数据
 */
public class ValueTransferTest {
    public static void main(String[] args) {

        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ",n = " + n);

        //交换两个变量的值
//        int temp = m;
//        m = n;
//        n = temp;

        ValueTransferTest test = new ValueTransferTest();
        test.swap(m, n);
        System.out.println("m = " + m + ",n = " + n);
    }


    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }
}




































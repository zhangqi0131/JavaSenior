package com.zq.jichu.string;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-21 09:47
 **/

public class StringTest {
    public static void main(String[] args) {
        String str1 = 3.5f + "";
        System.out.println(str1);

        int num1 = 10;
        int num2 = 20;

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1为:" + num1 + "num2为:" + num2);



        int n1 = 12;
        int n2 = 30;
        int n3 = -23;

        int max1 = (n1 > n2)? n1 : n2;
        int max2 = (max1 > n3)? n2 : n3;
        System.out.println("最大数为：" + max2);
    }
}

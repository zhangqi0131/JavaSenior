package com.zq.jichu.iftest;

import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description:输入三个数，用ifelse排序，从小到大输出
 * @author: Zhang.Qi
 * @create: 2021-04-22 10:09
 **/

public class IfTest2 {
    public static void main(String[] args) {
        //scanner实例化
        Scanner scan = new Scanner(System.in);

        System.out.println("输入第一个整数：");
        int num1 = scan.nextInt();

        System.out.println("输入第二个整数：");
        int num2 = scan.nextInt();

        System.out.println("输入第三个整数：");
        int num3 = scan.nextInt();

        if (num1 > num2) {
            if (num3 > num1) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else if (num3 < num2) {
                System.out.println(num3 + "," + num2 + "," + num1);
            } else {
                System.out.println(num2 + "," + num3 + "," + num1);

            }
        } else {
            if (num3 > num2) { System.out.println(num1 + "," + num2 + "," + num3); }
            else if(num3 < num1) { System.out.println(num3 + "," + num1 + "," + num2); }
            else { System.out.println(num1 + "," + num3 + "," + num2); }
        }


    }
}



















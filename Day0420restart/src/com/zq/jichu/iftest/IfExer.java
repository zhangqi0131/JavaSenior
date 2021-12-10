package com.zq.jichu.iftest;

import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-22 12:14
 **/

public class IfExer {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("输入身高：cm");
        int height = scan.nextInt();
        System.out.println("输入财富：千万");
        double wealth = scan.nextDouble();

        //方式一：
//        System.out.println("帅吗：true/false");
//        boolean isHandsom = scan.nextBoolean();
//
//        if (height >= 180 && wealth >= 1 && isHandsom) {
//            System.out.println("Yes!");
//        } else if (height >= 180 || wealth >= 1 || isHandsom) {
//            System.out.println("勉强可以吧。。");
//        } else {
//            System.out.println("No!");
//        }

        //方式二：
        System.out.println("是否帅：是/否");
        String isHandsom = scan.next();

        if (height >= 180 && wealth >= 1 && isHandsom.equals("是")) {
            System.out.println("Yes!");
        } else if (height >= 180 || wealth >= 1 || isHandsom.equals("是")) {
            System.out.println("勉强可以吧。。");
        } else {
            System.out.println("No!");
        }
    }
}





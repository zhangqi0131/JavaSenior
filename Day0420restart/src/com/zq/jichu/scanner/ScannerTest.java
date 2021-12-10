package com.zq.jichu.scanner;

import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-22 09:18
 **/

public class ScannerTest {
    public static void main(String[] args) {

        //1.Scanner的实例化
        Scanner scan = new Scanner(System.in);

        //2.调用Scanner的类的相关方法，来获取指定类型的变量
        System.out.println("输入姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("输入年龄：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("输入体重");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("是否愿意：true/false");
        boolean will = scan.nextBoolean();
        System.out.println(will);


        //char型的获取，没有指定的方法，只能获取字符串
        System.out.println("性别：男/女");
        String gender = scan.next();
        char genderChar = gender.charAt(0); //获取索引位置为0的字符
        System.out.println(genderChar);

    }
}






















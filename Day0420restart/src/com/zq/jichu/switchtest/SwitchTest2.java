package com.zq.jichu.switchtest;

import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description:输入一个日期，几月几号，判断这天是2019年的第几天
 * @author: Zhang.Qi
 * @create: 2021-04-22 15:21
 **/

public class SwitchTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入2019年的month：");
        int month = scan.nextInt();
        System.out.println("请输入2019年的day：");
        int day = scan.nextInt();

        int sumDays = 0;

        //方式一：冗余
        //定义一个变量来保存总天数
//        if (month == 1) {
//            sumDays = day;
//        } else if (month == 2) {
//            sumDays = 31 + day;
//        } else if (month == 3) {
//            sumDays = 31 + 28 + day;
//        } else if (month == 4) {
//            sumDays = 31 + 29 + 31 +day;
//        }


        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }
        System.out.println("2019年" + month + "月" + day + "日是第" + sumDays + "天");

    }

}



























package com.zq.jichu.switchtest;

import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description:输入年、月、日，判断这一天是当年的第几天
 * 设计闰年判断：1.可以被4整除，但不能被100整除
 *            2.可以被400整除
 * @author: Zhang.Qi
 * @create: 2021-04-22 15:45
 **/

class SwitchExer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入year：");
        int year = scan.nextInt();
        System.out.println("请输入month：");
        int month = scan.nextInt();
        System.out.println("请输入day：");
        int day = scan.nextInt();

        int sumDays = 0;


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
//                sumDays += 28;
                //判断闰年
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    sumDays += 29;
                } else {
                    sumDays += 28;
                }
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }
        System.out.println("2019年" + month + "月" + day + "日是第" + sumDays + "天");

    }
}



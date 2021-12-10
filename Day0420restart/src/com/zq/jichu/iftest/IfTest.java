package com.zq.jichu.iftest;

import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-22 09:49
 **/

public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("输入成绩：(0-100)");
        int score = scan.nextInt();

        if (score == 100) {
            System.out.println("奖励一辆BMW");
        } else if(score > 80 && score <= 99) {
            System.out.println("奖励一台手机");
        } else if (score >= 60 && score <=80) {
            System.out.println("奖励ipad");
        } else {
            System.out.println("没有奖励");
        }


    }
}

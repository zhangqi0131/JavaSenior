package com.zq.jichu.fortest;

import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-22 19:58
 **/

public class ForWhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positiveNum = 0;
        int negativeNum = 0;

        while (true) {
            int number = scan.nextInt();

            if (number > 0) {
                positiveNum++;
            } else if (number < 0) {
                negativeNum++;
            } else
            break;
        }

        System.out.println("输入的正数个数为：" + positiveNum);
        System.out.println("输入的负数个数为：" + negativeNum);
    }

}

package com.zq.jichu.fortest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-22 22:28
 **/

public class ForTest5 {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        //上半部分
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            //输出“*”
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //下半部分
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 4 - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}















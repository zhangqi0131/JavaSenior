package com.zq.jichu.fortest;

/**
 * @program: JavaSenior
 * @description:输出1-150以内的3/5/7的倍数，并分别做上标记
 * @author: Zhang.Qi
 * @create: 2021-04-22 16:20
 **/

public class ForTest1 {
    public static void main(String[] args) {
        for (int i = 0; i < 150; i++) {
            System.out.print(i + "  ");

            if (i % 3 == 0) {
                System.out.print("aa ");
            }
            if (i % 5 == 0) {
                System.out.print("bb ");
            }
            if (i % 7 == 0) {
                System.out.print("cc  ");
            }
            System.out.println();
        }
    }
}

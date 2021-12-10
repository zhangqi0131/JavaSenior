package com.zq.jichu.fortest;

/**
 * @program: JavaSenior
 * @description: 99乘法表
 * @author: Zhang.Qi
 * @create: 2021-04-22 22:47
 **/

public class NineTable {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}

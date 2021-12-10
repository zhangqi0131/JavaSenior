package com.zq.jichu.fortest;

import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description:输入两个正整数 m，n，求出其最大公约数和最小公倍数
 * @author: Zhang.Qi
 * @create: 2021-04-22 16:32
 **/

public class ForTest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入第一个正整数：");
        int m = scan.nextInt();

        System.out.println("输入第二个正整数：");
        int n = scan.nextInt();

        //获取最大公约数
        int min = (m <= n)? m:n;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(i);
                break; //一旦找到，就跳出循环，即为最大的
            }
        }

        //获取最小公倍数
        int max = (m >= n)? m:n;
        for (int j = max; j < m * n; j++) {
            if (j % m == 0 && j % n == 0) {
                System.out.println(j);
                break;
            }
        }

    }
}

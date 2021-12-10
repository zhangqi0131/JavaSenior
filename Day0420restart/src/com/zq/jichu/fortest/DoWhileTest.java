package com.zq.jichu.fortest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-22 19:43
 **/

public class DoWhileTest {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        int count = 0;
        do {
            if (num % 2 == 0) {
                System.out.println(num);
                sum += num;
                count++;
            }
            num ++;
        } while (num < 100);

        System.out.println(sum);
        System.out.println(count);
    }
}

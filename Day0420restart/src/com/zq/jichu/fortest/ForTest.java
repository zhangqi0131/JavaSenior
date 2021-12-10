package com.zq.jichu.fortest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-22 16:08
 **/

public class ForTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("aaa");


        }
        //遍历100以内的偶数,输出所有偶数的和,输出偶数的个数
        int sum = 0;
        int count = 0;//记录偶数的个数
        for (int j = 1; j < 101; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
                sum += j;
                count++;

            }
        }
        System.out.println("总和为：" + sum);
        System.out.println("个数为：" + count);
    }
}

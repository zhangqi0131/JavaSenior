package com.zq.jichu.fortest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-23 10:00
 **/

public class PrimeNumber3 {
    public static void main(String[] args) {

        //获取当前时间距1970:1:1:00:00:00的毫秒数
        long start = System.currentTimeMillis();
        int count = 0;

        label:for (int i = 2; i <= 100000; i++) { //遍历100以内的自然数
            //算法优化，对本身是质数的自然数有效
            for (int j = 2; j <= Math.sqrt(i); j++) { //j: 被i去除

                if (i % j == 0) {  //i被j除尽了
                    continue label;
                }
            }
            //能执行到此步骤的，都是质数
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数个数为：" + count);
        System.out.println("花费的时间为：" + (end - start));
    }
}


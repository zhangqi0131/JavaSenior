package com.zq.jichu.fortest;

/**
 * @program: JavaSenior
 * @description: 质数：只能被1或者其本身整除的自然数  从2开始到这个数-1，都不能被这个数整除
 * @author: Zhang.Qi
 * @create: 2021-04-22 23:14
 **/

public class PrimeNumber {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) { //遍历100以内的自然数
            boolean isFlag = true;
            for (int j = 2; j < i; j++) { //j: 被i去除

                if (i % j == 0) {  //i被j除尽了
                    isFlag = false;
                }
            }
            if (isFlag == true) {
                System.out.println(i);
            }
        }
    }
}

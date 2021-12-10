package com.zq.jichu.fortest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-23 09:31
 **/

public class PrimeNumber1 {

        public static void main(String[] args) {

            //获取当前时间距1970:1:1:00:00:00的毫秒数
            long start = System.currentTimeMillis();

            for (int i = 2; i <= 100000; i++) { //遍历100以内的自然数

                boolean isFlag = true;

                                //算法优化，对本身是质数的自然数有效
                for (int j = 2; j <= Math.sqrt(i); j++) { //j: 被i去除

                    if (i % j == 0) {  //i被j除尽了
                        isFlag = false;
                        break;  //优化一：i除尽了一个j，就不用再往下除了，已经不是质数了，只对非质数的自然数有效果
                    }
                }
                if (isFlag == true) {
//                    System.out.println(i);
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("花费的时间为：" + (end - start));
        }
    }
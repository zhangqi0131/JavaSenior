package com.demo;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-03-31 14:08
 **/

public class demo {
    public static void main(String[] args) {

        boolean isFlag = true;

        long start = System.currentTimeMillis();

        Label:for (int i = 2; i <= 100000 ; i++) {

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue Label;
                }
            }

//            if (isFlag == true) {
                System.out.println(i);
//            }
//            isFlag = true;
        }
        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));
    }
}

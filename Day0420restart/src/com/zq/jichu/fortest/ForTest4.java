package com.zq.jichu.fortest;

/**
 * @program: JavaSenior
 * @description: 水仙花数
 * @author: Zhang.Qi
 * @create: 2021-04-22 16:57
 **/

public class ForTest4 {
    public static void main(String[] args) {

        //输入一个三位数

        int num = 100;


        for (num = 100; num < 1000; num++) {
            int bai = num / 100;
            int shi = num % 100 / 10;
            int ge = num % 10;
            if (num == (bai * bai * bai + shi * shi * shi + ge * ge * ge)) {
                System.out.println(num);
            }
        }
    }
}

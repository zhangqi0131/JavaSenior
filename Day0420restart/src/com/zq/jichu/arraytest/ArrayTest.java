package com.zq.jichu.arraytest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-23 10:23
 **/

public class ArrayTest {
    public static void main(String[] args) {
        int[] ids;
        //1.静态初始化
        ids = new int[]{1,2,3,4};

        //2.动态初始化
        String[] names = new String[5];

        names[0] = "aaa";
        names[1] = "bbb";
        names[2] = "ccc";
        names[3] = "ddd";
        names[4] = "eee";

        System.out.println(names.length);

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
    }
}


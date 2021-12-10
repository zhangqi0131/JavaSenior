package com.zq.jichu.arraytest;

/**
 * @program: JavaSenior
 * @description: 数组中的常见异常：
 *                1.数组角标越界的异常：ArrayIndexOutOfBoundsException
 *                2.空指针异常：NullPointerException
 * @author: Zhang.Qi
 * @create: 2021-04-24 10:22
 **/

public class ArrayException {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

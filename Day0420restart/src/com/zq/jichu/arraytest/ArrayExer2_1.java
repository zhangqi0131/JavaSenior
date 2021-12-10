package com.zq.jichu.arraytest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-23 20:21
 **/
/*
    实现arr2对arr1数组的复制
 */
public class ArrayExer2_1 {
    public static void main(String[] args) {
        int[] arr1, arr3;

        arr1 = new int[]{2,3,5,7,11,13,17,19};

        //显示arr1的内容，遍历arr1数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

        //复制数组
        arr3 = new int[arr1.length];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i];
        }

        //修改arr3中的偶索引元素，arr[0] = 0...
        for (int i = 0; i < arr3.length; i++) {
            if (i % 2 == 0) {
                arr3[i] = i;
            }
        }
        System.out.println();

        //显示arr1的内容，遍历arr1数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}

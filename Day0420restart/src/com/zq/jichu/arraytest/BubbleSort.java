package com.zq.jichu.arraytest;

/**
 * @program: JavaSenior
 * @description: 数组的冒泡排序
 * @author: Zhang.Qi
 * @create: 2021-04-23 21:52
 **/

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[]{12,4,67,343,676,34,96,23,53,81,99};

        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}

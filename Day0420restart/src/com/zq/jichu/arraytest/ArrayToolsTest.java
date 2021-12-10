package com.zq.jichu.arraytest;

import java.util.Arrays;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-24 10:04
 **/

public class ArrayToolsTest {
    public static void main(String[] args) {

        //判断两个数组是否相等
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{2, 3, 4, 1};
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println(isEqual);

        //输出数组信息
        System.out.println(Arrays.toString(arr1));

        //将指定的值填充到数组中(全部替换)
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //二分查找
        int[] arr3 = new int[]{-90,2,32,64,73,80,88,94,234,563,666};
        int index = Arrays.binarySearch(arr3, 666);
        if (index >= 0) {
            System.out.println(index);
        } else {
            System.out.println("未找到");
        }
    }

}

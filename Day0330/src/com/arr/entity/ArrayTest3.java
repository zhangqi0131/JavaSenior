package com.arr.entity;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-04 16:04
 **/

import java.util.concurrent.ForkJoinPool;

/**
 *
 * 规定：二维数组分为外层数组的元素，内层数组的元素
 *      int[] arr = new int[4][3]
 *      外层元素：arr[0],arr[1]
 *      内层元素：arr[0][0],arr[1][2]
 *
 * 1.数组元素的默认初始化值
 * 针对于初始化方式一：int[][] arr = new int[4][3];
 *      外层元素的初始化值为：地址值
 *      内层元素初始化值为为：与一位数组初始化情况相同
 *
 * 针对于初始化方式二：int[][] arr = new int[4][];
 *      外层元素的初始化值为：null
 *      内层元素初始化值为为：不能调用，否则报错
 *
 *
 * 2.数组的内存解析
 *
 *
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        System.out.println(arr[0]); // [I@1b6d3586
        System.out.println(arr[0][0]); // 0

//        System.out.println(arr); // [[I@4554617c

        System.out.println("*********");
        float[][] arr1 = new float[4][3];
        System.out.println(arr1[0]); // [F@4554617c 地址值
        System.out.println(arr1[0][0]); // 0.0

        System.out.println("*********");
        String[][] arr2 = new String[4][2];
        System.out.println(arr2[1]); //地址值
        System.out.println(arr2[1][1]); // null

//        System.out.println("*********");
//        double[][] arr3 = new  double[4][];
//        System.out.println(arr3[1]); // null
//        System.out.println(arr3[1][0]);  //空指针异常


        int[][] arr4 = new int[][]{{1,2,3},{2,4},{4,3,2}};
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]);
            }
            System.out.println();
        }
    }
}

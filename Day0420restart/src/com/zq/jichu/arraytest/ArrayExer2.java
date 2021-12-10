package com.zq.jichu.arraytest;

/**
 * @program: JavaSenior
 * @description: 创建两个int型数组，将arr1赋值，遍历arr1
 *               赋值arr2的变量等于arr1，修改arr2中的偶索引元素，arr[0] = 0...
 *               遍历arr1
 * @author: Zhang.Qi
 * @create: 2021-04-23 20:06
 **/

/*  arr1与arr2地址相同

    思考：如何复制数组？
 */

public class ArrayExer2 {
    public static void main(String[] args) {
        int[] arr1, arr2;

        arr1 = new int[]{2,3,5,7,11,13,17,19};

        //显示arr1的内容，遍历arr1数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

        //赋值arr2的变量等于arr1
        //不能称作数组的复制
        arr2 = arr1;

        //修改arr2中的偶索引元素，arr[0] = 0...
        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 0) {
                arr2[i] = i;
            }
        }
        System.out.println();

        //显示arr1的内容，遍历arr1数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}

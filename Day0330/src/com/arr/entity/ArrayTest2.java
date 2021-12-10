package com.arr.entity;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-02 15:38
 **/

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};

        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8,}};

        String[][] arr2 = new String[3][2];

        String[][] arr3 = new String[3][];

        int[] id = new int[5];

        System.out.println(arr1[0][1]);
        System.out.println(arr2[2][1]);

        arr3[1] = new String[4];

        int[][] arr4 = new int[][]{{1,2,3},{4,5,9,10},{6,7,8,}};
        System.out.println(arr4.length);//3
        System.out.println(arr4[0].length);//3
        System.out.println(arr4[1].length);//4

        //遍历二维数组
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

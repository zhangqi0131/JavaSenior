package com.zq.jichu.arraytest;

/**
 * @program: JavaSenior
 * @description: 选择排序
 * @author: Zhang.Qi
 * @create: 2021-04-23 23:07
 **/

public class SelectionSort {
    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);

        System.out.println("输入数字的个数：");
        int number = scan.nextInt();

        int[] arr = new int[number];

        System.out.println("输入要排序的数字：");*/
        int[] arr = new int[]{23,43,65,46,74,95,6,82,12,38};
        for (int i = 1; i < arr.length; i++) {
            int select = 0;

            for (int j = 1; j <= arr.length - i; j++) {
                if (arr[j] > arr[select]) {
                    select = j;
                }
            }

            int temp = arr[arr.length - i];
            arr[arr.length - i] = arr[select];
            arr[select] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

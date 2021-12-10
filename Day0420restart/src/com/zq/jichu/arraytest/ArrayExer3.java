package com.zq.jichu.arraytest;

/**
 * @program: JavaSenior
 * @description: 数组的复制，反转，查找
 * @author: Zhang.Qi
 * @create: 2021-04-23 20:36
 **/

public class ArrayExer3 {
    public static void main(String[] args) {

        String[] arr = new String[]{"aa","bb","cc","dd","ee","ff"};

        //数组的复制
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        //数组的反转
        //方法一
//        for (int i = 0; i < arr.length / 2; i++) {
//            String temp = arr[i];
//            arr[i] = arr[arr.length - i -1];
//            arr[arr.length -i -1] = temp;
//        }

        //数组的反转
        //方法二
//        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//            String temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //查找：线性查找
        String dest = "dd";
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                System.out.println("找到指定元素，位置为" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag){
            System.out.println("没找到");
        }



        //二分法查找
        //所要查找的数组必须有序
        int[] arr2 = new int[]{-67,-23,1,23,34,58,73,87,90,494};

        int dest1 = 58;
        int head = 0;               //初始的首索引
        int end = arr2.length - 1;  //初始的末索引
        boolean isFlag1 = true;

        while (head <= end) {
            int mid = (head + end) / 2;

            if (dest1 == arr2[mid]) {
                System.out.println("找到了，位置为：" + mid);
                isFlag1 = false;
                break;
            } else if (arr2[mid] > dest1) { //要查的数比中间数小，往左边查
                end = mid - 1;
            } else { //arr2[mid] < dest1
                head = mid + 1;   //要查的数比中间数大，往右边查
            }
        }

        if (isFlag1) {
            System.out.println("没有找到");
        }

    }
}




















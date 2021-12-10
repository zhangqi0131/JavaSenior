package com.zq.oop_1;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-25 10:33
 **/

public class ArrayUtilTest {
    public static void main(String[] args) {

        ArraysUtil util = new ArraysUtil();

        int[] arr = new int[]{1,14,90,-65,83,37,52,39,68,44,99};

        int max = util.getMax(arr);
        System.out.println("最大值为：" + max);

        System.out.print("排序前：");
        util.print(arr);

        util.sort(arr);

        System.out.println();
        System.out.print("排序后：");
        util.print(arr);

        System.out.println("查找：");
        int indx = util.getIndx(arr, 68);
        if (indx > 0) {
            System.out.println("找到了，索引地址为：" + indx);
        } else {
            System.out.println("没找到");
        }
    }
}

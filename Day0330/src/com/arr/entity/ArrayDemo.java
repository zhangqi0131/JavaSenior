package com.arr.entity;

import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-02 14:40
 **/

public class ArrayDemo {
    public static void main(String[] args) {

        //1.使用Scanner，读取学生个数
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入学生人数：");
        int num = scanner.nextInt();

        //2.创建数组，存储学生成绩：动态初始化
        int[] scores = new int[num];

        //3.给数组中的元素赋值
        System.out.print("输入num" + "个学生成绩");
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();

            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }


        //4.获取数组中的元素最大值：最高分
//        for (int i = 0; i < scores.length; i++) {
//            if (maxScore < scores[i]) {
//                maxScore = scores[i];
//            }
//        }

        //5.根据每个学生成绩与最高分的差值，得到每个学生的等级，
        // 并输出等级和成绩
        char level;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore - scores[i] <= 10) {
                level = 'A';
            } else if (maxScore - scores[i] <= 20) {
                level = 'B';
            } else if (maxScore - scores[i] <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }

            System.out.println("student" + i + "score is"
                                    + scores[i] + "grade is" + level);
        }
    }
}

package com.zq.jichu.arraytest;

import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description: 从键盘读入学生成绩，找出最高分，并输出
 * @author: Zhang.Qi
 * @create: 2021-04-23 11:06
 **/

public class ArrayTest1 {
    public static void main(String[] args) {

        //1.使用Scanner,读取学生成绩
        Scanner scan = new Scanner(System.in);
        System.out.println("输入学生人数：");
        int number = scan.nextInt();

        //2.创建数组，存储学生成绩
        int score[] = new int[number];

        //3.给数组中的元素赋值
        System.out.println("输入" + number + "个学生成绩:");
        int maxScore = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = scan.nextInt();

            if (maxScore < score[i]) {
                maxScore = score[i];
            }
        }

        //4.获取数组中元素的最大值：最高分
//        int maxScore = 0;
//        for (int i = 0; i < score.length; i++) {
//        if (maxScore < score[i]) {     此部分可以移到上部分，少一次数组遍历
//            maxScore = score[i];
//        }
//        }

        //5.根据每个学生与最高分的差值，得到每个学生的等级，并输出成绩和等级
        char level;
        for (int i = 0; i < score.length; i++) {
            if (maxScore - score[i] <= 10) {
                level = 'A';
            } else if (maxScore - score[i] <= 20) {
                level = 'B';
            } else if (maxScore - score[i] <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student " + i + " score is "
                    + score[i] + ",grade is " + level);
        }

    }
}












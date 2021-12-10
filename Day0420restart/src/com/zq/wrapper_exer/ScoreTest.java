package com.zq.wrapper_exer;

import java.util.Scanner;
import java.util.Vector;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-30 14:52
 **/

public class ScoreTest {

    public static void main(String[] args) {

        //1.实例化Scanner,从键盘获取学生成绩
        Scanner scan = new Scanner(System.in);

        //2.创建Vector对象 Vector v = new Vector();
        Vector v = new Vector();

        //3.使用循环 for(; ;)    while(true) 给Vector中添加数据 v.addElement(Obj obj)
        int maxScore = 0;
        for (; ;) {
            System.out.println("请输入学生成绩(输入负数时代表输入结束)");
            int score = scan.nextInt();

            //3.2 当输入负数时，跳出循环
            if (score < 0) {
                break;
            }

            if (score > 100) {
                System.out.println("输入数据非法，重新输入");
                continue;
            }
            //3.1 添加操作 v.addElement(Obj obj)
            //5.0之前
//            Integer inScore = new Integer(score);
//            v.addElement(inScore); //多态

            //5.0之后
            v.addElement(score); //自动装箱

            //4.获取学生成绩最大值
            if (maxScore < score) {
                maxScore = score;
            }
        }

        //5.遍历Vector得到每个学生的成绩，并与最大成绩比较，得到每个学生的等级
        char level;
        for (int i = 0; i < v.size(); i++) {

            Object obj = v.elementAt(i);
            //jdk 5.0之前
//            Integer inScore = (Integer)obj;
//            int score = inScore.intValue();

            //jdk 5.0之后
            int score = (int)obj;

            if (maxScore - score <= 10) {
                level = 'A';
            } else if (maxScore - score <= 20) {
                level = 'B';
            } else if (maxScore - score <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }

            System.out.println("student -" + i + "score is:" + score + ", grade is " + level);
        }


    }
}














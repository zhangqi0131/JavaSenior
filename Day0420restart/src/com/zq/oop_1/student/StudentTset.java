package com.zq.oop_1.student;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-24 21:30
 **/

/**
 * 定义Student类，包含三个属性：学号number(int)，年级State(int),成绩Score(int)
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数决定
 * 问题1：打印出3年级（state值为3）的学生信息
 * 问题2：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 *
 * 提示：1.生成随机数，Math.random()，返回值类型为double
 *      2.四舍五入取整，Math.round(double d),返回值类型为long
 *
 */
public class StudentTset {
    public static void main(String[] args) {

        //声明一个Student类型的数组
        Student[] stud = new Student[20];
        for (int i = 0; i < stud.length; i++) {
            //给数组元素赋值
            stud[i] = new Student();

            //给Student对象的属性赋值
            stud[i].number = (i + 1);
            //年级[1,6]
            stud[i].state = (int)(Math.random() * (6 - 1 + 1 ) + 1);
            //成绩[0,100]
            stud[i].score = (int)(Math.random() * (100 - 0 + 1));
        }

        //遍历学生数组
        for (int i = 0; i < stud.length; i++) {
            System.out.println(stud[i].number + "," + stud[i].state + "," + stud[i].score);

            System.out.println(stud[i].info());
        }

        System.out.println();


        //打印出3年的学生信息
        for (int i = 0; i < stud.length; i++) {
            if (stud[i].state == 3) {
                System.out.println(stud[i].info());
            }
        }


        System.out.println("****************************");

        //使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for (int i = 0; i < stud.length - 1; i++) {
            for (int j = 0; j < stud.length - i - 1; j++) {
                if (stud[j].score > stud[j + 1].score) {
                    //换顺序，交换的是数组中的元素：Student的对象
                    Student temp = stud[j];
                    stud[j] = stud[j + 1];
                    stud[j + 1] = temp;
                }
            }
        }
        //遍历学生数组
        for (int i = 0; i < stud.length; i++) {
            System.out.println(stud[i].info());
        }
    }
}


class Student {

    int number; //学号
    int state;  //年级
    int score;  //分数

    //显示学生信息的方法
    public String info() {
        return "学号：" + number + ",年级：" + state + ",成绩：" + score;
    }


}



















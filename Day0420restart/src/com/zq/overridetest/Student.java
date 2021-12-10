package com.zq.overridetest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-28 14:54
 **/

public class Student extends Person{

    String major;

    public Student() {

    }

    public Student(String major) {
        this.major = major;
    }

    public void study() {
        System.out.println("学习，专业是：" + major);
    }

    //对父类中的eat()进行重写
    public void eat() {
        System.out.println("学生应该多吃有营养的东西");
    }
}

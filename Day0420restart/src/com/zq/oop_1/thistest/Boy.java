package com.zq.oop_1.thistest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-26 22:56
 **/

public class Boy {

    private String name;
    private int age;


    public Boy() {

    }


    public Boy(String name) {
        this.name = name;
    }


    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void marry(Girl girl) {
        System.out.println("娶：" + girl.getName());
    }

    public void shout() {
        if (this.age >= 22) {
            System.out.println("可以合法登记");
        } else {
            System.out.println("不能登记");
        }
    }
}

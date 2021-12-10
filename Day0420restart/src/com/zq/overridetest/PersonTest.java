package com.zq.overridetest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-28 14:58
 **/

public class PersonTest {
    public static void main(String[] args) {

        Student s = new Student("计算机");

        s.eat();
        s.walk(10);


        s.study();

        Person p = new Person();
        p.eat();


    }
}

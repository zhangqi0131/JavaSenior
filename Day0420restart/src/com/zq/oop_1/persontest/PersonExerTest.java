package com.zq.oop_1.persontest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-24 16:16
 **/

public class PersonExerTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "tom";
        p1.age = 19;
        p1.sex = 1;

        p1.study();

        p1.showAge();

        int newAge = p1.addAge(2);
        System.out.println(p1.name + "增长后的年龄为：" + newAge);

        System.out.println(p1.age);

        //********************************
        Person p2 = new Person();
        p2.showAge(); //0
        p2.addAge(20);
        p2.showAge();
    }
}









class Person {

    String name;
    int age;
    int sex;
    //sex:1 男性
    //sex:0 女性
    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("age" + age);
    }

    public int addAge(int i) {
        age += i;
        return age;
    }


}

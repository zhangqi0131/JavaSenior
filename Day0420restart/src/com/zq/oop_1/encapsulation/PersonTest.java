package com.zq.oop_1.encapsulation;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-26 16:29
 **/

/**
 *
 * 一、用setAge()设置人的合法年龄(0-130),用getAge()返回人的年龄
 * 在PersonTest类中实例化Person类的对象b,调用setAge()和getAge()方法
 *
 *
 * 二、在Person类中添加构造器，利用构造器设置所有人的age属性初始值为18
 *    增加name属性，使得每次创建Person对象的同时初始化对象的age属性和name
 *
 */
public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setAge(12);
        System.out.println("年龄为：" + p1.getAge());

        Person p2 = new Person("Tom" , 21);
        System.out.println("name: " + p2.getName() + "age: " + p2.getAge());

    }
}






class Person {

    private int age;
    private String name;

    public Person() {
        age = 18;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void setAge(int a) {
        if (a < 0 && a > 130) {
//            throw new RuntimeException("传入的数据非法！");
            System.out.println("传入的数据非法！");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }


    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
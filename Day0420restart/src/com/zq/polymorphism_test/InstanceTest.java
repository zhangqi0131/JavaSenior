package com.zq.polymorphism_test;


/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-29 14:09
 **/

public class InstanceTest {

    public static void main(String[] args) {


        InstanceTest test = new InstanceTest();
        test.method(new Student());
    }




    public void method(Person e) {

        //虚拟方法调用
        String info = e.getInfo();
        System.out.println(info);

        if (e instanceof Graduate) {
            System.out.println("a graduate student");
            System.out.println("a student");
            System.out.println("a person");
        } else if (e instanceof Student) {
            System.out.println("a student");
            System.out.println("a person");
        } else {
            System.out.println("a person");
        }
    }
}





class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name:" + name + "\n" + "age:" + age;
    }
}


    class Student extends Person {
        protected String school = "pku";


        public String getInfo() {
            return "Name:" + name + "\n" + "age:" + age + "\nschool:" + school;
        }
    }


    class Graduate extends Student {
        public String major = "IT";


        public String getInfo() {
            return "Name:" + name + "\n" + "age:" + age + "\nschool" + school + "\nmajor:" + major;
        }
    }





















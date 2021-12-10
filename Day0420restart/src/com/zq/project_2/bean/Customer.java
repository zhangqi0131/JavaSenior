package com.zq.project_2.bean;

/**
 * @program: JavaSenior
 * @description: Customer为实体对象，用来封装客户信息
 * @author: Zhang.Qi
 * @create: 2021-04-27 15:08
 **/

public class Customer {

    String name;//客户姓名
    char gender;//性别
    int age;//年龄
    String phone;//电话号码
    String email;//电子邮箱


    public Customer() {
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}











































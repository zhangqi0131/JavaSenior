package com.zq.oop_1;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-24 15:12
 **/

/*
    public void eat() {}         void指没有返回值
    public void sleep(int hour) {}   "int hour" 是形参
    public String getName() {}
    public String getNation(String nation) {}

方法的声明：权限修饰符，返回值类型，方法名（形参列表）{
        方法体；
    }
    注意：static,final,abstract来修饰方法


 */
public class CustomerTest {
}


//客户类
class Customer {

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat() {
        System.out.println("客户吃饭");
    }

    public void sleep(int hour) {
        System.out.println("休息了" + hour + "个小时");
    }

    public String getName() {
        return name;
    }

    public String getNation(String nation) {
        String info = "国籍是：" + nation;
        return info;
    }

}







































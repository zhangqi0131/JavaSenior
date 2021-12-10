package com.zq.wrapper_test;

import org.junit.Test;

/**
 * @program: JavaSenior
 * @description: 基本数据类型，包装类，String类的转换
 * @author: Zhang.Qi
 * @create: 2021-04-30 10:24
 **/

public class WrapperTest {

    // String类型 ---> 基本数据类型、包装类,调用包装类的 parseXxx()
    @Test
    public void test5() {
        String str1 = "123";

        int num1 = Integer.parseInt(str1);
        System.out.println(num1);


    }

    //基本数据类型、包装类 ---> String类型
    @Test
    public  void  test4() {
        int num1 = 20;
        String s1 = num1 + "123";

        float f1 = 12.3f;
        String s2 = String.valueOf(f1);


    }

    //自动装箱  JDk 5.0 新增
    @Test
    public void test3() {
        int num = 20;
        Integer in1 = 20;
    }


    //包装类 ---> 基本数据类型
    @Test
    public void test2() {
        Integer in1 = new Integer(10);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

    }


    //基本数据类型 --->包装类
    @Test
    public void test1() {

        int num = 10;
        Integer in1 = new Integer(num);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());
        System.out.println(in2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true123");
        System.out.println(b2);
    }
}

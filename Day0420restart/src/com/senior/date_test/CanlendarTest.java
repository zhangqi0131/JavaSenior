package com.senior.date_test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-08 10:12
 **/

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar日历类(抽象类)的使用
 *
 */
public class CanlendarTest {

    @Test
    public void testCalendar() {

        //1.实例化
        //方式一：创建其子类的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getClass());

        //2.常用方法
        //get()
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //set()
        calendar.set(Calendar.DAY_OF_MONTH, 20);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);  //20

        //add()
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day); //25

        //getTime()  日历类--->date类
        Date date = calendar.getTime();
        System.out.println(date); // Tue May 25 10:25:53 CST 2021

        //setTime() //date ---> 日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);  // 8

    }

}

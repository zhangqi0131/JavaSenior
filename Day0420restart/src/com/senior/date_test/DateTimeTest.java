package com.senior.date_test;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-06 22:19
 **/

public class DateTimeTest {

    /**
     * SimpleDateFormat的使用:对日期Date类的格式化和解析
     */

    @Test
    public void testSimpleDateFormat() throws ParseException {

        //1.实例化
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化： 日期 ---> 字符串
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);


        //解析
        String str = "21-5-6 下午10:36";
        Date date1 = sdf.parse(str);
        System.out.println(date1);


        //******** 按照指定格式格式化 ******************

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);

        //解析
        Date date2 = sdf1.parse("2011-05-06 10:43:09");
        System.out.println(date2);

    }
}

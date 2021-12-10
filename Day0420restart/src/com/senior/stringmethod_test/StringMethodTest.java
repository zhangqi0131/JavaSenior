package com.senior.stringmethod_test;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-05 14:56
 **/

public class StringMethodTest {

    /**
     * String与byte[]的转换
     */
    @Test
    public void test6() throws UnsupportedEncodingException {

        String str1 = "abc123中国";

        byte[] bytes = str1.getBytes(); //使用默认字符集进行编码
        System.out.println(Arrays.toString(bytes));


        byte[] gbks = str1.getBytes("gbk"); //使用gbk字符集进行编码
        System.out.println(Arrays.toString(gbks));

        System.out.println("----------------------------------");


        //时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);

        //Date类
        Date date1 = new Date();
        System.out.println(date1); //显示当前的年月日，分，秒

        System.out.println(date1.getTime()); //毫秒数

        //创建指定毫秒数的Date对象
        Date date2 = new Date(1620216754736L);
        System.out.println(date2);



    }



    /**
     * String与char[]的转换
     */
    @Test
    public void test5() {

        String str1 = "abc123";

        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        String str2 = new String(arr);
        System.out.println(str2);


    }


    @Test
    public void test4() {

        String str1 = "樱桃小完犊子学爪哇犊子";

        String str2 = str1.replace('犊', '牛');

        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.replace("犊子", "牛牛");
        System.out.println(str3);

    }


    @Test
    public void test3() {

        String s1 = "zhangqi";
        boolean b1 = s1.endsWith("iq");
        System.out.println(b1);

        boolean b2 = s1.startsWith("zh");
        System.out.println(b2);

        boolean b3 = s1.startsWith("an", 2);
        System.out.println(b3);

        String str2 = "qi";
        System.out.println(s1.contains(str2)); //是否包含一个字符串

        System.out.println(s1.indexOf("ng")); //从第几个索引开始

        System.out.println(s1.indexOf("ng", 4));


        System.out.println(s1.lastIndexOf("n"));


    }

    @Test
    public void test2() {

        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abc";
        String s4 = s3.concat("defg");  //连接
        System.out.println(s4);

        String s5 = "abc";
        String s6 = new String("abe");
        System.out.println(s5.compareTo(s6));  //比内容  -2  c-e=-2  涉及到字符串排序

        String s7 = "小和尚学爪哇";
        String s8 = s7.substring(3);
        System.out.println(s7);
        System.out.println(s8);

        String s9 = s7.substring(1, 3);
        System.out.println(s9);



    }

    @Test
    public void test1(){

        String s1 = "helloworld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));

        System.out.println(s1.isEmpty());

        String s2 = s1.toUpperCase();
        System.out.println(s2);


        String s3 = "   hello   w o r l d     ";
        String s4 = s3.trim();
        System.out.println("---" + s3 + "---");
        System.out.println("---" + s4 + "---");

    }
}








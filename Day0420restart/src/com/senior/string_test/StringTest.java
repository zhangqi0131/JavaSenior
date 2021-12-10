package com.senior.string_test;

import org.junit.Test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-05 09:45
 **/

public class StringTest {

    @Test
    public void test1() {

        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2); //比较地址值  true
    }

}

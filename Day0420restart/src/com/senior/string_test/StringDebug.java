package com.senior.string_test;

import org.junit.Test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-06 21:58
 **/

public class StringDebug {

    @Test
    public void testStringBuffer() {

        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length()); // 4

        System.out.println(sb);  // "null"

        StringBuffer sb1 = new StringBuffer(str); //抛空指针异常
        System.out.println(sb1);

    }

}

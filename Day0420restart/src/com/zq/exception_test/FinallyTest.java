package com.zq.exception_test;

import org.junit.Test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-03 16:08
 **/

public class FinallyTest {

    @Test
    public void test1() {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("11111");
        }
    }
}


















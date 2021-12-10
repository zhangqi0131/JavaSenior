package com.zq.oop_1.thistest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-26 23:24
 **/

public class BoyGirlTest {
    public static void main(String[] args) {

        Boy boy = new Boy("罗密欧", 21);
        boy.shout();

        Girl girl = new Girl("朱丽叶", 19);
        girl.marry(boy);

        Girl girl1 = new Girl("祝英台", 20);
        int compare = girl.compare(girl1);
        if (compare > 0) {

            System.out.println(girl.getName() + "年龄大");
        } else if (compare < 0) {
            System.out.println(girl1.getName() + "年龄大");
        } else {
            System.out.println("一样大");
        }
    }
}

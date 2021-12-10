package com.zq.extendsexer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-28 10:44
 **/

public class KidsTest {
    public static void main(String[] args) {

        Kid someKid = new Kid(12);

        someKid.printAge();

        someKid.setSalary(0);
        someKid.setSex(1);

        someKid.employeed();
        someKid.manOrWoman();



    }
}

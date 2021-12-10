package com.zq.extendsexer_2;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-28 10:57
 **/

public class CircleTest {

    public static void main(String[] args) {

        Cylinder cy = new Cylinder();

        cy.setRadius(2.1);
        cy.setLength(3.4);

        double volume = cy.findVolume();

        System.out.println("体积为：" + volume);


    }
}

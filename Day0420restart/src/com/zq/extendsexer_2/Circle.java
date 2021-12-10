package com.zq.extendsexer_2;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-28 10:51
 **/

public class Circle {

    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double findArea() {
        return Math.PI * radius * radius;
    }
}

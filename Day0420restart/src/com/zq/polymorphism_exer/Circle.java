package com.zq.polymorphism_exer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-29 14:43
 **/

public class Circle extends GeometricObject {

    private double radius;



    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}

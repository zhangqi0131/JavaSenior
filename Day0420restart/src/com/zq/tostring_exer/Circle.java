package com.zq.tostring_exer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-29 20:50
 **/

public class Circle extends GeometricObject{
    private  double radius;


    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
//        color = "white";
//        weight = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double findArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Circle) {
            Circle c = (Circle)obj;
            return this.radius == c.radius;

        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}

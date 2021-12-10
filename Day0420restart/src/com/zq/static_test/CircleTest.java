package com.zq.static_test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-30 19:27
 **/

public class CircleTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle(3.4);

        System.out.println("circle1的id:" + circle1.getId());
        System.out.println("circle2的id:" + circle2.getId());
        System.out.println("circle3的id:" + circle3.getId());

        System.out.println("创建的圆的个数为" + Circle.getTotal());
    }

}

class Circle {
    private double radius;
    private int id;

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
//        id = init++;
//        total++;
        this.radius = radius;
    }

    private static int total;  //记录创建的圆的个数
    private static int init = 1001;

    public double findArea() {
        return 3.14 * radius * radius;
    }

    public int getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getTotal() {
        return total;
    }
}

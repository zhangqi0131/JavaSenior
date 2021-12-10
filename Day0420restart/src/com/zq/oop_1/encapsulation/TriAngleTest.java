package com.zq.oop_1.encapsulation;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-26 20:04
 **/

public class TriAngleTest {
    public static void main(String[] args) {

        TriAngle t1 = new TriAngle();

        t1.setBase(3.0);
        t1.setHeight(4.0);
        System.out.println("base: " + t1.getBase() + ", height:" + t1.getHeight());

        TriAngle t2 = new TriAngle(3.0, 4.0);
        System.out.println("base: " + t1.getBase() + ", height:" + t1.getHeight());


    }

}



class TriAngle {

    private double base;
    private double height;


    public TriAngle() {

    }

    public TriAngle(double b, double h) {
        base = b;
        height = h;
    }



    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }

}

































package com.zq.polymorphism_exer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-29 14:35
 **/

public class GeometricObject {

    protected String color;
    protected double weight;

    public GeometricObject(String color, double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double findArea() {
        return 0.0;
    }

}








package com.zq.oop_1.circletest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-24 16:31
 **/

//测试类
public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        //方式一：
//        c1.radius = 2;
//        double area = c1.findArea();
//        System.out.println(area);

        //方式二：
        c1.radius = 2;
        c1.findArea();
    }
}



class Circle {

    //属性
    double radius;

    //求圆的面积
    //方式一：
//    public double findArea() {
//        double area = Math.PI * radius * radius;
//        return area;

    //方式二：
      public void findArea() {
          double area = Math.PI * radius * radius;
          System.out.println("面积为：" + area);
    }
}






















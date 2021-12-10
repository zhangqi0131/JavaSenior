package com.zq.polymorphism_exer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-29 14:50
 **/

public class GeometricTest {


    public static void main(String[] args) {

        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle(2.3, "white", 1.0);
        test.displayGeometricObject(c1);
        Circle c2 = new Circle(3.3, "white", 1.0);
        test.displayGeometricObject(c2);


        boolean isEquals = test.equalsArea(c1, c2);
        System.out.println("c1和c2面积是否相等：" + isEquals);


        MyRectangle rect = new MyRectangle(2.1, 3.4, "red", 2.0);
        test.displayGeometricObject(rect);
    }


    public void displayGeometricObject(GeometricObject o) { //GeometricObject o = new Circle(...);
        // 多态的虚拟方法调用

        System.out.println("面积为：" + o.findArea());

    }


    //测试两个对象面积是否相等
    public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
        return o1.findArea() == o2.findArea();
    }



}

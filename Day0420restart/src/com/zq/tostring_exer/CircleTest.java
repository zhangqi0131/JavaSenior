package com.zq.tostring_exer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-29 21:15
 **/

public class CircleTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2.3);
        Circle circle2 = new Circle(2.3, "white", 1.0);

        System.out.println("颜色是否相等：" + circle1.getColor().equals(circle2.getColor()));

        System.out.println("半径是否相等：" + circle1.equals(circle2));

        System.out.println(circle1);
        System.out.println(circle2.toString());
    }
}

package com.zq.oop_1.circletest_1;

/**
 * @program: JavaSenior
 * @description: 213
 * @author: Zhang.Qi
 * @create: 2021-04-26 10:05
 **/

/**
 * 考察参数的值传递
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();

        Circle c = new Circle();
        test.printAreas(c, 5);

        System.out.println("now radius is:" + c.radius);
    }

    public void printAreas(Circle c, int time) {

        System.out.println("Radius\t\t Area");

        for (int i = 1; i <= time; i++) {
            //设置圆的半径
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }

        c.radius = time + 1;
    }
}

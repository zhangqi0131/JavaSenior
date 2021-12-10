package com.zq.oop_1.rectangle;

/**
 * @program: JavaSenior
 * @description: 1.声明一个method方法，在方法中打印一个10*8的*型矩形，在main方法中调用该方法
 *               2.声明一个method方法，在方法中打印一个10*8的*型矩形，再计算该矩形的面积，并将其作为方法返回值
 *                 在main方法中调用该方法，接收返回的面积值并打印
 *               3.声明一个method方法，在method方法中提供m和n两个参数，方法中打印一个m*n的*型矩形，
 *                 并计算该矩形的面积，将其作为方法的返回值。在main方法中调用该方法，接收返回的面积值并打印
 * @author: Zhang.Qi
 * @create: 2021-04-24 16:49
 **/

public class RectangleTest {
    public static void main(String[] args) {

        RectangleTest rect = new RectangleTest();
        //1.测试
        //rect.method();

        //2.测试
        int area = rect.method1();
        System.out.println("面积为：" + area);
        //也可以为：
//        System.out.println(rect.method1());

        //3.测试
        int area1 = rect.method3(12, 10);
        System.out.println("面积为：" + area1);

    }


        //1.
        public void method() {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


        //2.
        public int method1() {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            return 10 * 8;
        }


        //3.
        public int method3(int m, int n) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                }
                System.out.print("* ");
            }
            return m * n;
        }

}
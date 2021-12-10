package com.zq.oop_1.recursion;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-26 10:21
 **/

/**
 * 递归方法（了解）
 *
 */
public class RecursionTest {
    public static void main(String[] args) {

        //例子1：计算1-100之间所有自然数的和
//      方式一：使用for循环
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);


        //方式二：使用递归
        RecursionTest test = new RecursionTest();
        int sum1 = test.getSum(100);
        System.out.println(sum1);


        System.out.println("*********************************");
        int value = test.f(10);
        System.out.println(value);

    }

     //计算1-n所有自然数的和
     public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n +getSum(n - 1);
        }
     }


    //计算1-n所有自然数的积
    public int getSum1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getSum1(n - 1);
        }
    }


    //例3：已知有一个数列，f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),
    //其中n是大于0的整数，求f(10)的值
    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }

    //例4：斐波那契数列

    //例5：汉诺塔问题

    //例6：快速排序
}
































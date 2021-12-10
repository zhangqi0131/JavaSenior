package com.zq.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-07-01 09:46
 **/

public class LambdaTest {

    // 一、无参，无返回值
    @Test
    public void test1(){

        Runnable r1 = new Runnable(){

            @Override
            public void run() {
                System.out.println("AAAAAAAAAAA");
            }
        };

        r1.run();

        System.out.println("=====================");

        Runnable r2 = () -> {
            System.out.println("BBBBBBBBB");
        };
        r2.run();
    }


    // 需要一个参数，但是没有返回值
    @Test
    public void test2() {

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("lie and oath");

        System.out.println("===================");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };

        con1.accept("lie hurts people, oath spires people");

    }


    // 三、数据类型可以省略，因为可由编译器推断得出，称为“类型维护”
    @Test
    public void test3(){

        Consumer<String> con1 = (String s) -> {
            System.out.println("s");
        };

        con1.accept("1111");

        System.out.println("=======================");

        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("2222");
    }



    // 四、Lambda若只需要一个参数，参数的小括号可以省略
    @Test
    public void test4(){

        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("AAAA");

        System.out.println("=============");

        Consumer<String> con2 = s -> { // 小括号可以省略
            System.out.println(s);
        };
        con2.accept("BBBB");

    }

    // 语法格式五：Lambda需要2个或2个以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test5(){

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        int compare1 = com1.compare(12, 20);
        System.out.println(compare1);


        System.out.println("=====================");

        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com2.compare(9, 5));

    }

    // 语法格式六：当Lambda体只有一条语句时，如果有return和大括号，都可以省略
    @Test
    public void test6(){

        Comparator<Integer> com1 = (o1, o2) -> {
                return o1.compareTo(o2);
        };
        System.out.println(com1.compare(12, 48));

        System.out.println("==========================");

        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);

        System.out.println(com2.compare(32, 30));
    }


}








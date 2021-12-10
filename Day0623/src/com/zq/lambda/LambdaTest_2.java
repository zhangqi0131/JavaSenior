package com.zq.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-07-01 10:53
 **/

public class LambdaTest_2 {

    @Test
    public void test1() {

        happyTime(100, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("cola costs " + aDouble);
            }
        });

        System.out.println("以下为Lambda写法");

        happyTime(100, money -> System.out.println("cola costs " + money));


    }

    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }


    @Test
    public void test2() {

        List<String> list = Arrays.asList("北京", "东京", "西京", "江苏", "南京", "上海");
        List<String> filterStr = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterStr);

        // Lambda表达式写法
        List<String> filterStr1 = filterString(list, s -> s.contains("京"));
        System.out.println(filterStr1);

    }

    // 根据指定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
    public List<String> filterString(List<String> list, Predicate<String> pre) {

        ArrayList<String> filterList = new ArrayList<>();

        for (String s : list) {
            if (pre.test(s)){
                filterList.add(s);
            }
        }
        return filterList;

    }

}









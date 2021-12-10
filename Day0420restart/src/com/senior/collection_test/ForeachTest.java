package com.senior.collection_test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-09 19:40
 **/

/*
    用于遍历集合和数组

 */
public class ForeachTest {

    @Test
    public void test1() {

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        //for(集合中元素的类型  局部变量： 集合对象)
        //内部仍然调用了迭代器
        for (Object obj: coll) {
            System.out.println(obj);
        }

    }

    @Test
    public void test2() {

        int[] arr = new int[]{1,2,3,4,5,6};

        for (int i: arr) {
            System.out.println(i);
        }

    }

    @Test
    public void test3() {

        String[] arr = new String[]{"MM", "MM", "MM", "MM"};

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "GG";
//        }

        for (String s: arr) { //重新赋了一个s的值
            s = "GG";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}













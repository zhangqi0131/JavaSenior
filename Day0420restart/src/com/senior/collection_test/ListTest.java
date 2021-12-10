package com.senior.collection_test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-09 19:59
 **/

public class ListTest {


    @Test
    public void test1() {

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom", 22));
        list.add(456);

        System.out.println(list);

        //void add(int index, Object ele):在index位置插入ele元素
        list.add(1, "BB");
        System.out.println(list);

        //boolean addAll(int index, Object ele):从index位置开始将所有元素添加到当前集合中
        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list.size()); //9

        //Object get(int index):获取指定index位置的元素
        System.out.println(list.get(1));


    }



}











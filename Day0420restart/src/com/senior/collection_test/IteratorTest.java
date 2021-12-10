package com.senior.collection_test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-09 19:01
 **/

/*

    集合元素的遍历,使用迭代器Iterator接口

 */
public class IteratorTest {

    @Test
    public void test1() {

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        Iterator iterator = coll.iterator();

        //逐个取出
//        System.out.println(iterator.next()); // 123
//        System.out.println(iterator.next()); // 456
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

    @Test
    public void test3() {

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        Iterator iterator = coll.iterator();

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if ("Tom".equals(obj)) {
                iterator.remove();
            }
        }

        iterator = coll.iterator(); //回到起点 开始遍历
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}









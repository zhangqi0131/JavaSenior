package com.senior.map_test;

/**
 * @program: JavaSenior
 * @description: 操作Collections和 Map的 工具类
 * @author: Zhang.Qi
 * @create: 2021-05-12 15:53
 **/

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * Collections 和 Collection 的区别？
 *
 *
 */
public class CollectionsTest {

    @Test
    public void test1() {

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-96);
        list.add(0);

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);

    }

}








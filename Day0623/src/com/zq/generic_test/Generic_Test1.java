package com.zq.generic_test;

import org.junit.Test;

/**
 * @program: JavaSenior
 * @description: 泛型类，泛型接口，泛型方法
 * @author: Zhang.Qi
 * @create: 2021-06-24 01:24
 **/

public class Generic_Test1 {

    @Test
    public void test1() {

        Order<String> order = new Order<String>("orderAA", 1001, "order:AA");

        order.setOrderT("AA:Hello");


    }

}

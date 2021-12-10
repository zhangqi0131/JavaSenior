package com.senior.map_test;

import org.junit.Test;

import java.util.*;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-11 15:51
 **/

public class MapTest {

    @Test
    public void test3() {

        Map map = new HashMap();
        map.put("AA", 1234);
        map.put(45, 123);
        map.put("BB", 56);

        //遍历所有的key
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //遍历所有的value
        Collection values = map.values();
        for (Object obj: values) {
            System.out.println(obj);
        }

        //遍历所有的key-value
        //方式一
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
//            System.out.println(iterator1.next());
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

        //方式二
        Set keySet = map.keySet();
        Iterator iterator2 = keySet.iterator();
        while (iterator2.hasNext()) {
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key + "====>" + value);
        }


    }

    @Test
    public void test2() {

        Map map = new HashMap();
        map.put("AA", 123);
        map.put(45, 123);
        map.put("BB", 56);

        //修改
        map.put("AA", 87);

        System.out.println(map);


    }

    @Test
    public void test1() {


        Map map = new HashMap();
        map = new LinkedHashMap();

        map.put(123, "AA");
        map.put(345, "BB");
        map.put(12, "CC");

        System.out.println(map);

    }

}

package com.senior.map_test;

import com.senior.set_test.User;
import org.junit.Test;

import java.util.*;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-12 11:09
 **/

public class TreeMapTest {

    //向TreeMap中添加的key-value，要求key必须是同一个类的对象，
    //因为要按照key进行排序：自然排序，定制排序

    @Test
    public void test1() {

        TreeMap map = new TreeMap();
        User u1 = new User("Tom", 23);
        User u2 = new User("Ryon", 29);
        User u3 = new User("Jerry", 20);
        User u4 = new User("Mary", 19);
        map.put(u1, 98);
        map.put(u2, 89);
        map.put(u3, 76);
        map.put(u4, 100);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

    }

    @Test
    public void test2() {

        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                }
                throw new RuntimeException("输入类型不一致");
            }
        });
        User u1 = new User("Tom", 23);
        User u2 = new User("Ryon", 29);
        User u3 = new User("Jerry", 20);
        User u4 = new User("Mary", 19);
        map.put(u1, 98);
        map.put(u2, 89);
        map.put(u3, 76);
        map.put(u4, 100);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

    }

}

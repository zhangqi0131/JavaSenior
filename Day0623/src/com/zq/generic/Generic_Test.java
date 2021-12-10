package com.zq.generic;

import org.junit.Test;

import java.util.*;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-06-23 21:04
 **/

public class Generic_Test {

    //在集合中使用泛型的情况

    @Test
    public void test1() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(78);
        list.add(78);
        list.add(78);

        //编译时，进行类型检查，保证数据安全
//        list.add("Tom");

        for (Integer score : list) {

            //避免了强转操作
            int stuScore = score;

            System.out.println(stuScore);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer stuScore = iterator.next();
            System.out.println(stuScore);

        }
    }

    @Test
    //在集合中使用泛型的情况，以hashMap为例
    public void test2() {

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Tom", 88);
        map.put("Jerry", 70);
        map.put("a", 39);
        map.put("B", 48);

        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();


        }

    }
}

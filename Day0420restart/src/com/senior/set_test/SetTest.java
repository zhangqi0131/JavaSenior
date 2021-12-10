package com.senior.set_test;

import org.junit.Test;

import java.util.*;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-10 15:53
 **/

public class SetTest {

    //HashSet
    //1.无序性：不等于随机性。存储的数据在底层数组中并非按数组索引的顺序添加，
              //而是根据数据的哈希值决定的

    //2.不可重复性：保证添加的元素按照equals()判断时，不能返回true。即相同的元素只能添加一个


    @Test
    public void test1() {

        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("Tom", 12));
        set.add(new User("Tom", 12));
        set.add(128);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2() {

        TreeSet set = new TreeSet();

        set.add(new User("Tom", 12));
        set.add(new User("Jerry", 45));
        set.add(new User("Ryon", 34));
        set.add(new User("Mike", 16));
        set.add(new User("Loki", 27));
        set.add(new User("Mary", 27));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test3() {

        Comparator com = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                } else {
                    throw new RuntimeException("输入数据类型不匹配");
                }
            }
        };

        TreeSet set = new TreeSet(com);

        set.add(new User("Tom", 12));
        set.add(new User("Jerry", 45));
        set.add(new User("Ryon", 34));
        set.add(new User("Mike", 16));
        set.add(new User("Loki", 27));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}






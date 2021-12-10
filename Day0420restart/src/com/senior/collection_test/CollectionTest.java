package com.senior.collection_test;


import org.junit.Test;

import java.util.*;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-09 16:13
 **/

public class CollectionTest {

    @Test
    public void test1() {

        Collection coll = new ArrayList();

        //add(Object e):将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add("CC");
        coll.add(456); //自动装箱
        coll.add(new Date());

        //size():获取添加的元素的个数
        System.out.println(coll.size()); //5

        //addAll():将coll1中的元素添加到当前集合中
        Collection coll1 =  new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll.addAll(coll1);
        System.out.println(coll.size()); //7
        System.out.println(coll);

        //clear():清空集合元素
        coll.clear(); //不会空指针

        //isEmpty():判断当前集合是否为空（是否有元素）
        System.out.println(coll.isEmpty()); //false
    }



    @Test
    public void test2() {

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));



        //contains(Object obj): 判断当前集合中是否包含obj
        boolean contains = coll.contains(123);
        System.out.println(contains); //true
        System.out.println(coll.contains(new String("Tom"))); //true

        //containsAll(Collection coll1):判断coll1中的所有元素是否都存在于当前集合中
        Collection coll1 = Arrays.asList(123, 456);

        System.out.println(coll.containsAll(coll1)); //true

    }


    @Test
    public void test3() {

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        //remove(Object obj):从当前集合中移除obj元素
        coll.remove(123);
        System.out.println(coll);

        coll.remove(new Person("Jerry", 20));
        System.out.println(coll);

        //removeAll(Collection coll1):从当前集合中移除coll1中所有的元素
        Collection coll1 = Arrays.asList(123, 4567);
        coll.removeAll(coll1);
        System.out.println(coll);
    }


    @Test
    public void test4() {


        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));


//        // retainAll(Collection coll1):获取当前集合与coll1的交集，并返回给当前集合
//        Collection coll1 = Arrays.asList(123, 456, 789);
//        coll.retainAll(coll1);
//        System.out.println(coll); //123, 456


        //equals(Object obj):当前集合和形参集合的元素都相同，返回true
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new String("Tom"));
        coll1.add(false);
        coll1.add(new Person("Jerry", 20));

        System.out.println(coll.equals(coll1));  //true
    }

    @Test
    public void test5() {

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        // hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());

        //集合 ---> 数组: toArray():
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //数组 ---> 集合
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list); //[AA, BB, CC]

        List<int[]> arr1 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr1); //[[I@573fd745] 当成了一个元素

        List<Integer> arr2 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(arr2); //[123, 456] 、两个元素

        List<Integer> arr3 = Arrays.asList(123, 456);
        System.out.println(arr3); // [123, 456]

    }
}











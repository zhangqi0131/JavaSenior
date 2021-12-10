package com.zq.oop_1.thistest;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-26 22:56
 **/

public class Girl {

    private String name;
    private int age;


    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy) {
        System.out.println("嫁给：" + boy.getName());
        boy.marry(this);  //this指当前的对象，谁调用当前的marry(Boy boy)方法，谁就是this
    }


    /**
     * 比较两个对象的大小
     * @param girl
     * @return 正数：当前对象大   负数：当前对象小    0：二者一样(当前对象，调用当前方法的对象  形参对象，方法的形参对象)
     */
    public int compare(Girl girl) {
        if (this.age > girl.age) {
            return 1;
        } else if (this.age < girl.age){
            return -1;
        } else {
            return 0;
        }

        //或者
//        return this.age - girl.age;
    }


}

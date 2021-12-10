package com.zq.abstract_test;

/**
 * @program: JavaSenior
 * @description: 抽象类的应用：模板方法的设计模式
 * @author: Zhang.Qi
 * @create: 2021-05-02 14:17
 **/

public class TemplateTest {

    public static void main(String[] args) {

        Template t = new SubTemplate();

        t.spendTmie();

    }
}


abstract class Template {

    //某段代码执行需要花费的时间
    public void spendTmie() {

        long start = System.currentTimeMillis();

        this.code();  //易变，不确定的部分

        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));

    }

    public abstract void code();

}


class SubTemplate extends Template {

    @Override
    public void code() {

        for (int i = 2; i < 1000; i++) {

            boolean isFlag =true;
            for (int j = 2; j < Math.sqrt(i); j++) {

                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }
    }
}














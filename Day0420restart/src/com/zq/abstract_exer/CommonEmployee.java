package com.zq.abstract_exer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-02 10:59
 **/

public class CommonEmployee extends Employee{

    @Override
    public void walk() {
        System.out.println("员工在一线车间生产产品");
    }
}

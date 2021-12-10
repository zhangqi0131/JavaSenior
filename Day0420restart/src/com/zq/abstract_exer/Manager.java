package com.zq.abstract_exer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-02 10:56
 **/

public class Manager extends Employee{

    private double bonus;


    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }


    @Override
    public void walk() {
        System.out.println("管理员工，提高公司运行的效率");
    }
}























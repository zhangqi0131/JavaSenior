package com.zq.extendsexer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-28 10:31
 **/

public class ManKind {

    private int sex;
    private int salary;


    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("man");
        } else if (sex == 0) {
            System.out.println("woman");
        }
    }

    public void employeed() {
        if (salary == 0) {
            System.out.println("no job");
        } else if (salary != 0) {
            System.out.println("job");
        }
//        String jobInfo = (salary == 0) ? "no job" : "job";
    }


}













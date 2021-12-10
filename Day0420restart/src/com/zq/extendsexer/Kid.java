package com.zq.extendsexer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-28 10:37
 **/

public class Kid extends ManKind{

    private int yearsOld;



    public Kid() {
    }


    public Kid(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println("年龄:" + yearsOld);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public void employeed() {
        System.out.println("孩子还是好好工作吧");
    }
}

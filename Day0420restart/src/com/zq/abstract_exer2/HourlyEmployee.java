package com.zq.abstract_exer2;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-02 15:00
 **/

public class HourlyEmployee extends Employee{

    private int wage; //每小时的工资
    private int hour; //月工作的小时数

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.hour = hour;
        this.wage = wage;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }


    public String toString() {
        return "[HourlyEmployee" + super.toString() + "]";
    }
}

package com.zq.interface_test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-02 16:10
 **/

public class InterfaceTest {
    public static void main(String[] args) {

        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        Plane plane = new Plane();
        plane.fly();
    }
}


interface Flyable {

    //全局常量
    public static final int MAX_SPEED = 7900;  //一秒7900米
    public static final int MIN_SPEED = 1;



    public abstract void fly();


    void stop();




}

interface Attackable {

    void attack();
}


class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("fly~~~");
    }

    @Override
    public void stop() {
        System.out.println("stop~~~");
    }
}


class Kite implements Flyable {

    @Override
    public void fly() {
        System.out.println("fly a kite");
    }

    @Override
    public void stop() {
        System.out.println("kite stops");
    }
}


class Bullet implements Flyable, Attackable {

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}
package com.zq.interface_test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-02 22:17
 **/

public class StaticProxyTest {
    public static void main(String[] args) {

        Star s = new Proxy(new RealStar());
        s.confer();
        s.signContract();
        s.bookTicket();
        s.sing();
        s.collectMoney();
    }
}


interface Star {

    void confer(); //面谈

    void signContract(); //签合同

    void bookTicket(); //订票

    void sing(); //唱歌

    void collectMoney(); //收钱
}


class RealStar implements Star {

    @Override
    public void confer() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void sing() {
        System.out.println("明星唱歌");
    }

    @Override
    public void collectMoney() {

    }
}

class Proxy implements Star {

    private Star real;

    public Proxy(Star real) {
        this.real = real;
    }

    @Override
    public void confer() {
        System.out.println("经纪人面谈");
    }

    @Override
    public void signContract() {
        System.out.println("经纪人签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("经纪人订票");
    }

    @Override
    public void sing() {
        real.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("经纪人收钱");
    }
}
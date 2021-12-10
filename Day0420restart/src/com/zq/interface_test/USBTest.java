package com.zq.interface_test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-02 18:09
 **/

public class USBTest {

    public static void main(String[] args) {

        Computer com = new Computer();

        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);

        //创建接口的非匿名实现类的匿名对象
        com.transferData(new Printer());

        //创建接口的 匿名实现类 的 非 匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        com.transferData(phone);


        //创建接口的 匿名实现类 的 匿名对象
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("MP3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("MP3结束工作");
            }
        });


    }
}

class Computer {

    public void transferData(USB usb) {

        usb.start();
        System.out.println("具体的传输数据的细节");

        usb.stop();

    }
}

interface USB {

    //常量定义 长、宽、最大最小的传输速度等

    void start();

    void stop();
}


class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
















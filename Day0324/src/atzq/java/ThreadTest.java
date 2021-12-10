package atzq.java;

/**
 * 多线程的创建，方式一：继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run()
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用start()
 */

//1.创建一个继承于Thread类的子类
class MyThread extends Thread {
    //2.重写Thread类的run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread类的子类的对象
        MyThread t1 = new MyThread();


        //4.通过此对象调用start()
        //①启动当前线程 ②调用当前线程的run()
        t1.start();


        //问题一：不能通过调用run()的方式启动线程
        //t1.run();

        //问题二：在启动一个线程，遍历100以内的偶数。
        //不能让已经start的线程执行
        //需要重新创建一个线程的对象
        MyThread t2 = new MyThread();
        t2.start();
        //t1.start();
        //仍然是在main()主线程执行的
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i + "main*****");
            }
        }
    }
}

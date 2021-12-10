package com.zq.jichu.java;


/**
 *
 *例子：创建三个窗口卖票，总票数为100张，使用实现Runnable接口的方式
 *存在线程安全问题：
 * 1.卖票过程中，出现重票、错票-->
 * 2.原因：某个线程操作车票过程中，尚未完成操作时，其他线程参与进来
 * 3.解决：当一个线程在操作ticket时，其他线程不能参与进来。直到线程a操作完，
 *        其他线程才可以开始操作ticket，即使线程a出现阻塞，其他线程也不能参与
 * 4.在Java中，通过同步机制，解决线程安全问题
 *
 * 方式一：同步代码块
 *
 * synchronized(同步监视器){
 *     //需要被同步的代码
 * }
 * 说明：1.操作共享数据的代码，即为需要被同步的代码  -->不能包含代码多了，也不能少了
 *      2.共享数据：多个线程共同操作的数据。比如ticket就是共享数据
 *      3.同步监视器（锁）：任何一个类的对象，都可以充当锁
 *        要求：多个线程必须共用用一把锁
 *
 *      补充：在实现Runnable接口创建多线程的方式中，可以考虑使用this充当同步监视器，
 *
 *
 * 方式二：同步方法
 *        如果操作共享数据的代码完整的声明在一个方法中，不妨将此方法声明同步的。
 *
 * 同步方式，解决线程安全问题 --好处
 *   （局限性）操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个单线程的过程，效率低
 *   
 */

class Window1 implements Runnable {

    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (this){//①此时的this：唯一的Window1的对象   ②//synchronized (obj) {
                if (ticket > 0) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "为：" + ticket--);

                    //ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

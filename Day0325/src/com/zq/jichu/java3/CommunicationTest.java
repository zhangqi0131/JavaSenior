package com.zq.jichu.java3;

/**
 * 线程通信实例：使用两个线程打印1-100。线程1，线程2交替打印
 *
 * 涉及到的三个方法：
 *  wait():一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
 *  notify():一旦执行此方法，就会唤醒被wait的一个线程，如果有多个线程被wait，就唤醒优先级高的线程
 *  notifyall()：一旦执行此方法，就会唤醒所有被wait的线程
 *
 * 说明：
 *  1.wait(),notify(),notifyAll()必须使用在 同步代码块 或 同步方法中
 *  2.wait(),notify(),notifyAll()的调用者必须是 同步代码快 或 同步方法 中的同步监视器
 *  3.wait(),notify(),notifyAll()是定义在Object类中的方法
 *
 * sleep() 和 wait() 的异同？
 * 1.相同点：一旦执行方法，都可以使当前线程进入阻塞状态
 * 2.不同点：①两个方法声明的位置不同：Thread类中声明sleep()，Object类中声明wait()
 *         ②调用要求不同：sleep()可以在任何需要场景下调用，wait()必须使用在同步代码块或同步方法中
 *         ③关于是否释放同步监视器的问题：如果两个方法都使用在同步代码块或同步方法中，
 *           slee()不会释放锁，wait()会释放锁
 */

class Number implements Runnable{

    private int number = 1;
    private Object obj = new Object();

    @Override
    public void run() {

        while (true){

            synchronized (obj) {//任何一个类的对象都可以充当监视器

                obj.notify();//如果不是静态，就是this调用的，没有obj，就是this.notify

                if (number <= 100){

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;


                    try {
                        //使得调用如下wait()方法的线程进入阻塞状态
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }else {
                    break;
                }
            }
        }
    }
}
public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

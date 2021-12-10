package com.zq.jichu.java3;

/**
 *
 * 线程通信应用：生产者/消费者问题
 *
 * 生产者（Productor）将产品交给店员（Clerk）,而消费者从店员处取走产品，
 * 电源一次只能持有固定数量的产品（比如：20），如果生产者试图生产更多的产品，
 * 店员会叫生产者停一下，如果店员中有空位放产品了，再通知生产者继续生产
 * 如果店中没有产品了，店员会告诉消费者等一下，
 * 如果店中有产品了再通知消费者来取走产品
 *
 * 分析：
 * 1.是否是多线程问题？      是，生产者线程，消费者线程
 * 2.是否有共享数据？       是，店员（或产品）
 * 3.如何解决线程安全问题？  同步机制，三种方法
 * 4.是否涉及到线程通信？    是
 *
 */

class Clerk{

    private int productCount = 0;

    //生产产品
    public synchronized void produceProducor() {

        if (productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName() + "开始生产第" + productCount);

            notify();
        }else {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    //消费产品
    public synchronized void consumeProducor() {
        if (productCount > 0){
            System.out.println(Thread.currentThread().getName() + "开始消费第" + productCount);
            productCount--;

            notify();
        }else {

            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class producer extends Thread{//生产者

    private Clerk clerk;

    public producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始生产产品");

        while (true){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.produceProducor();

        }
    }
}



class Consumer extends Thread{//消费者

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "开始消费产品");

        while (true){

            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            clerk.consumeProducor();

        }
    }
}



public class ProductorTest {

    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        producer p1 = new producer(clerk);
        p1.setName("生产者1");

        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者1");
        Consumer c2 = new Consumer(clerk);
        c2.setName("消费者2");

        p1.start();
        c1.start();
        c2.start();

    }
}

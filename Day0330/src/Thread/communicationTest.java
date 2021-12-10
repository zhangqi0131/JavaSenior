package Thread;

/**
 * @program: JavaSenior
 * @description: 线程通信实例：使用两个线程打印1-100，线程1,2交替打印
 * @author: Zhang.Qi
 * @create: 2021-03-31 09:53
 **/

class Number implements Runnable{
    private int number = 1;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (obj){ //任何一个类的对象都可以充当监视器

                obj.notify();

                if (number < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
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

public class communicationTest {
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1= new Thread(number);
        Thread t2= new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

package zq;

/**
 * @program: JavaSenior
 * @description: 三个窗口同时售出20张票
 * @author: Zhang.Qi
 * @create: 2021-03-29 13:19
 */

/**
 *程序分析:1.票数要使用同一个静态值
 *       2.为保证不会出现卖出同一个票数，要java多线程同步锁。
 *
 *设计思路:1.创建一个站台类Station，继承Thread，重写run方法，在run方法里面执行售票操作！售票要使用同步锁：即有一个站台卖这张票时，其他站台要等这张票卖完！
 *        2.创建主方法调用类
 */
public class Station extends Thread {
    //用构造方法给线程名字命名
    public Station(String name) {
        super(name);//给线程名字赋值
    }

    //保持票数一致，票数要设为静态
    static int ticket = 20;

    //创建一个静态钥匙
    static Object ob = "aa";

    //重写run方法，实现买票操作

    @Override
    public void run() {
        while (ticket > 0) {
            synchronized (ob) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出了:" + ticket + "张票");
                    ticket--;
                } else {
                    System.out.println("票卖完了");
                }
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



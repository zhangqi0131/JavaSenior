package Thread;

/**
 * @program: JavaSenior
 * @description: 使用同步方法解决实现Runnable接口的线程安全问题
 * @author: Zhang.Qi
 * @create: 2021-03-30 13:45
 **/

class window3 implements Runnable {
    private int ticket = 150;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private synchronized void show() {
        if (ticket > 0) {

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "为：" + ticket);
            ticket--;
        }
    }
}

public class windowTest3 {
    public static void main(String[] args) {
        window3 w = new window3();

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

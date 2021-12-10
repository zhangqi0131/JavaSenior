package Thread;

/**
 * @program: JavaSenior
 * @description:实现Runnbale接口的方式，同步代码块解决线程安全问题
 * @author: Zhang.Qi
 * @create: 2021-03-30 10:46
 **/

class Window1 implements Runnable{
    private int ticket = 150;
    Object obj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (ticket > 0){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票：" + ticket);

                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}



public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w1= new Window1();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

package Thread;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-03-30 15:03
 **/
class Account{
    private double balance;

    public Account(double balance) { this.balance = balance; }

    //存钱
    public synchronized void deposit(double amt){
        if (amt > 0){
            balance += amt;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":存钱成功。余额为：" + balance);

        }
    }
}

class Customer extends Thread{
    private Account acct;

    public Customer(Account acct){this.acct = acct;}

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }
}



public class accountThreadTest {
    public accountThreadTest(){

    }
    public static void main(String[] args) {
        Account acct = new Account(0);//两个线程公用一个账户acct
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("客户A：");
        c2.setName("客户B：");

        c1.start();
        c2.start();
    }
}


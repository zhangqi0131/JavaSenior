package com.zq.super_test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-28 22:20
 **/

public class CheckAccount extends Account{

    private double overdraft; //可透支限额

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) { //余额就够消费的情况
            //1.
//            setBalance(getBalance() - amount);
            //2.
            super.withdraw(amount);
        } else if (overdraft >= (amount - getBalance())){  //透支额度足够消费

            overdraft -= (amount - getBalance());
//            setBalance(0);  //余额设为0
            //或者：
            super.withdraw(getBalance());  //取光，有多少钱取多少钱

        } else { //超过可透支限额
            System.out.println("超过可透支限额");
        }

    }
}

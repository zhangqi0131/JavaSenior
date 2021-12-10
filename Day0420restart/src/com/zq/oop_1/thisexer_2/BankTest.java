package com.zq.oop_1.thisexer_2;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-27 10:41
 **/

public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.addCustomer("Jane", "Smith");

        bank.getCustomer(0).setAccount(new Account(2000000));

        bank.getCustomer(0).getAccount().withdraw(500);

        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "的账户余额为：" + balance);

        System.out.println("*****************************************");
        bank.addCustomer("张","金祥");

        System.out.println("银行账户客户数为：" + bank.getNumberOfCustomer());

    }

}

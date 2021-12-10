package com.zq.oop_1.thisexer_1;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-27 09:53
 **/

public class CustomerTest {
    public static void main(String[] args) {

        Customer cust = new Customer("Jane", "Smith"); //创建一个Customer，名字叫Jane,Smith

        Account acct = new Account(1000, 2000, 0.0123); //他有一个账号为1000 2000 0.0123

        cust.setAccount(acct);  //acct的地址指向了Customer类的Account属性，cust就有了acct

        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);

        System.out.println("Customer[" + cust.getLastName() + "," + cust.getFirstName() + "] has a account: id is " +
                acct.getId() + ", annualInterestRate is:" + acct.getAnnualInterestRate() * 100 + "%, balance is:" + acct.getBalance());




    }
}

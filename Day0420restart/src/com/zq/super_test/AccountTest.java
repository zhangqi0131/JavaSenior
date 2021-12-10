package com.zq.super_test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-28 22:10
 **/

/**
 * 创建一个账号为1122，余额为20000，年利率4.5%的Account对象
 * 使用withdraw方法提款30000元，并打印余额
 * 再使用withdraw方法提款2500元，使用deposit方法存款3000元，然后打印余额和月利率
 */
public class AccountTest {
    public static void main(String[] args) {

        Account acc1 = new Account(1122, 20000, 0.045);

        acc1.withdraw(30000);
        System.out.println("账户余额为：" + acc1.getBalance());
        acc1.withdraw(2500);
        System.out.println("deposit:" + acc1.getBalance());
        acc1.deposit(3000);
        System.out.println("deposit:" + acc1.getBalance());

        System.out.println("monthlyinterest：" + (acc1.getMonthlyInterest()) * 100 + "%");




    }
}

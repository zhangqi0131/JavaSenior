package com.zq.super_test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-28 22:34
 **/
/**
 * 创建一个账号为1122，余额为20000，年利率4.5%的Account对象
 * 使用withdraw方法提款5000元，并打印余额和可透支限额
 * 使用withdraw方法提款18000元，并打印余额和可透支限额
 * 再使用withdraw方法提款3000元，并打印余额和可透支限额
 */
public class CheckAccountTest {

    public static void main(String[] args) {

        CheckAccount acct = new CheckAccount(1122, 20000, 0.045, 5000);

        acct.withdraw(5000);
        System.out.println("账户余额为：" + acct.getBalance());
        System.out.println("可透支余额为：" + acct.getOverdraft());
        acct.withdraw(18000);
        System.out.println("账户余额为：" + acct.getBalance());
        System.out.println("可透支余额为：" + acct.getOverdraft());
        acct.withdraw(3000);
        System.out.println("账户余额为：" + acct.getBalance());
        System.out.println("可透支余额为：" + acct.getOverdraft());


    }
}

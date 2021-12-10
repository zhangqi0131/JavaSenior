package com.zq.oop_1.thisexer_1;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-27 09:49
 **/

public class Customer {

    private String firstName;
    private String lastName;
    private Account account;


    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}





































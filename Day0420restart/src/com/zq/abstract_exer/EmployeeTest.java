package com.zq.abstract_exer;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-02 11:01
 **/

public class EmployeeTest {
    public static void main(String[] args) {

        Manager manager = new Manager("εΊε", 1001, 5000, 500000);
        manager.walk();

        //ε€ζ
        Employee manager1 = new Manager("Bill", 1001, 5000, 500000);

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.walk();

    }
}

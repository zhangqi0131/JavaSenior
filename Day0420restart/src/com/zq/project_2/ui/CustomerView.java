package com.zq.project_2.ui;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-27 16:22
 **/

import com.zq.project_2.bean.Customer;
import com.zq.project_2.service.CustomerList;
import com.zq.project_2.util.CMUtility;

/**
 * 主模块，负责菜单的显示，处理用户操作
 */
public class CustomerView {

    private CustomerList customerList = new  CustomerList(10);

    public CustomerView() {

        Customer customer = new Customer("张金祥", '男', 23, "13900000000", "zjx@163.com");
        customerList.addCustomer(customer);  //customer放到数组中
    }


    /**
     * 显示 客户信息管理软件  界面
     */
    public void enterMainMenu() {

        boolean isFlag = true;
        while (isFlag) {

            System.out.println("\n--------------------客户信息管理软件---------------------");
            System.out.println("                      1.添加客户");
            System.out.println("                      2.修改客户");
            System.out.println("                      3.删除客户");
            System.out.println("                      4.客户列表");
            System.out.println("                      5.退  出\n");
            System.out.print("                      请选择(1-5):");

            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();

                    break;
                case '5':
                    System.out.println("退出");

                    System.out.print("是否确认退出(Y/N):");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y' ) {
                        isFlag = false;
                    }
            }
//            isFlag = false;
        }
    }

    /**
     * 添加客户的操作
     */
    private void addNewCustomer() {
//        System.out.println("添加客户的操作");
        System.out.println("------------------------客户列表------------------------");

        System.out.print("姓名：");
        String name = CMUtility.readString(6);

        System.out.print("性别：");
        char gender = CMUtility.readChar();

        System.out.print("年龄：");
        int age = CMUtility.readInt();

        System.out.print("电话：");
        String phone = CMUtility.readString(13);

        System.out.print("邮箱：");
        String email = CMUtility.readString(20);

        //将上述数据封装到对象中
        Customer customer = new Customer(name, gender, age, phone, email);

        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("-----------------------添加完成------------------------");
        } else {
            System.out.println("---------------------目录已满，失败---------------------");
        }
    }


    /**
     * 修改客户的操作
     */
    private void modifyCustomer() { //改变顾客
//        System.out.println("修改客户的操作");

        System.out.println("-----------------------修改客户------------------------");

        Customer cust;
        int number;
        for (; ;) {
            System.out.println("请选择待修改客户编号(-1退出):");
            number = CMUtility.readInt();

            if (number == -1) {
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户");
            } else { //找到了相应客户
                break;
            }
        }
        //修改客户信息(已经找到了客户，跳出循环)
        System.out.println("姓名:(" + cust.getName() + "):");
        String name = CMUtility.readString(6, cust.getName());

        System.out.println("性别:(" + cust.getGender() + "):");
        char gender = CMUtility.readChar(cust.getGender());

        System.out.println("年龄:(" + cust.getAge() + "):");
        int age = CMUtility.readInt(cust.getAge());

        System.out.println("电话:(" + cust.getPhone() + "):");
        String phone = CMUtility.readString(13, cust.getPhone());

        System.out.println("邮箱:(" + cust.getEmail() + "):");
        String email = CMUtility.readString(20, cust.getEmail());

        Customer newCust = new Customer(name, gender, age, phone, email);

        boolean isReplaced = customerList.replaceCustomer(number - 1, newCust);

        if (isReplaced) {
            System.out.println("------------------------修改完成------------------------");
        } else {
            System.out.println("------------------------修改失败------------------------");
        }

    }

    /**
     * 删除客户的操作
     */
    private void deleteCustomer() {
//        System.out.println("删除客户的操作");

        System.out.println("------------------------删除客户------------------------");

        int number;

        for (; ; ) {

            System.out.println("请选择待删除客户编号(-1退出):");
            number = CMUtility.readInt();

            if (number == -1) {
                return;
            }

            Customer customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户");
            } else {
                break;
            }
        }

            //此时已经找到了指定客户，跳出了循环，下面需要执行删除操作
            System.out.print("是否确认删除(Y/N):");
            char isDelete = CMUtility.readConfirmSelection();
            if (isDelete == 'Y') {
                boolean deleteSuccess = customerList.deleteCustomer(number - 1);
                if (deleteSuccess) {
                    System.out.println("------------------------删除成功------------------------");
                } else {
                    System.out.println("------------------------删除失败------------------------");
                    //此步骤不会执行到，因为之前的number一定会限制
                }
            } else {
                return;
            }



    }

    /**
     * 显示客户列表的操作
     */
    private void listAllCustomer() {
//        System.out.println("显示客户列表的操作");
        System.out.println("------------------------客户列表------------------------");

        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录");
        } else {
            System.out.println("编号\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t\t邮箱\t\t");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                Customer cust = custs[i];
                System.out.println((i + 1) + "\t"
                        + cust.getName() +
                        "\t" + cust.getGender() + "\t\t" + cust.getAge() +
                        "\t\t" + cust.getPhone() + "\t\t" + cust.getEmail());
            }
        }

        System.out.println("----------------------客户列表完成----------------------");
    }


    public static void main(String[] args) {

        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }



}

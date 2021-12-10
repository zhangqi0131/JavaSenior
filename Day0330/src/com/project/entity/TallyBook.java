package com.project.entity;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-03-31 15:17
 **/

public class TallyBook {
    public static void main(String[] args) {
        boolean isFlag = true;
        //用于记录用户收入和支出的详情
        String details = "收支\t账户金额\t收支金额\t说  明\n";
        //初始金额
        int balance = 10000;

        while (isFlag) {

            System.out.println("----------记账本----------\n");
            System.out.println("        1.收支明细");
            System.out.println("        2.登记收入");
            System.out.println("        3.登记支出");
            System.out.println("        4.  退出\n");
            System.out.print("        请选择(1-4):");

            //获取用户的选择
            char selection = Utility.readMenuSelection();

            switch (selection) {

                case '1':
//                    System.out.println("1.收支明细");
                    System.out.println("--------当前收支明细记录--------");
                    System.out.println(details);
                    System.out.println("-----------------------------");
                    break;
                case '2':
//                    System.out.println("2.登记收入");
                    System.out.print("本次收入金额");
                    int money = Utility.readNumber();
                    System.out.print("本次收入说明");
                    String info = Utility.readString();

                    //处理balance
                    balance += balance + money;

                    //处理详情 details
                    details += ("收入\t" + balance + "\t\t" + money + "\t\t" + info + "\n");

                    System.out.println("-----------登记完成-----------\n");


                    break;
                case '3':
//                    System.out.println("3.登记支出");


                    System.out.print("本次支出金额");
                    money = Utility.readNumber();
                    System.out.print("本次收入说明");
                    info = Utility.readString();

                    //处理余额baalnce
                    if (balance >= money) {
                        balance -= money;

                        details += ("支出\t" + balance + "\t\t" + money + "\t\t" + info + "\n");

                    } else {
                        System.out.println("支出超出账户额度，支付失败");
                    }

                    System.out.println("-----------登记完成-----------\n");

                    break;
                case '4':
//                    System.out.println("4.  退出");
                    System.out.print("确认是否退出(Y/N)");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
//                    break;
            }
//            isFlag = false;
        }

    }
}

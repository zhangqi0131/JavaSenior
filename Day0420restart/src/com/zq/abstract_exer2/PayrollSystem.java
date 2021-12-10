package com.zq.abstract_exer2;

import java.util.Calendar;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-02 15:06
 **/

public class PayrollSystem {

    public static void main(String[] args) {

        //方式一：
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入当月月份：");
//        int month = scanner.nextInt();

        //方式二：
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(calendar.MONTH);//获取当前月份, month一月份为0



        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmployee("zhangqi", 1001, new MyDate(1999, 11,12), 10000);
        emps[1] = new HourlyEmployee("zqq", 1002, new MyDate(2000, 5,10), 60, 240);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);

            double salary = emps[i].earnings();
            System.out.println("月工资为：" + salary);

            if ((month + 1) == emps[i].getBirthday().getMonth()) {
                System.out.println("Happy Birthday!~ Bonus ￥100!");
                System.out.println("月工资为：" + (salary + 100));

            }
        }

    }
}

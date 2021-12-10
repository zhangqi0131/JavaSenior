package com.zq.jichu.switchtest;

/**
 * @program: JavaSenior
 * @description:成绩大于60分，合格，小于60分，不合格
 * @author: Zhang.Qi
 * @create: 2021-04-22 15:09
 **/

public class SwitchTest {
    public static void main(String[] args) {
        int score = 78;

        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
        }

        //更优的解决方案
        switch (score / 60) {
            case 1:
                System.out.println("及格");
                break;
            case 0:
                System.out.println("不及格");
                break;
        }
    }
}

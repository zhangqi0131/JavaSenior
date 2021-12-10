package com.zq.jichu.iftest;

import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-04-22 10:44
 **/

public class CaiPiaoTest {
    public static void main(String[] args) {
        //1.随机生成一个二位数
        int number = (int)(Math.random() * 90 + 10);

        int numShi = number/10;
        int numGe = number%10;

        //2.用户输入一个两位数
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个两位数：");
        int guess = input.nextInt();

        int guessShi = guess/10;
        int guessGe = guess%10;

        if (number == guess) {
            System.out.println("奖金10000美元");
        } else if (numShi == guessGe && numGe == guessShi) {
            System.out.println("奖金5000美元");
        } else if (numShi == guessShi || numGe == guessGe) {
            System.out.println("奖金3000美元");
        } else if (numShi == guessGe || numGe == guessShi) {
            System.out.println("奖金1000美元");
        } else {
            System.out.println("没中奖");
        }

        System.out.println("中奖号码是：" + number);

    }
}

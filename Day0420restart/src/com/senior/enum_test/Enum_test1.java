package com.senior.enum_test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-08 21:40
 **/

public class Enum_test1 {
    public static void main(String[] args) {

        Season1 summer = Season1.Summer;
        System.out.println(summer.toString());

        System.out.println("-------------------------");

        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }

        Season1 winter = Season1.valueOf("Winter");
        winter.show();

    }

}

interface Info {
    void show();

}

//使用Enum关键字定义枚举类
enum  Season1 implements Info {


    //3.提供当前枚举类的多个对象
    Spring("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("spring~~");
        }
    },
    Summer("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("summer~~");
        }
    },
    Autumn("秋天", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("autumn~~");
        }
    },
    Winter("冬天", "冰天雪地"){
        @Override
        public void show() {
            System.out.println("winter~~");
        }
    };

    //1.声明Season对象的属性
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化构造器，并给对象属性赋值
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4.1 提供toString    这里的toString可以重写，也可以不重写

//    @Override
//    public String toString() {
//        return "Season{" +
//                "season1Name='" + seasonName + '\'' +
//                ", season1Desc='" + seasonDesc + '\'' +
//                '}';
//    }
}
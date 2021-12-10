package com.senior.enum_test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-08 16:47
 **/

public class EnumTest {

    public static void main(String[] args) {

        Season spring = Season.Spring;
        System.out.println(spring);

    }

}


//自定义枚举类
class Season {

    //1.声明Season对象的属性
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化构造器，并给对象属性赋值
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供当前枚举类的多个对象
    public static final Season Spring = new Season("春天", "春暖花开");
    public static final Season Summer = new Season("夏天", "夏日炎炎");
    public static final Season Autumn = new Season("秋天", "秋高气爽");
    public static final Season Winter = new Season("冬天", "冰天雪地");

    //4.获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4.1 提供toString

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}











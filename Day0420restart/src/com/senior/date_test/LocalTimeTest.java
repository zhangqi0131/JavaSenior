package com.senior.date_test;

import org.junit.Test;

import java.time.*;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-08 10:45
 **/

public class LocalTimeTest {

    @Test
    /*
    LocalDate, LocalTime, LocalDateTime

     */
    public void test1() {

        //now() 获取当前的日期，时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        // of(): 设置指定的年，月，日，时，分，秒
        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 5, 9, 17, 20, 45);
        System.out.println(localDateTime1);

        //getXxx()
        System.out.println(localDateTime.getDayOfMonth()); //8
        System.out.println(localDateTime.getDayOfWeek()); //SATURDAY
        System.out.println(localDateTime.getMonth()); // MAY
        System.out.println(localDateTime.getMonthValue()); // 5
        System.out.println(localDateTime.getMinute()); // 57

        //with
        LocalDateTime localDateTime2 = localDateTime.withDayOfMonth(22);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);


    }

    @Test
    public void test2() {

        // 获取本初子午线对应的时间
        Instant instant = Instant.now();
        System.out.println(instant); // 2021-05-08T03:06:40.148Z

        // 添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);  //2021-05-08T15:03:15.479+08:00

        //获取自1970年开始对应的毫秒数
        long milli = instant.toEpochMilli();
        System.out.println(milli); // 1620457572926

        Instant instant1 = Instant.ofEpochSecond(1620457572926L);
        System.out.println(instant1);

    }


}

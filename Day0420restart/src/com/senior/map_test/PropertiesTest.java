package com.senior.map_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-12 15:38
 **/

public class PropertiesTest {
    public static void main(String[] args) throws IOException {

        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");

        pros.load(fis);

        String name = pros.getProperty("name");
        String password = pros.getProperty("password");

        System.out.println("name = " + name + ", password = " + password);

    }
}

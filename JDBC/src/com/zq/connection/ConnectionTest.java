package com.zq.connection;

import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 连接数据库的方式
 */
public class ConnectionTest {
    /**
     * 方法一
      */
    @Test
    public void testConnection1() throws SQLException {
        // 获取Driver实现类的对象
        Driver driver = new com.mysql.cj.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8";
        Properties info = new Properties();
        // 将用户名和密码封装在Properties中
        info.setProperty("user", "root");
        info.setProperty("password", "zq123");
        Connection connection = driver.connect(url, info);
        System.out.println(connection);
    }

    /**
     * 方法二
      */
    @Test
    public void testConnection2() throws Exception {
        // 1.获取Driver实现类的对象:使用反射实现
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        // 2.提供要连接的数据库(不出现第三方的api，可移植性高)
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8";

        // 3.提供用户名和密码
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "zq123");

        // 4.获取连接
        Connection connect = driver.connect(url, info);
        System.out.println(connect);
    }

    /**
     方式三：使用DriverManager替换Driver
     */
    @Test
    public void testConnect3() throws Exception {
        // 1.获取Driver实现类对象
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        // 2.获取连接的3个基本信息
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String user = "root";
        String password = "zq123";
        // 3.注册驱动
        DriverManager.registerDriver(driver);

        // 4.获取连接
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

    /**
     * 方式四：
      */
    @Test
    public void testConnection4() throws Exception {
        // 1.获取连接的3个信息
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&charsetEncoding=utf-8";
        String user = "root";
        String password = "zq123";

        // 2.获取Driver实现类对象
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");

        /*Driver driver =(Driver) clazz.newInstance();

        // 3.注册驱动
        DriverManager.registerDriver(driver);*/

        // 4.获取连接
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

    /**
     * 将数据库需要的4个基本信息声明在配置文件中，通过读取配置文件，获取连接
     */
    @Test
    public void testConnection5() throws Exception {
        // 1.读取配置文件中的4个基本信息
        InputStream inputStream = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties pros = new Properties();
        pros.load(inputStream);
        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClass");

        // 2.加载驱动
        Class.forName(driverClass);

        // 3.获取连接
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
}

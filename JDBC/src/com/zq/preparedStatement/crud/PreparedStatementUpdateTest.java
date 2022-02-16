package com.zq.preparedStatement.crud;

import com.zq.connection.ConnectionTest;
import com.zq.util.JDBCUtils;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * @author zhangqi
 */
public class PreparedStatementUpdateTest {

    /**
     * 测试增删改通用操作
     */
    @Test
    public void testCommonUpdate() {
        String sql = "update `order` set order_name=? where order_id=?";
        update(sql, "QQ", 1);

        String sql1 = "delete from customers where name=?";
        update(sql1,"Tom");
    }

    // 增删改的通用操作
    public void update(String sql, Object... args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(conn, ps);
        }
    }


    // 修改customer表的一条记录
    @Test
    public void updateTest() {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // 1.获取数据库连接
            conn = JDBCUtils.getConnection();

            // 2.预编译SQL语句，返回PreparedStatement实例
            String sql = "update customers set name=? where id=?";
            ps = conn.prepareStatement(sql);

            // 3.填充占位符
            ps.setObject(1, "Mozart");
            ps.setObject(2, 18);

            // 4.执行
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5.资源关闭
            JDBCUtils.closeResources(conn, ps);
        }
    }


    // 向customers中添加记录
    @Test
    public void insertTest() {
        Connection connection = null;
        PreparedStatement ps = null;
        Properties properties;
        try {
            // 1.读取配置文件中的4个基本信息
            InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
            ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
            properties = new Properties();
            properties.load(is);

            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driverClass = properties.getProperty("driverClass");

            // 2.加载驱动
            Class.forName(driverClass);

            // 3.获取连接
            connection = DriverManager.getConnection(url, user, password);

            // 4.预编译SQL语句，返回PreparedStatement实例
            String sql = "insert into customers(name,email,birth) values(?,?,?)";
            ps = connection.prepareStatement(sql);

            // 5.填充占位符
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse("2022-11-13");
            ps.setString(1, "Tom");
            ps.setString(2, "Tom@163.com");
            ps.setDate(3, new java.sql.Date(date.getTime()));
            // 6.执行操作
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 7.资源关闭
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

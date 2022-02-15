package com.zq.exer;

import com.zq.util.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exer1Test {

    @Test
    public void testInsert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入用户名：");
        String name = scanner.next();
        System.out.println("输入邮箱：");
        String email = scanner.next();
        System.out.println("输入生日：");
        String birth = scanner.next();

        String sql = "insert into customers (name,email,birth) values(?,?,?)";
        int insertCount = update(sql, name, email, birth);
        if (insertCount > 0) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

    }

    // 通用的增删改操作
    public int update(String sql, Object... args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            //ps.execute();
            int count = ps.executeUpdate();
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(conn, ps);
        }
        return 0;
    }
}

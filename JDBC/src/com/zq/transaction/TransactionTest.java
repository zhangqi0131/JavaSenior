package com.zq.transaction;

import com.zq.util.JDBCUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.*;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @ClassName TransactionTest.java
 * @Description TODO
 * @createTime 2022年02月16日 22:39  周三
 */
public class TransactionTest {

    @Test
    public void testTransactionUpdate() throws Exception {
        Connection conn = null;
        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);

            String sql = "update user_table set balance = balance - 100 where user=?";
            update(conn, sql, "AA");

            System.out.println(10 / 0);

            String sql1 = "update user_table set balance = balance  +100 where user=?";
            update(conn, sql1, "BB");

            System.out.println("转账成功");

            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                // 针对数据库连接池，恢复成自动提交
                conn.setAutoCommit(true);
            }
        } finally {
            JDBCUtils.closeResources(conn,null);
        }
    }


    // 增删改的通用操作(考虑事务)
    public void update(Connection conn, String sql, Object... args) {
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
            JDBCUtils.closeResources(null, ps);
        }
    }

    /**
     * 不同类查询一条记录，考虑事务
     */
    public <T> T getInstance(Connection conn, Class<T> clazz, String sql, Object... args) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }

            rs = ps.executeQuery();
            ResultSetMetaData rsmd = ps.getMetaData();
            int columnCount = rsmd.getColumnCount();
            if (rs.next()) {
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    String columnLabel = rsmd.getColumnLabel(i + 1);
                    Object columnValue = rs.getObject(i + 1);
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, columnValue);
                }
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(null, ps, rs);
        }
        return null;
    }

}

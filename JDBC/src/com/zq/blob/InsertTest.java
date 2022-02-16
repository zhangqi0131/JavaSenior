package com.zq.blob;

import com.zq.util.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @ClassName InsertTest.java
 * @Description TODO
 * @createTime 2022年02月16日 21:30  周三
 */
public class InsertTest {
    @Test
    public void testInsert1() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        long start = System.currentTimeMillis();
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into goods(name) values(?)";
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < 20000; i++) {
                ps.setObject(1, "name" +  i);
                ps.execute();
            }
            long end = System.currentTimeMillis();
            System.out.println("花费的时间为："+ (end-start)); // 21144(21s)
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(conn,ps);
        }
    }

    @Test
    public void testInsert2() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        long start = System.currentTimeMillis();
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into goods(name) values(?)";
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < 20000; i++) {
                ps.setObject(1, "name" + i);

                ps.addBatch();

                if (i % 500 == 0) {
                    ps.executeBatch();
                    ps.clearBatch();
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("花费的时间为："+ (end-start)); // 21144(21s) -- 1152
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(conn,ps);
        }
    }

    @Test
    public void testInsert3() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        long start = System.currentTimeMillis();
        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql = "insert into goods(name) values(?)";
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < 1000000; i++) {
                ps.setObject(1, "name" + i);

                ps.addBatch();

                if (i % 500 == 0) {
                    ps.executeBatch();
                    ps.clearBatch();
                }
            }
            conn.commit();
            long end = System.currentTimeMillis();
            System.out.println("花费的时间为："+ (end-start)); //20000:21144(21s) -- 1152  // 1000000:20s -- 5s

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(conn,ps);
        }
    }
}

package com.zq.preparedStatement.crud;

import com.zq.bean.Order;
import com.zq.util.JDBCUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.*;

public class OrderForQuery {

    @Test
    public void testCommonOrderQuery() {
        String sql = "select order_id orderId, order_name orderName, order_date orderDate from `order` where order_id=?";
        Order order = queryOrder(sql, 2);
        System.out.println(order);
    }

    // order表的通用查询方法
    public Order queryOrder(String sql, Object... args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }

            rs = ps.executeQuery();
            ResultSetMetaData rsmd = ps.getMetaData();
            int columnCount = rsmd.getColumnCount();
            if (rs.next()) {
                Order order = new Order();
                for (int i = 0; i < columnCount; i++) {
                    String columnLabel = rsmd.getColumnLabel(i + 1);
                    Object columnValue = rs.getObject(i + 1);
                    Field field = Order.class.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(order, columnValue);
                }
                return order;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(conn, ps, rs);
        }

        return null;
    }


    @Test
    public void testOrderQuery() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select order_id, order_name, order_date from `order` where order_id=?";
            ps = conn.prepareStatement(sql);

            ps.setObject(1, 1);
            rs = ps.executeQuery();

            if (rs.next()) {
                int orderId = rs.getInt(1);
                String orderName = rs.getString(2);
                Date date = rs.getDate(3);
                Order order = new Order(orderId, orderName, date);
                System.out.println(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(conn, ps, rs);
        }
    }
}

package com.zq.blob;

import com.zq.bean.Customer;
import com.zq.util.JDBCUtils;
import org.junit.Test;

import java.io.*;
import java.sql.*;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @ClassName BlobTest.java
 * @Description 使用PreparedStatement操作blob类型的数据
 * @createTime 2022年02月16日 13:10  周三
 */
public class BlobTest {
    @Test
    public void queryTest() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select id,name,email,birth,photo from customers where id=?";
            ps = conn.prepareStatement(sql);
            ps.setObject(1, 24);

            rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date birth = rs.getDate("birth");

                Customer cust = new Customer(id, name, email, birth);
                System.out.println(cust);

                // 将blob类型的字段下载到本地
                Blob photo = rs.getBlob("photo");
                is = photo.getBinaryStream();
                fos = new FileOutputStream(".\\src\\files\\ziluolan.webp");
                byte[] buffer = new byte[1024];
                int len;
                while ((len = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, len);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            JDBCUtils.closeResources(conn, ps, rs);
        }




    }

    /**
     * @throws
     * @title 向customers表中插入blob类型字段
     * @description
     * @author ZhangQi
     * @updateTime 2022/2/16 13:28
     */
    @Test
    public void insertTest() throws Exception {
        Connection conn = JDBCUtils.getConnection();
        String sql = "insert into customers(name,email,birth,photo) values(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setObject(1, "薇尔莉特");
        ps.setObject(2, "wei@163.com");
        ps.setObject(3, "1999-10-6");
        FileInputStream fis = new FileInputStream(".\\src\\files\\weier.webp");
        ps.setObject(4, fis);
        ps.execute();

        JDBCUtils.closeResources(conn, ps);
    }

}

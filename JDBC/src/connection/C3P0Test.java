package connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年02月18日 12:58  周五
 */
public class C3P0Test {

    @Test
    public void testGetConnection() throws SQLException, PropertyVetoException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&charsetEncoding=utf-8&rewriteBatchedStatements=true");
        cpds.setUser("root");
        cpds.setPassword("zq123");

        // 设置初始连接数
        cpds.setInitialPoolSize(10);

        Connection conn = cpds.getConnection();
        System.out.println(conn);
    }

    // 使用配置文件
    @Test
    public void testGetConnection2() throws SQLException {
        ComboPooledDataSource c3p0test = new ComboPooledDataSource("c3p0test");
        Connection conn = c3p0test.getConnection();
        System.out.println(conn);
    }
}

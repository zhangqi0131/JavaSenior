package connection.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年02月18日 17:24  周五
 */
public class JDBCUtils {


    /**
     * 使用c3p0连接池获取连接
     * @return
     * @throws SQLException
     */
    private static ComboPooledDataSource cpds = new ComboPooledDataSource("c3p0test");
    public static Connection getC3p0Connection() throws SQLException {
        Connection conn = cpds.getConnection();
        return conn;
    }

    /**
     * 使用DBCP连接池
     * @return
     * @throws Exception
     */
    private static DataSource source;
    static {
        try {
            Properties pros = new Properties();
            FileInputStream is = new FileInputStream("src/dbcp.properties");
            pros.load(is);

            source = BasicDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getDBCPConnection() throws Exception {

        Connection conn = source.getConnection();
        return conn;
    }


    /**
     * 使用druid连接池
     * @throws Exception
     */
    private static DataSource druidSource;
    static {
        Properties pros = new Properties();
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
        try {
            pros.load(is);
            druidSource = DruidDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection testGetDruidConnection() throws Exception {
        Connection conn = source.getConnection();
        return conn;
    }

    public static void closeResources(Connection conn, Statement ps, ResultSet rs) {
        try {
            if (conn != null) {
                conn.close();
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
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package connection;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description 测试DBCP的数据库连接池技术
 * @createTime 2022年02月21日 12:18  周一
 */
public class DBCPTest {

    @Test
    public void testGetConnection() throws SQLException {

        // 创建DBCP连接池
        BasicDataSource source = new BasicDataSource();

        // 设置基本信息
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&charsetEncoding=utf-8&rewriteBatchedStatements=true");
        source.setUsername("root");
        source.setPassword("zq123");

        source.setInitialSize(10);
        source.setMaxActive(10);

        Connection conn = source.getConnection();
        System.out.println(conn);
    }

    // 方式二：使用配置文件
    @Test
    public void testGetConnection2() throws Exception {
        Properties pros = new Properties();
        // 1.
        //InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("dbcp.properties");
        // 2.
        FileInputStream is = new FileInputStream("src/dbcp.properties");
        pros.load(is);

        DataSource source = BasicDataSourceFactory.createDataSource(pros);
        Connection conn = source.getConnection();
        System.out.println(conn);
    }
}

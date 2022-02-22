package dbUtils;

import com.zq.bean.Customer;
import connection.util.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年02月21日 22:00  周一
 */
public class QueryRunnerTest {

    // insert
    @Test
    public void testInsertQuery() {
        Connection conn = null;
        try {
            QueryRunner queryRunner = new QueryRunner();
            conn = JDBCUtils.getDBCPConnection();
            String sql = "insert into customers(name,email,birth) values(?,?,?)";
            int insertCount = queryRunner.update(conn, sql, "Jack", "Jack@123.com", "1999-9-7");
            System.out.println("添加了" + insertCount + "条数据");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        JDBCUtils.closeResources(conn,null,null);
    }

    // select
    @Test
    public void testSelectQuery() throws Exception {
        Connection conn = null;
        try {
            QueryRunner queryRunner = new QueryRunner();
            conn = JDBCUtils.testGetDruidConnection();
            String sql="select id,name,email,birth from customers where id=?";
            String sql1="select id,name,email,birth from customers where name=?";

            BeanHandler<Customer> beanHandler = new BeanHandler<>(Customer.class);
            BeanListHandler<Customer> beanListHandler = new BeanListHandler<>(Customer.class);
            Customer customer = queryRunner.query(conn, sql, beanHandler, 26);
            List<Customer> list = queryRunner.query(conn, sql1, beanListHandler, "Jack");

            System.out.println(customer);
            list.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(conn,null,null);
        }

    }
}

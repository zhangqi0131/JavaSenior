package DAO;

import com.zq.bean.Customer;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description 此接口用于规范针对Customer表的操作
 * @createTime 2022年02月17日 15:17  周四
 */
public interface CustomerDAO {

    /**
     * @description 将cust对象添加到数据库中
     * @param conn
     * @param cust
     */
    void insert(Connection conn, Customer cust);

    /**
     * @title
     * @description 针对指定的id，删除表中的一条记录
     * @author ZhangQi
     * @updateTime 2022/2/17 15:26 
     * @throws 
     */
    void deleteById(Connection conn, int id);

    /**
     * @title 
     * @description 修改数据库表中指定的记录
     * @author ZhangQi
     * @updateTime 2022/2/17 15:27 
     * @throws 
     */
    void update(Connection conn, Customer cust);

    /**
     * @title
     * @description 针对指定的id查询对应的customer
     * @author ZhangQi
     * @updateTime 2022/2/17 15:28
     * @throws
     */
    Customer getCustomerById(Connection conn, int id);

    /**
     * @description 查询表中所有记录构成的集合
     * @author ZhangQi
     * @updateTime 2022/2/17 16:11
     * @throws
     * @param conn
     * @return : null
     */
    List<Customer> getAll(Connection conn);

    /**
     * @description 返回数据表中数据的条目数
     * @author ZhangQi
     * @updateTime 2022/2/17 16:18
     * @throws 
     * @param  : null
     * @return : null
     */
    Long getCount(Connection conn);

    /**
     * @description 返回数据标准最大的生日
     * @author ZhangQi
     * @updateTime 2022/2/17 16:19
     * @throws 
     * @param  : null
     * @return : null
     */
    Date getMaxBirth(Connection conn);
}

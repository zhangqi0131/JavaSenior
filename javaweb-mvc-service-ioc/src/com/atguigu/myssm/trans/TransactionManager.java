package com.atguigu.myssm.trans;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月07日 22:13  周一
 */
public class TransactionManager {

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();



    //1.开启事务
    public void beginTransaction() throws SQLException {
        Connection conn = threadLocal.get();
        if (conn != null) {
            conn.setAutoCommit(false);
        }




    }

    //2.提交事务
    public void commit() {

    }

    //3.回滚
    public void rollback() {

    }
}

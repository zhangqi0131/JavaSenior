package com.zq.myblog.dao.impl;

import com.zq.myblog.dao.HostReplyDAO;
import com.zq.myblog.dao.myssm.basedao.BaseDAO;
import com.zq.myblog.pojo.HostReply;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月15日 15:40  周二
 */
public class HostReplyDAOImpl extends BaseDAO<HostReply> implements HostReplyDAO {

    /**
     * 根据replyId查询关联的HostReply实体
     *
     * @param replyId
     * @return
     */
    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return load("select * from t_host_reply where reply=?", replyId);
    }

    @Override
    public void delHostReply(Integer id) {
        super.executeUpdate("delete from t_host_reply where id=?", id);
    }

}

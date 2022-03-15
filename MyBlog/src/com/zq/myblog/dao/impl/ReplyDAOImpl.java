package com.zq.myblog.dao.impl;

import com.zq.myblog.dao.ReplyDAO;
import com.zq.myblog.dao.myssm.basedao.BaseDAO;
import com.zq.myblog.pojo.Reply;
import com.zq.myblog.pojo.Topic;

import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月15日 15:40  周二
 */
public class ReplyDAOImpl extends BaseDAO<Reply> implements ReplyDAO {
    /**
     * 获取指定日志的回复列表
     *
     * @param topic
     * @return
     */
    @Override
    public List<Reply> getReplyList(Topic topic) {
        return executeQuery("select * from t_reply where topic=?", topic.getId());
    }

    /**
     * 添加回复
     *
     * @param reply
     */
    @Override
    public void addReply(Reply reply) {
        executeUpdate("insert into t_reply values(0,?,?,?,?)", reply.getContent(), reply.getReplyDate(), reply.getAuthor().getId(), reply.getTopic().getId());

    }

    /**
     * 删除回复
     *
     * @param id
     */
    @Override
    public void delReply(Integer id) {
        executeUpdate("delete from t_reply where id=?", id);
    }

    /**
     * 根据id获取指定的reply
     *
     * @param id
     * @return
     */
    @Override
    public Reply getReply(Integer id) {
        return load("select * from t_reply where id=?", id);
    }

}

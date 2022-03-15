package com.zq.myblog.dao;

import com.zq.myblog.pojo.Reply;
import com.zq.myblog.pojo.Topic;

import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月09日 18:18  周三
 */
public interface ReplyDAO {

    /**
     * 获取指定日志的回复列表
     * @param topic
     * @return
     */
    List<Reply> getReplyList(Topic topic);

    /**
     * 添加回复
     * @param reply
     */
    void addReply(Reply reply);

    /**
     * 删除回复
     * @param id
     */
    void delReply(Integer id);

    /**
     * 根据id获取指定的reply
     * @param id
     * @return
     */
    Reply getReply(Integer id);

}

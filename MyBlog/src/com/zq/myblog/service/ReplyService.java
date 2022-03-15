package com.zq.myblog.service;

import com.zq.myblog.pojo.Reply;
import com.zq.myblog.pojo.Topic;

import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月15日 15:29  周二
 */
public interface ReplyService {

    /**
     * 根据topic的id获取关联的所有回复
     * @param topicId
     * @return
     */
    List<Reply> getReplyListByTopicId(Integer topicId);

    void addReply(Reply reply);

    void delReply(Integer id);

    /**
     * 删除指定的日志关联的所有回复
     * @param topic
     */
    void delReplyList(Topic topic);
}

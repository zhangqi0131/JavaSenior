package com.zq.myblog.service.impl;

import com.zq.myblog.dao.TopicDAO;
import com.zq.myblog.pojo.Reply;
import com.zq.myblog.pojo.Topic;
import com.zq.myblog.pojo.UserBasic;
import com.zq.myblog.service.ReplyService;
import com.zq.myblog.service.TopicService;
import com.zq.myblog.service.UserBasicService;

import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月09日 23:30  周三
 */
public class TopicServiceImpl implements TopicService {

    private TopicDAO topicDAO = null;
    /**
     * 此处引用replyService而不是replyDAO
     */
    private ReplyService replyService;

    private UserBasicService userBasicService;

    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }


    /**
     * @param id
     * @return
     */
    @Override
    public Topic getTopic(Integer id) {
        Topic topic = topicDAO.getTopic(id);
        UserBasic author = topic.getAuthor();
        author = userBasicService.getUserBasicById(author.getId());
        topic.setAuthor(author);
        return topic;
    }

    @Override
    public void delTopic(Integer id) {
        Topic topic = topicDAO.getTopic(id);
        if (topic != null) {
            replyService.delReplyList(topic);
            topicDAO.delTopic(topic);
        }
    }


    /**
     * 根据id获取特定topic
     *
     * @param id
     * @return
     */
    public Topic getTopicById(Integer id) {
        Topic topic = getTopic(id);
        List<Reply> replyList = replyService.getReplyListByTopicId(topic.getId());
        topic.setRepliyList(replyList);
        return topic;
    }
}

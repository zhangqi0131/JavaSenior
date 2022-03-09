package com.zq.myblog.dao.impl;

import com.zq.myblog.dao.TopicDAO;
import com.zq.myblog.pojo.Topic;
import com.zq.myblog.pojo.UserBasic;
import com.zq.myssm.basedao.BaseDAO;

import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月09日 22:52  周三
 */
public class TopicDAOImpl extends BaseDAO<Topic> implements TopicDAO {

    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return executeQuery("select * from t_topic where author=?", userBasic.getId());
    }

    @Override
    public void addTopic(Topic topic) {
        executeUpdate("insert into t_topic(title, content, topicDate, author) values(?,?,?,?)");
    }

    @Override
    public void delTopic(Topic topic) {

    }

    @Override
    public Topic getTopic(Integer id) {
        return null;
    }
}

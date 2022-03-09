package com.zq.myblog.dao;

import com.zq.myblog.pojo.Topic;
import com.zq.myblog.pojo.UserBasic;

import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月09日 18:11  周三
 */
public interface TopicDAO {
    //获取指定用户的日志列表
    public List<Topic> getTopicList(UserBasic userBasic);

    //添加日志
    public void addTopic(Topic topic);

    //删除日志
    public void delTopic(Topic topic);

    //获取特定日志信息
    Topic getTopic(Integer id);
}

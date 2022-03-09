package com.zq.myblog.service;

import com.zq.myblog.pojo.Topic;
import com.zq.myblog.pojo.UserBasic;

import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月09日 23:29  周三
 */
public interface TopicService {
    //查询特定用户的日志列表
    List<Topic> getTopicList(UserBasic userBasic);
}

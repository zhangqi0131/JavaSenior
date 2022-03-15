package com.zq.myblog.controller;

import com.zq.myblog.pojo.Topic;
import com.zq.myblog.pojo.UserBasic;
import com.zq.myblog.service.ReplyService;
import com.zq.myblog.service.TopicService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月15日 15:21  周二
 */
public class TopicController {

    private TopicService topicService;
    private ReplyService replyService;

    public String topicDetail(Integer id, HttpSession session) {

        Topic topic = topicService.getTopic(id);


        session.setAttribute("topic", topic);
        return "frames/detail";
    }

    public String delTopic(Integer topicId) {
        topicService.delTopic(topicId);
        return "redirect:topic.do?operate=getTopicList";
    }

    public String getTopicList(HttpSession session) {
        // 从session中获取当前用户信息
        UserBasic userBasic = (UserBasic) session.getAttribute("userBasic");

        // 再次查询当前用户关联的所有日志
        List<Topic> topicList = topicService.getTopicList(userBasic);

        // 设置关联的日志列表（之前session中关联的friend的topicList和此刻数据库中的不一样）
        userBasic.setTopicList(topicList);

        // 重新覆盖friend中的信息（main.html中页面迭代的是friend这个key中的数据）
        session.setAttribute("friend", userBasic);

        return "frames/main";
    }
}

package com.zq.myblog.controller;

import com.zq.myblog.pojo.Topic;
import com.zq.myblog.pojo.UserBasic;
import com.zq.myblog.service.TopicService;
import com.zq.myblog.service.UserBasicService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月09日 23:36  周三
 */
public class UserController {


    private UserBasicService userBasicService;
    private TopicService topicService;

    public String login(String loginId, String pwd, HttpSession session) {
        //1.登录验证
        UserBasic userBasic = userBasicService.login(loginId, pwd);
        if (userBasic != null) {
            List<UserBasic> friendsList = userBasicService.getFriendList(userBasic);
            List<Topic> topicList = topicService.getTopicList(userBasic);

            userBasic.setFriendsList(friendsList);
            userBasic.setTopicList(topicList);
            // 登录者的信息
            session.setAttribute("userBasic", userBasic);
            // 进入的是谁的空间
            session.setAttribute("friend", userBasic);
            return "index";
        } else {
            return "login";
        }
    }

    public String friend(Integer id, HttpSession session) {
        UserBasic currentFriend = userBasicService.getUserBasicById(id);
        List<Topic> topicList = topicService.getTopicList(currentFriend);
        currentFriend.setTopicList(topicList);

        session.setAttribute("friend", currentFriend);
        return "index";
    }
}

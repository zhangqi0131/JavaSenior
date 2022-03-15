package com.zq.myblog.controller;

import com.zq.myblog.pojo.Reply;
import com.zq.myblog.pojo.Topic;
import com.zq.myblog.pojo.UserBasic;
import com.zq.myblog.service.ReplyService;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月15日 22:03  周二
 */
public class ReplyController {

    private ReplyService replyService;

    public String addReply(String content, Integer topicId, HttpSession session) {
        UserBasic author = (UserBasic) session.getAttribute("userBasic");
        Reply reply = new Reply(content, new Date(), author, new Topic(topicId));

        replyService.addReply(reply);
         return "redirect:topic.do?operate=topicDetail&id=" + topicId;
    }

    public String delReply(Integer replyId, Integer topicId) {
        replyService.delReply(replyId);
        return "redirect:topic.do?operate=topicDetail&id=" + topicId;

    }
}

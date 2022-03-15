package com.zq.myblog.service.impl;

import com.zq.myblog.dao.ReplyDAO;
import com.zq.myblog.pojo.HostReply;
import com.zq.myblog.pojo.Reply;
import com.zq.myblog.pojo.Topic;
import com.zq.myblog.pojo.UserBasic;
import com.zq.myblog.service.HostReplyService;
import com.zq.myblog.service.ReplyService;
import com.zq.myblog.service.UserBasicService;

import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月15日 15:32  周二
 */
public class ReplyServiceImpl implements ReplyService {

    private ReplyDAO replyDAO;

    // 此处引用的是其他pojo对应的service接口，而不是DAO接口
    /**
     * 其他pojo对应的业务逻辑封装在service层，这里需要调用它的业务逻辑方法，而不是深入考虑它的内部细节
     */
    private HostReplyService hostReplyService;

    private UserBasicService userBasicService;

    public ReplyServiceImpl() {
    }

    /**
     * 根据topic的id获取关联的所有回复
     *
     * @param topicId
     * @return
     */
    @Override
    public List<Reply> getReplyListByTopicId(Integer topicId) {
        List<Reply> replyList = replyDAO.getReplyList(new Topic(topicId));
        for (int i = 0; i < replyList.size(); i++) {
            Reply reply = replyList.get(i);

            // 1.将关联的作者设置进去
            Integer id = reply.getAuthor().getId();
            UserBasic author = userBasicService.getUserBasicById(id);
            reply.setAuthor(author);

            // 2.将关联的HostReply设置进去
            HostReply hostReply = hostReplyService.getHostReplyByReplyId(reply.getId());
            reply.setHostReply(hostReply);

        }

        return replyList;
    }

    @Override
    public void addReply(Reply reply) {
        replyDAO.addReply(reply);
    }

    @Override
    public void delReply(Integer id) {
        Reply reply = replyDAO.getReply(id);

        if (reply != null) {

            HostReply hostReply = hostReplyService.getHostReplyByReplyId(reply.getId());
            if (hostReply != null) {
                hostReplyService.delHostReply(hostReply.getId());
            }
            replyDAO.delReply(id);
        }

    }

    /**
     * 删除指定的日志关联的所有回复
     *
     * @param topic
     */
    @Override
    public void delReplyList(Topic topic) {
        List<Reply> replyList = replyDAO.getReplyList(topic);
        if (replyList != null) {
            for (Reply reply : replyList) {
                delReply(reply.getId());
            }
        }
    }


}

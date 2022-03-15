package com.zq.myblog.service.impl;

import com.zq.myblog.dao.HostReplyDAO;
import com.zq.myblog.pojo.HostReply;
import com.zq.myblog.service.HostReplyService;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月15日 15:37  周二
 */
public class HostReplyServiceImpl implements HostReplyService {

    private HostReplyDAO hostReplyDAO;
    /**
     * @param replyId
     * @return
     */
    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return hostReplyDAO.getHostReplyByReplyId(replyId);
    }

    @Override
    public void delHostReply(Integer id) {
        hostReplyDAO.delHostReply(id);
    }
}

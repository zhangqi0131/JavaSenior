package com.zq.myblog.service;

import com.zq.myblog.pojo.HostReply;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月15日 15:36  周二
 */
public interface HostReplyService {
    /**
     *
     * @param replyId
     * @return
     */
    HostReply getHostReplyByReplyId(Integer replyId);

    void delHostReply(Integer id);

}

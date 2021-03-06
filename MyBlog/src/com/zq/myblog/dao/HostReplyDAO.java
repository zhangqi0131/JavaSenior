package com.zq.myblog.dao;

import com.zq.myblog.pojo.HostReply;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月09日 18:25  周三
 */
public interface HostReplyDAO {
    /**
     * 根据replyId查询关联的HostReply实体
     * @param replyId
     * @return
     */
    HostReply getHostReplyByReplyId(Integer replyId);

    void delHostReply(Integer id);
}

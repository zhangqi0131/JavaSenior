package com.zq.myblog.pojo;

import java.util.Date;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月09日 12:38  周三
 */
public class Reply {
    private Integer id;
    private String content;
    private Date replyDate;
    private UserBasic author; //N:1
    private Topic topic; //N:1

    private HostReply hostReply; //1:1

    public Reply(Integer id) {
        this.id = id;
    }

    public Reply() {

    }

    public Reply(String content, Date replyDate, UserBasic author, Topic topic) {
        this.content = content;
        this.replyDate = replyDate;
        this.author = author;
        this.topic = topic;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public UserBasic getAuthor() {
        return author;
    }

    public void setAuthor(UserBasic author) {
        this.author = author;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public HostReply getHostReply() {
        return hostReply;
    }

    public void setHostReply(HostReply hostReply) {
        this.hostReply = hostReply;
    }
}

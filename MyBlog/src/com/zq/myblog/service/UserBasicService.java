package com.zq.myblog.service;

import com.zq.myblog.pojo.UserBasic;

import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月09日 23:09  周三
 */
public interface UserBasicService {
    UserBasic login(String loginId, String pwd);

    List<UserBasic> getFriendList(UserBasic userBasic);

    UserBasic getUserBasicById(Integer id);
}

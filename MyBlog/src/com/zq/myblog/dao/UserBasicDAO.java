package com.zq.myblog.dao;

import com.zq.myblog.pojo.UserBasic;

import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月09日 18:08  周三
 */
public interface UserBasicDAO {
    //根据账号和密码获取特定信息
    public UserBasic getUserBasic(String loginId, String pwd);


    //获取指定用户的好友列表
    public List<UserBasic> getUserBasicList(UserBasic userBasic);

    //根据id查询信息
    UserBasic getUserBasicById(Integer id);
}

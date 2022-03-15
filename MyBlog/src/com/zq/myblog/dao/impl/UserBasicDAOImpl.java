package com.zq.myblog.dao.impl;

import com.zq.myblog.dao.UserBasicDAO;
import com.zq.myblog.pojo.UserBasic;
import com.zq.myblog.dao.myssm.basedao.BaseDAO;

import java.util.List;

/**
 * @author ZhangQi
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月09日 18:25  周三
 */
public class UserBasicDAOImpl extends BaseDAO<UserBasic> implements UserBasicDAO {
    @Override
    public UserBasic getUserBasic(String loginId, String pwd) {
        return load("select * from t_user_basic where loginId=? and pwd=?", loginId, pwd);
    }

    @Override
    public List<UserBasic> getUserBasicList(UserBasic userBasic) {
        String sql="select fid AS id from t_friend where uid =?";
        return executeQuery(sql, userBasic.getId());
    }

    @Override
    public UserBasic getUserBasicById(Integer id) {
        return load("select * from t_user_basic where id=?", id);
    }
}

package com.zq.project_3.team.service;

/**
 * @program: JavaSenior
 * @description: 自定义异常类
 * @author: Zhang.Qi
 * @create: 2021-05-04 10:38
 **/

public class TeamException extends Exception {
    static final long serialVersionUID = -489473589345738L;

    public TeamException() {
    }

    public TeamException(String msg) {
        super(msg);
    }


}

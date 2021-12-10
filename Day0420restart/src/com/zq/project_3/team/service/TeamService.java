package com.zq.project_3.team.service;

import com.zq.project_3.team.domain.Architect;
import com.zq.project_3.team.domain.Designer;
import com.zq.project_3.team.domain.Employee;
import com.zq.project_3.team.domain.Programmer;

/**
 * @program: JavaSenior
 * @description: 关于开发团队成员的管理，添加，删除等
 * @author: Zhang.Qi
 * @create: 2021-05-04 15:12
 **/

public class TeamService {

    private static int counter = 1; //给memberId赋值使用

    private final int MAX_MEMBER = 5; //显示开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER]; //保存开发团队人员
    private int total = 0; //记录开发团中实际人数


    public TeamService() {
    }


    /**
     * 获取开发团队中的所有成员
     * @return
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team; //返回的是局部变量的team
    }


    /**
     * 将指定的员工添加到开发团队中
     * @param e
     */
    public void addMember(Employee e) throws TeamException {
        //成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }

        //该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        //该员工已在开发团队中
        if (isExist(e)) {
            throw new TeamException("该员工已在开发团队中，无法添加");
        }


        //该员工已是某团队成员

        //该员工正在休假，无法添加
        Programmer p = (Programmer)e; //一定不会出现类型转换异常

//        if (p.getStatus().getNAME().equals("BUSY"));
        if ("BUSY".equals(p.getStatus().getNAME())) { //这样写避免出现空指针
            throw new TeamException("该员工已是某团队成员");
        } else if ("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())) {
            throw new TeamException("该员工正在休假，无法添加");
        }

        //团队中至多只能有一名架构师
        //团队中至多只能有两名设计师
        //团队中至多只能有三名程序员

        //获取team已有成员中架构师、设计师、程序员的人数
        int numOfArchitect = 0, numOfDesigner = 0, numOfProgrammer = 0;

        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArchitect++;
            } else if (team[i] instanceof Designer) {
                numOfDesigner++;
            } else if (team[i] instanceof Programmer) {
                numOfProgrammer++;
            }
        }

        if (p instanceof Architect) {
            if (numOfArchitect >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (numOfDesigner >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if (p instanceof Programmer) {
            if (numOfProgrammer >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        //将p（或e）添加到现有的队伍中
        team[total++] = p;
        //p的属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);

    }


    /**
     * 判断指定的员工是否已经存在于现有的开发团队中
     * @param e
     * @return
     */
    private boolean isExist(Employee e) {

        for (int i = 0; i < total; i++) {

            return team[i].getId() == e.getId();

        }
        return false;
    }

    /**
     * 从团队中删除成员
     * @param memberId
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        //未找到指定memberId的情况
        if (i == total) {
            throw new TeamException("找不到指定的memberId员工，删除失败");
        }


        //方式一
//        for (int j = i + 1; j < total; j++) {
//            team[j - 1] = team[j];
//        }

        //方式二
        for (int j = i; j < total - 1; j++) {
            team[j] = team[j + 1];
        }

        team[total - 1] = null;
        total--;

// 或   team[--total - 1] = null;

    }

}

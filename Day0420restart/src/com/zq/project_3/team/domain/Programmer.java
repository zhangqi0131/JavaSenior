package com.zq.project_3.team.domain;

import com.zq.project_3.team.service.Status;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-03 22:12
 **/

public class Programmer extends Employee{
    private int memberId;   //开发团队中的id
    private Status status = Status.FREE;
    private Equipment equipment;


    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.getDetails() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }

    public String getTeamBase() {
        return memberId + "/"  + getId() + "\t\t" + getName() + "\t" + getAge() + "\t\t" + getSalary() + "\t";
    }

    public String getDetailsForTeam() {
        return getTeamBase() + "程序员";
    }
}

package com.zq.project_3.team.service;

import com.zq.project_3.team.domain.*;

import static com.zq.project_3.team.service.Data.*;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-03 22:32
 **/

public class NameListService {
    private Employee[] employees;

    /**
     * 给employees数组及数组元素进行初始化
     */
    public NameListService() {
        //1.根据项目提供的Data类构建相应大小的employees数组
        //2.再根据Data类中的数据构建不同的对象，包括Employee，Programmer，Designer，Architect
        //3.将对象存于数组中
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            //获取员工的类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);

            //获取Employee的4个基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;
            double bonus;
            int stock;

            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = creatEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    /**
     * 获取指定index上的员工的设备
     * @param index
     * @return
     */
    private Equipment creatEquipment(int index) {
        int key = Integer.parseInt(EQUIPMENTS[index][0]);

        String modelOrName = EQUIPMENTS[index][1];
        switch (key) {
            case PC: //21
                String display = EQUIPMENTS[index][2];
                return new PC(modelOrName, display); //model 和 display
            case NOTEBOOK: //22
                double price = Double.parseDouble(EQUIPMENTS[index][2]);
                return new Notebook(modelOrName, price);
            case PRINTER: //23
                String type = EQUIPMENTS[index][2];
                return new Printer(modelOrName, type);
        }
        return null;
    }


    /**
     * 获取当前所有员工
     * @return
     */
    public Employee[] getAllEmployees() {
        return employees;
    }


    /**
     * 获取指定ID的员工对象
     * @param id
     * @return
     */
    public Employee getEmployee(int id) throws TeamException {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }
}

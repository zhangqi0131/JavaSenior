package com.zq.project_3.team.junit;

import com.zq.project_3.team.domain.Employee;
import com.zq.project_3.team.service.NameListService;
import com.zq.project_3.team.service.TeamException;
import org.junit.Test;

/**
 * @program: JavaSenior
 * @description:
 * @author: Zhang.Qi
 * @create: 2021-05-04 10:45
 **/

public class NameListServiceTest {

    @Test
    public void testGetAllEmployees() {
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);

        }

    }

    @Test
    public void testGetEmployee() {
        NameListService service = new NameListService();

        int id = 100;
        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);

        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }

    }

}

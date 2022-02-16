package com.zq.exer;

import com.zq.util.JDBCUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.Scanner;

public class Exer2Test {

    /**
     * 通过准考证号删除指定的学生
     */
    @Test
    public void testDeleteByExamCard() {
        System.out.println("输入准考证号：");
        Scanner scanner = new Scanner(System.in);
        String examCard = scanner.next();
        String sql = "select FlowID flowID, Type type, IDCard, ExamCard examCard, StudentName name, Location location, Grade grade from examstudent where examCard=?";

        Student student = getInstance(Student.class, sql, examCard);
        if (student != null) {
            sql = "delete from examstudent where examCard=?";
            int count = update(sql, examCard);
            if (count > 0) {
                System.out.println("删除成功");
            }
        } else {
            System.out.println("该学生不存在");
        }
    }

    @Test
    public void testDeleteByExamCard1() {
        System.out.println("输入准考证号：");
        Scanner scanner = new Scanner(System.in);
        String examCard = scanner.next();

        String sql = "delete from examstudent where examCard=?";
        int count = update(sql, examCard);
        if (count > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("该学生不存在");
        }
    }



    /**
     * @title 1.向examstudent中添加一条记录
     * @description
     * @author ZhangQi
     * @updateTime 2022/2/16 13:19
     * @throws
     */
    @Test
    public void testUpdate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("4/6级：");
        int type = scanner.nextInt();
        System.out.print("身份证号：");
        String IDCard = scanner.next();
        System.out.print("准考证号：");
        String examCard = scanner.next();
        System.out.print("姓名：");
        String studentName = scanner.next();
        System.out.print("所在城市：");
        String location = scanner.next();
        System.out.print("考试成绩：");
        int grade = scanner.nextInt();

        String sql = "insert into examstudent(type,IDCard,examCard,studentName,location,grade) values(?,?,?,?,?,?)";
        int insertCount = update(sql, type, IDCard, examCard, studentName, location, grade);
        if (insertCount > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }

    }

    // 1.通用的增删改操作
    public int update(String sql, Object... args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            //ps.execute();
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(conn, ps);
        }
        return 0;
    }

    @Test
    public void QueryWithIDCardOrExamCard() {
        System.out.println("选择要输入的类型");
        System.out.println("a.准考证号");
        System.out.println("b.身份证号");
        Scanner scanner = new Scanner(System.in);
        String selection = scanner.next();
        if ("a".equalsIgnoreCase(selection)) {
            System.out.print("输入准考证号：");
            String examCard = scanner.next();
            String sql = "select FlowID flowID, Type type, IDCard, ExamCard examCard, StudentName name, Location location, Grade grade from examstudent where examCard=?";
            Student student = getInstance(Student.class, sql, examCard);
            if (student != null) {
                System.out.println(student);
            } else {
                System.out.println("学生不存在，重新输入");
            }
        } else if ("b".equalsIgnoreCase(selection)) {
            System.out.print("输入身份证号：");
            String IDCard = scanner.next();
            String sql = "select FlowID flowID, Type type, IDCard, ExamCard examCard, StudentName name, Location location, Grade grade from examstudent where IDCard=?";
            Student student = getInstance(Student.class, sql, IDCard);
            if (student != null) {
                System.out.println(student);
            } else {
                System.out.println("学生不存在，重新输入");
            }
        } else {
            System.out.println("输入有误，重新进入程序");
        }


    }

    /**
     * 不同类查询一条记录
     * 2.根据身份证号或者准考证号查询学生信息
     */
    public <T> T getInstance(Class<T> clazz, String sql, Object... args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }

            rs = ps.executeQuery();
            ResultSetMetaData rsmd = ps.getMetaData();
            int columnCount = rsmd.getColumnCount();
            if (rs.next()) {
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    String columnLabel = rsmd.getColumnLabel(i + 1);
                    Object columnValue = rs.getObject(i + 1);
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, columnValue);
                }
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(conn, ps, rs);
        }
        return null;
    }
}

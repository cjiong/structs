package com.cj.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cj.model.Student;

public class StudentDao extends SuperDao {

	public boolean addStudent(Student student) {
        StringBuffer sql = new StringBuffer();
        sql.append(" insert into Student (message_number,message_name,message_sex,message_birthday,message_department)"
                + " values (?,?,?,?,?)");
        try {
            ps = connnection.prepareStatement(sql.toString());
            ps.setInt(1, student.getStu_number());
            ps.setString(2, student.getStu_name());
            ps.setString(3, student.getStu_sex());
            ps.setString(4, student.getStu_birthday());
            ps.setString(5, student.getStu_department());
            int i = ps.executeUpdate();
            if (i == 0) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.destoryResource();
        }
        return false;
    }
	
	public boolean deleteStudent(int number) {
        StringBuffer sql = new StringBuffer();
        sql.append("delete from Student where studentNumber = ? ");
        try {
            ps = connnection.prepareStatement(sql.toString());
            ps.setInt(1, number);
            int i = ps.executeUpdate();
            if (i == 0) {
                return false;
            }else {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.destoryResource();
        }
        return false;
    }
	
	
	public boolean updateStudent(Student student) {
        StringBuffer sql = new StringBuffer();
        sql.append("update Student set studentName = ?,studentSex = ?,studentBirthday = ?,studentDepartment = ?"
                + " where studentNumber = ?");
        try {
            ps = connnection.prepareStatement(sql.toString());
            ps.setString(1, student.getStu_name());
            ps.setString(2, student.getStu_sex());
            ps.setString(3, student.getStu_birthday());
            ps.setString(4, student.getStu_department());
            ps.setInt(5, student.getStu_number());
            int i = ps.executeUpdate();
            if (i == 0) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.destoryResource();
        }
        return false;
    }
	
	public List<Student> selectStudent(int number) {
        StringBuffer sql = new StringBuffer();
        sql.append("select * from Student where studentNumber = ?");
        List<Student> studentList = new ArrayList<Student>();
        try {
            ps = connnection.prepareStatement(sql.toString());
            ps.setInt(1, number);
            rs = ps.executeQuery();
            while (rs.next()) {
            	Student student = new Student();
            	student.setStu_number(rs.getInt("studentNumber"));
            	student.setStu_name(rs.getString("studentName"));
            	student.setStu_sex(rs.getString("studentSex"));
            	student.setStu_birthday(rs.getString("studentBirthday"));
            	student.setStu_department(rs.getString("studentDepartment"));
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.destoryResource();
        }
        return studentList;
    }
    
    
    public List<Student> selectStudent() {
        StringBuffer sql = new StringBuffer();
        sql.append("select * from messages");
        List<Student> studentList = new ArrayList<Student>();
        try {
            ps = connnection.prepareStatement(sql.toString());
            rs = ps.executeQuery();
            while (rs.next()) {
            	Student student = new Student();
            	student.setStu_number(rs.getInt("studentNumber"));
            	student.setStu_name(rs.getString("studentName"));
            	student.setStu_sex(rs.getString("studentSex"));
            	student.setStu_birthday(rs.getString("studentBirthday"));
            	student.setStu_department(rs.getString("studentDepartment"));
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.destoryResource();
        }
        return studentList;
    }
}

package com.cj.dao;

import java.sql.SQLException;

import com.cj.model.*;

public class RegisterDao extends SuperDao {

	public boolean writeStudent(User user) {
        if(!existUser(user.getUsername())) {
            StringBuffer sql = new StringBuffer();
            sql.append("insert into user (username, userpassword) values (?, ?)");
            try {
                ps = connnection.prepareStatement(sql.toString());
                ps.setString(1, user.getUsername());
                ps.setString(2, user.getUserpassword());
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
        } else {
            return false;
        }
        return false;
    }
    
 
    public boolean existUser(String username) {
        StringBuffer sql = new StringBuffer();
        sql.append("select username from user where username = ?");
        try {
            ps = connnection.prepareStatement(sql.toString());
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;    //数据库已经存在该学生
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.psClose();
        }
        return true;
    }
}

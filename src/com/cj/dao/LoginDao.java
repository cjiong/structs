package com.cj.dao;

import java.sql.SQLException;

import com.cj.model.User;

public class LoginDao extends SuperDao{

	public boolean checkLegal(User user) {
        StringBuffer sql = new StringBuffer();
        sql.append("select * from User where username = ? and userpassword = ?");
        try {
            ps = connnection.prepareStatement(sql.toString());
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getUserpassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.destoryResource();
        }
        return false;
    }
}

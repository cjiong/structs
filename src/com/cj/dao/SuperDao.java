package com.cj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cj.dbconnection.DBConnection;;

public class SuperDao {

	protected Connection connnection = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	
	protected SuperDao() {
	    this.connnection = new DBConnection().getConnnection();
	}
	
	protected void psClose() {
	    try {
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	protected void destoryResource() {
		if (rs != null) {
			try {
				rs.close();
				rs = null;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
				ps = null;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		if (connnection != null) {
			try {
				connnection.close();
				connnection = null;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

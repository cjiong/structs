package com.cj.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private Connection connection = null;
    private static final String driverClassName = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/SIMS";
    private static final String user = "root";
    private static final String password = "root";

    public DBConnection() {
        try {
            Class.forName(driverClassName);
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnnection() {
        return connection;
    }
    
}

package com.aviraj0403;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	 private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	 private static final String USERNAME = "System";
	 private static final String PASSWORD = "834";
    static {
        try {
            // Load the MySQL JDBC driver
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
    	System.out.println("Connection Build");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

}

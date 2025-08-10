package com.busreservation.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/busbooking";
    private static final String USER = "root";
    private static final String PASSWORD = "srisai16112005"; // Your MySQL password

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Database driver not found", e);
        }
    }

    public static void main(String[] args) {
        // Test the connection
        try {
            Connection conn = getConnection();
            System.out.println("Database connected successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Connection failed! " + e.getMessage());
        }
    }
}
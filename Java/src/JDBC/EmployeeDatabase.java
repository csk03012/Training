package JDBC;

import java.sql.*;

public class EmployeeDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://@localhost:3306";
        String user = "root";
        String pass = "Csk03012@";

        try(Connection connection = DriverManager.getConnection(url, user, pass)) {
            try (Statement statement = connection.createStatement()) {
                String sql = "CREATE DATABASE Employee";
                statement.executeUpdate(sql);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


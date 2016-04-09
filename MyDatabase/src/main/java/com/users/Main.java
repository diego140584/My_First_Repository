package com.users;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created by Stas on 06.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        final String URL = "jdbc:mysql://localhost:3306/testdb2?useSSL=false";
        final String PASSWORD = "root";
        final String USER = "root";
        Users users1 = new Users("John", "Jennings", 30);
        Users users2 = new Users("Tom", "Jennings", 28);
        Users users3 = new Users("Jessie", "James", 32);
        String query = "INSERT INTO testdb2.users VALUES(?,?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Get connection to database!");
            } else {
                System.out.println("Fail...");
            }
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, users1.getFirstName());
            preparedStatement.setString(3, users1.getLastName());
            preparedStatement.setInt(4, users1.getAge());
            preparedStatement.execute();
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, users2.getFirstName());
            preparedStatement.setString(3, users2.getLastName());
            preparedStatement.setInt(4, users2.getAge());
            preparedStatement.execute();
            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, users3.getFirstName());
            preparedStatement.setString(3, users3.getLastName());
            preparedStatement.setInt(4, users3.getAge());
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
